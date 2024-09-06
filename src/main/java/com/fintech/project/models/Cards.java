package com.fintech.project.models;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

import java.sql.Date;
@Entity
@Table(name = "Cards")
public class Cards {
    @Id
    private Long id;

    private Long nm_card;

    private Integer nm_ccv;

    private Date dt_expired;

    private Double num_available;

    private Double credit_limit;

    @ManyToOne
    @JoinColumn(name = "account_id", referencedColumnName = "id") // Foreign key referencing Account
    private Account account;
}
