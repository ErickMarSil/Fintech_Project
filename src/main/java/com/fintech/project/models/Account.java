package com.fintech.project.models;

import com.fintech.project.models.AccountsType;
import com.fintech.project.models.StatusType;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.Table;

import java.sql.Date;

@Entity
@Table(name="Account")
public class Account {
    Long id;
    Integer nm_account;
    String nam_account;
    String tp_currency;
    Date dt_creation;
    Double vl_money;
    @JoinColumn(name="user_id", referencedColumnName = "id")
    Long user_id;
    @JoinColumn(name="account_type", referencedColumnName = "id")
    AccountsType account_type;
    @JoinColumn(name="status_type", referencedColumnName = "id")
    StatusType status_type; // Forgein key
}
