package com.choi.book.springboot2.web;

import com.choi.book.springboot2.domain.posts.Posts;
import com.choi.book.springboot2.domain.posts.PostsRepository;
import com.choi.book.springboot2.web.dto.PostsSaveRequestDto;
import com.choi.book.springboot2.web.dto.PostsUpdateRequestDto;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.test.web.server.LocalServerPort;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class PostsApiControllerTest {
    @LocalServerPort
    private int port;

    @Autowired
    private TestRestTemplate restTemplate;

    @Autowired
    private PostsRepository postsRepository;

    @Test
    public void 등록하기() throws Exception{
        //given
        PostsSaveRequestDto requestDto = PostsSaveRequestDto.builder()
                .title("title")
                .content("content")
                .author("author")
                .build();

        String url = "http://localhost:"+port+"/api/v1/posts";

        //when
        ResponseEntity<Long> responseEntity = restTemplate
                .postForEntity(url, requestDto, Long.class);
        //then 비교분석
        assertEquals(responseEntity.getStatusCode(), HttpStatus.OK);
        List<Posts> all = postsRepository.findAll();
        assertEquals(all.get(0).getTitle(), "title");
        assertEquals(all.get(0).getContent(), "content");
    }

    @Test
    public void 수정하기() throws Exception{
        //given
        //1. save
        등록하기();
        //2. update를 위한 객체 생성
        PostsUpdateRequestDto requestDto = PostsUpdateRequestDto.builder()
                .title("hello")
                .content("hello java world")
                .build();
        String url = "http://localhost:" + port + "/api/v1/posts/1";
        HttpEntity<PostsUpdateRequestDto> requestEntity = new HttpEntity<>(requestDto);
        //when
        //1. 적용
        ResponseEntity<Long> responseEntity = restTemplate
                .exchange(url, HttpMethod.PUT, requestEntity, Long.class);
        //then
        //1. 비교분석
        assertEquals(responseEntity.getStatusCode(), HttpStatus.OK);
        List<Posts> all = postsRepository.findAll();
        assertEquals(all.get(0).getTitle(), "hello");
        assertEquals(all.get(0).getContent(), "hello java world");
    }
}