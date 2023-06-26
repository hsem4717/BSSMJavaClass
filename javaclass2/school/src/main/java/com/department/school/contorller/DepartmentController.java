package com.department.school.contorller;

import com.department.school.contorller.dto.SaveDepartmentRequestDto;
import com.department.school.contorller.dto.UpdateStudentRequestDto;
import com.department.school.domain.Department;
import com.department.school.service.DepartmentService;
import com.department.school.service.StudentService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@AllArgsConstructor
@RestController
public class DepartmentController {
    private final DepartmentService departmentService;
    private final StudentService studentService;

    @PostMapping("/api/departments")
    public Long createDept(@RequestBody SaveDepartmentRequestDto requestDto){
        return departmentService.save(requestDto);

    }
    @GetMapping("/api/departments")
    public List<Department> readAll(){
        return departmentService.findAll();
    }

    @PutMapping("/api/departments/{id}")
    public Long update(@PathVariable Long id, @RequestBody SaveDepartmentRequestDto requestDto){
        return departmentService.update(id, requestDto);
    }

    @PutMapping("/api/students/{id}")
    public Long update(@PathVariable Long id, @RequestBody UpdateStudentRequestDto requestDto){
        return studentService.update(id, requestDto);
    }



}
