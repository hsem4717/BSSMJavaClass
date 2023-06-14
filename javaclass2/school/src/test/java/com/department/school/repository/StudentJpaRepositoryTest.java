package com.department.school.repository;

import com.department.school.domain.Department;
import com.department.school.domain.Gender;
import com.department.school.domain.Student;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class StudentJpaRepositoryTest {
    @Autowired
    private StudentJpaRepository studentJpaRepository;
    @Autowired
    private DepartmentJpaRepository departmentJpaRepository;

    @Test
    public void 저장(){
        Department department = Department.builder()
                .name("Sw")
                .personnel(32L)
                .build();

        departmentJpaRepository.save(department);

        Student student  = Student.builder()
                        .id(1101L)
                        .name("나")
                        .gender(Gender.MALE)
                        .department(department)
                        .build();


        studentJpaRepository.save(student);
        assertEquals(studentJpaRepository.findAll().get(0).getId(), 1101L);
    }

}