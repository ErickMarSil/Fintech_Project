package com.fintech.project.models;

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
    public Long id;
    public Integer cd_cpf;
    public String first_name;
    public String last_name;
    public String email;
    public String password;
    public Date birth_date;
    public Integer nm_phone;
    public Integer user_type;

    public User(String cdCpf, String firstName, String lastName, String email, String password, Date birthDate, String nmPhone, int userType) {
    }
}
