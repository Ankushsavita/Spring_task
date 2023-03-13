package com.example.AWS.service;

import com.example.AWS.model.Student;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StudentService {

    private static final List<Student> students = new ArrayList<>();

    private static int idCount = 0;

    static{
        students.add(new Student(++idCount, "Ankush", false));
        students.add(new Student(++idCount, "Akash", false));
        students.add(new Student(++idCount, "Amir", false));
        students.add(new Student(++idCount, "Aman", false));

    }

    public List<Student> findAll() {
        return students;
    }
}
