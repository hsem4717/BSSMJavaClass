package com.example.todolist.repository;

import com.example.todolist.domain.TodoEntity;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class TodoRepositoryTest {
    @Autowired
    private TodoRepository todoRepository;

    @AfterEach
    public void 초기화(){
        todoRepository.deleteAll();
    }

    @Test
    public void 저장테스트(){
        //값 저장
        //1-1. 엔티티 생성
        TodoEntity entity = TodoEntity.builder()
                .content("a content")
                .completed(false)
                .build();// build 생성우 값 생성

        todoRepository.save(entity);
        //저장 값 호출
        List<TodoEntity> all =   todoRepository.findAll();
        //저장 값과 저장할 값 비교
        assertEquals(all.get(0).getContent(), "a content");
    }
}