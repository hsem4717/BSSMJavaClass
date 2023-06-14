package com.choi.bssm.helloSpring.Repository;

import com.choi.bssm.helloSpring.Domain.Student;

public interface IStudentRepository {
    Long save(Student student);
}
