package com.choi.book.springboot.web.dto;

import com.choi.book.springboot.domain.posts.Posts;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Getter
@NoArgsConstructor
public class PostsListResponseDto {
    private Long id;
    private String title;
    private String author;
    private LocalDateTime modifiedDate;
    //domain -> dto
    public PostsListResponseDto(Posts posts) {
        this.id = posts.getId();
        this.title = posts.getTitle();
        this.author = posts.getAuthor();
        this.modifiedDate = posts.getModifiedDate();
    }
}
