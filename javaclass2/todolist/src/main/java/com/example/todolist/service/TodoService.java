package com.example.todolist.service;

import com.example.todolist.controller.Dto.TodoRequestDto;
import com.example.todolist.controller.Dto.TodoResponseDto;
import com.example.todolist.domain.TodoEntity;
import com.example.todolist.repository.TodoRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class TodoService {
    private final TodoRepository todoRepository;

    @Transactional
    public Long save(TodoRequestDto requestDto) {
        return todoRepository.save(requestDto.toEntity()).getId();
    }
    @Transactional(readOnly = true)
    public List<TodoResponseDto> findAll() {
        List<TodoEntity> result = todoRepository.findAll();
        List<TodoResponseDto> responseDtos = result.stream().map(TodoResponseDto::new).collect(Collectors.toList());

        return responseDtos;
    }
    @Transactional(readOnly = true)
    public TodoResponseDto findById(Long id) {
        Optional<TodoEntity> entity= todoRepository.findById(id);
        return new TodoResponseDto(entity.orElse(new TodoEntity()));
    }

    @Transactional
    public Long update(Long id, TodoRequestDto requestDto) {
        //id로 값 찾기
        TodoEntity entity= todoRepository.findById(id).orElse(new TodoEntity());
        //dto 내용으로 바꾸기
        return entity.updateData(requestDto);
    }

    public void deleteAll() {
        todoRepository.deleteAll();
    }

    public void deleteOne(Long id) {
        todoRepository.findById(id);
        todoRepository.deleteById(id);
    }
}
