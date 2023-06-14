package com.choi.bssm.helloSpring.Contoller;

import com.choi.bssm.helloSpring.Domain.Student;
import com.choi.bssm.helloSpring.Service.StudentService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class StudentController {
    private StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping("/students/new")
    public String createForm(){
        return "/students/createStudentForm";
    }
    @PostMapping("/students/new")
    public String create(StudentForm form){
        Student student = new Student();
        student.setId(form.getId());
        student.setName(form.getName());
        //edit 로직을 사용해 DB에 저장
        studentService.edit(student);
        return "redirect:/";
    }
}
