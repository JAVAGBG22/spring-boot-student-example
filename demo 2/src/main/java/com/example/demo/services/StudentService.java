package com.example.demo.services;

import com.example.demo.models.Student;
import com.example.demo.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    @Autowired
    StudentRepository studentRepository;

    public Student createStudent(Student student) {
        return studentRepository.save(student);
    }

    public Student getStudentbyId(String id) {
        return studentRepository.findById(id).get();
    }

    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    public Student updateStudent(Student student) {
        return studentRepository.save(student);
    }

    public String deleteStudent(String id) {
        studentRepository.deleteById(id);
        return "Student has been deleted";
    }

    // specialare

    public List<Student> getStudentsByName (String name) {
        return studentRepository.findByName(name);
    }

    public List<Student> studentsByEmailAndName (String name, String email) {
        return studentRepository.findByEmailAndName(name, email);
    }

    public List<Student> studentsByNameOrEmail (String name, String email) {
        return studentRepository.findByNameOrEmail(name, email);
    }
}
