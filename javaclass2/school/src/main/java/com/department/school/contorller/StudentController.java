package com.department.school.contorller;

import com.department.school.contorller.dto.SaveStudentRequestDto;
import com.department.school.domain.Department;
import com.department.school.domain.Student;
import com.department.school.service.StudentService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@AllArgsConstructor
@RestController
public class StudentController {
    private final StudentService studentService;

    @PostMapping("/api/students")
    public Long createStudent(@RequestBody SaveStudentRequestDto requestDto){
        return studentService.save(requestDto);
    }
    @GetMapping("/api/students")
    public List<Student> readAll(){
        return studentService.findAll();
    }
    @GetMapping("/api/students/dept/{id}")
    public List<Student> readByAllDept(@PathVariable("id") Long departmentId){
        return studentService.findByDept(departmentId);
    }
}
