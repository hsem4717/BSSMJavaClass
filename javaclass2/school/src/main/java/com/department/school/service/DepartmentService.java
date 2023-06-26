package com.department.school.service;

import com.department.school.contorller.dto.SaveDepartmentRequestDto;
import com.department.school.domain.Department;
import com.department.school.repository.DepartmentJpaRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

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


    @Transactional
    public Long update(Long id, SaveDepartmentRequestDto requestDto) {
        //1. 학과 찾기
        Department department = departmentJpaRepository.findById(id).orElseThrow(()->new IllegalArgumentException("해당학과가 존재하지 않습니다."));
        //2. 찾은 학과 업데이트
        department.updateData(requestDto.getName(), requestDto.getPersonnel());
        return id;
    }
}
