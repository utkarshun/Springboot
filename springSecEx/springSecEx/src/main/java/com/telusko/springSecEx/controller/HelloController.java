package com.telusko.springSecEx.controller;

import com.telusko.springSecEx.model.Student;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.security.web.csrf.CsrfToken;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class HelloController {
    @GetMapping("/")
    public String greet(HttpServletRequest request){
        return "Welcome to Utkarsh " + request.getSession().getId() ;

    }

    @RestController
    public static class StudentController {

        private List<Student> students = new ArrayList<>(List.of(
                new Student(1, "Utkarsh", 99),
                new Student(2, "Harsh", 97)
        ));

        @GetMapping("/students")
        public List<Student> getStudents() {
            return students;
        }

        @PostMapping("/students")
        public Student addStudent(@RequestBody Student student) {
            students.add(student);
            return student;
        }

        @GetMapping("/csrf-token")
        public CsrfToken getCsrfToken(HttpServletRequest request) {
            return (CsrfToken) request.getAttribute("_csrf");
        }


    }
}
