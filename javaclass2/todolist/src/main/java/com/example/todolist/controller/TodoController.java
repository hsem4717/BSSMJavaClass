package com.example.todolist.controller;

import com.example.todolist.controller.Dto.TodoRequestDto;
import com.example.todolist.controller.Dto.TodoResponseDto;
import com.example.todolist.service.TodoService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController //Response + Controller
@AllArgsConstructor // final 초기화
public class TodoController {

    private final TodoService todoService;

    @PostMapping("/todo/api")
    public Long create(@RequestBody TodoRequestDto requestDto){ //@RequestBody: 객체 받아오기
        return todoService.save(requestDto);
    }

    @GetMapping("todo/api")
    public List<TodoResponseDto> readAll(){
        return todoService.findAll();
    }

    @GetMapping("/todo/api/{id}")
    public  TodoResponseDto readOne(@PathVariable Long id){
        return todoService.findById(id);
    }

    @PutMapping("/todo/api/{id}") // post+get
    public Long update(@PathVariable Long id, @RequestBody TodoRequestDto requestDto){
        return todoService.update(id, requestDto);
    }
    @DeleteMapping("/todo/api")
    public void deleteAll(){
        todoService.deleteAll();
    }
    @DeleteMapping("/todo/api/{id}")
    public void deleteOne(@PathVariable Long id){
        todoService.deleteOne(id);
    }


}
