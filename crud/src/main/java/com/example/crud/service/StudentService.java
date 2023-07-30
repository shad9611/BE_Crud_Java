package com.example.crud.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.crud.entity.student;
import com.example.crud.repository.StudentRepository;

@Service
public class StudentService {

    @Autowired
    StudentRepository studentRepository;

    public List<student> getStudents() {
        return studentRepository.findAll();
    }

    public Optional<student> getStudent(Long id) {
        return studentRepository.findById(id);
    }

    public void saveOrUpdate(student student) {
        studentRepository.save(student);
    }

    public void delete(Long id) {
        studentRepository.deleteById(id);
    }

}
