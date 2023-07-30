package com.example.crud.entity;

import lombok.Data;
import jakarta.persistence.*;

@Data
@Entity
@Table(name = "tbl_student")
public class student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long studentId;
    private String firstName;
    private String lastName;
    @Column(name = "email_address", unique = true, nullable = false)
    private String email;

}
