package com.example.todolist.controller.Dto;

import com.example.todolist.domain.TodoEntity;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class TodoRequestDto {
    private String content;
    private Boolean completed;

    public TodoEntity toEntity(){
        return TodoEntity.builder()
                .content(this.content)
                .completed(this.completed)
                .build();
    }
}
