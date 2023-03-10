package com.example.demo.repository;

import com.example.demo.models.Student;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentRepository extends MongoRepository <Student, String> {

    List<Student> findByName(String name);

    List<Student> findByEmailAndName (String name, String email);

    List<Student> findByNameOrEmail (String name, String email);
}
