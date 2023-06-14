package com.choi.book.springboot.service;

import com.choi.book.springboot.domain.posts.Posts;
import com.choi.book.springboot.domain.posts.PostsRepository;
import com.choi.book.springboot.web.dto.PostsListResponseDto;
import com.choi.book.springboot.web.dto.PostsResponseDto;
import com.choi.book.springboot.web.dto.PostsSaveRequestDto;
import com.choi.book.springboot.web.dto.PostsUpdateRequestDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@RequiredArgsConstructor
@Service
public class PostsService {
    private final PostsRepository postsRepository;

    @Transactional
    public Long save(PostsSaveRequestDto requestDto) {
        return postsRepository.save(requestDto.toEntity()).getId();
    }

    @Transactional(readOnly = true)
    public PostsResponseDto findById(Long id) {
        Posts posts = postsRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("해당 글이 없습니다."));
        return new PostsResponseDto(posts);
    }

    @Transactional
    public Long update(Long id, PostsUpdateRequestDto requestDto) {
        //id값에 해당하는 엔티티 검색
        Posts posts = postsRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("해당 글이 없습니다."));
        //수정
        posts.update(requestDto.getContent(), requestDto.getTitle());

        return posts.getId();
    }

    public List<PostsListResponseDto> findAllDesc() {
        List<Posts> allDesc = postsRepository.findAllDesc();
        List<PostsListResponseDto> result = new ArrayList<>();

        for (Posts posts : allDesc) {
            result.add(new PostsListResponseDto(posts));
        }
        return result;
    }

    public void delete(Long id) {
        postsRepository.deleteById(id);
    }
}
