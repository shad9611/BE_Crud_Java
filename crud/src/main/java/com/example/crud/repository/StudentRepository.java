package com.example.crud.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.crud.entity.student;

@Repository
public interface StudentRepository extends JpaRepository<student, Long> {

}
