package com.choi.bssm.helloSpring.Repository;

import com.choi.bssm.helloSpring.Domain.Student;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

@Repository
public class MemoryStudentRepository implements IStudentRepository{
    private static Map<Long, Student> store = new HashMap<>();
    @Override
    public Long save(Student student) {
        store.put(student.getId(), student);
        return student.getId();
    }
}
