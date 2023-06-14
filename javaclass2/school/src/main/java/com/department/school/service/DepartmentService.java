package com.department.school.service;

import com.department.school.contorller.dto.SaveDepartmentRequestDto;
import com.department.school.domain.Department;
import com.department.school.repository.DepartmentJpaRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@AllArgsConstructor
@Service
public class DepartmentService {
    private final DepartmentJpaRepository  departmentJpaRepository;
    public Long save(SaveDepartmentRequestDto requestDto) {

        Optional<Department> byName =  departmentJpaRepository.findByName(requestDto.getName());
        if(byName.isPresent()){
            throw new IllegalArgumentException("이미 등록된 학과입니다");
        }

        return departmentJpaRepository
                .save(requestDto.toEntity())
                .getId();
    }


    public List<Department> findAll() {
        return departmentJpaRepository.findAll();
    }
}
