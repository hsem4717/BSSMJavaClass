package com.example.todolist.domain;

import com.example.todolist.controller.Dto.TodoRequestDto;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Getter
@NoArgsConstructor
@Entity //DB에 table로 들어감 JPA
public class TodoEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(length = 200)
    private String content;
    @Column(nullable = false)
    private Boolean completed;

    @Builder
    public TodoEntity(String content, Boolean completed) {
        this.content = content;
        this.completed = completed;
    }

    public Long updateData(TodoRequestDto requestDto){
        this.content = requestDto.getContent();
        this.completed = requestDto.getCompleted();
        return this.id;
    }
}
