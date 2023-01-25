package com.example.demo.controllers;

import com.example.demo.models.Student;
import com.example.demo.services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value="/")
public class StudentController {

    @Autowired
    StudentService studentService;

    @PostMapping("student")
    public Student createStudent(@RequestBody Student student) {
        return studentService.createStudent(student);
    }

    @GetMapping("student/{id}")
    public Student getStudentById(@PathVariable String id) {
        return  studentService.getStudentbyId(id);
    }

    @GetMapping("students")
    public List<Student> getAllStudents() {
        return studentService.getAllStudents();
    }

    @PutMapping("update")
    public Student updateStudent(@RequestBody Student student) {
        return studentService.updateStudent(student);
    }

    @DeleteMapping("delete/{id}")
    public String deleteStudent(@PathVariable String id) {
        return studentService.deleteStudent(id);
    }

    // specialare
    @GetMapping("studentsByName/{name}")
    public List<Student> studentsByName(@PathVariable String name) {
        return studentService.getStudentsByName(name);
    }

    @GetMapping("studentsByEmailAndName")
    public List<Student> studentsByEmailAndName(@RequestParam String name, @RequestParam String email) {
        return studentService.studentsByEmailAndName(name, email);
    }

    @GetMapping("studentsByNameOrEmail")
    public List<Student> studentsByNameOrEmail(@RequestParam String name, @RequestParam String email) {
        return studentService.studentsByNameOrEmail(name, email);
    }
}
