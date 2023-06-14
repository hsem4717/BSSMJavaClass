package com.choi.bssm.helloSpring.Contoller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {


    @GetMapping("/hello")
    @ResponseBody //글씨를 반환 // 없으면 html 파일 반환
    public String hello(){
        return "hello"; //객체라면 JSON으로 반환 // CSR방식
    }
    @GetMapping("hi")
    public String hi(){
        return "hi";
    }
    @GetMapping("/hi/data")
    public String hiData(Model model){
        model.addAttribute("data", "mrchoi");
        return "hiData";
    }
    @GetMapping("/hi/param")
    public String hiParam(@RequestParam("data") String data, Model model){
        model.addAttribute("data", data);
        return "hiData";
    }
    @GetMapping("hello/param")
    @ResponseBody
    public String helloParam(@RequestParam("data") String data){
        return "hello "+data;
    }

    @GetMapping("hello/api")
    @ResponseBody
    public Student1 helloApi(@RequestParam("data") String data){
        Student1 student = new Student1(1234L, data);
        return student;
    }

    static class Student1 {
        private Long id;
        private String name;

        public Student1(Long id, String name) {
            this.id = id;
            this.name = name;
        }

        public Long getId() {
            return id;
        }

        public void setId(Long id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }
}
