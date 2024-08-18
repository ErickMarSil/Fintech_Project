package com.fintech.project.demo.models;

// Database importation
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.GenerationType;

// Generic importation
import java.sql.Date;

@Entity
@Table(name = "Users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    Integer cd_cpf;
    String first_name;
    String last_name;
    String email;
    String password;
    Date birth_date;
    Integer nm_phone;
    Integer user_type;
}
