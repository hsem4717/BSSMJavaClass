package com.department.school.contorller;

import com.department.school.contorller.dto.SaveDepartmentRequestDto;
import com.department.school.domain.Department;
import com.department.school.service.DepartmentService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@AllArgsConstructor
@RestController
public class DepartmentController {
    private final DepartmentService departmentService;

    @PostMapping("/api/departments")
    public Long createDept(@RequestBody SaveDepartmentRequestDto requestDto){
        return departmentService.save(requestDto);

    }
    @GetMapping("/api/departments")
    public List<Department> readAll(){
        return departmentService.findAll();
    }

}
