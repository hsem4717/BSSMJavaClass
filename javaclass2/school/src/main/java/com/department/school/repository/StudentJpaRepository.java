package com.department.school.repository;

import com.department.school.domain.Department;
import com.department.school.domain.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface StudentJpaRepository extends JpaRepository<Student, Long> {

    @Query("select s from Student s where department = :department order by s.id desc")
    List<Student> findByDepartment(Department department);
}
