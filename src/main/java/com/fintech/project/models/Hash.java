package com.fintech.project.models;

// Database importation
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.Column;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.Id;
import jakarta.persistence.GenerationType;
import jakarta.persistence.GeneratedValue;

@Entity
@Table(name="Hash")
public class Hash {
    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    @Column(name="id", nullable = false)
    Long id;
    @Column(name="hash_password", nullable = false)
    String hash_password;
    @Column(name="salt_increment", nullable = false)
    String salt_increment;
    @Column(name="id", nullable = false)
    @JoinColumn(name="user_id", referencedColumnName = "id")
    Long user_id;
}