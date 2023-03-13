package com.example.AWS.controller;

import com.example.AWS.model.Student;
import com.example.AWS.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/v1/app")
public class StudentController {

    @Autowired
    private StudentService studentService;

    // http://localhost:8081/api/v1/app/find-all
    @GetMapping("find-all")
    public List<Student> findAll(){
        return studentService.findAll();
    }
}
