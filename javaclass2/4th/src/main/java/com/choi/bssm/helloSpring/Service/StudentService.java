package com.choi.bssm.helloSpring.Service;

import com.choi.bssm.helloSpring.Domain.Student;
import com.choi.bssm.helloSpring.Repository.IStudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {
    @Autowired
    private final IStudentRepository repository;

    public StudentService(IStudentRepository repository) {
        this.repository = repository;
    }

    public Long edit(Student student){
        // 1.중복값 있나
        // 2. 값저장
        Long input = repository.save(student);
        System.out.println(input);
        return input;
    }
}
