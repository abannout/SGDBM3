package com.app.entity;

import jakarta.persistence.*;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@Table(name = "Bestellung")
@NoArgsConstructor
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Bestellung_id")
    private int id;

    @Column(name = "DATUM")
    private Date datum;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "Kunde_id")
    private Customer customer;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "Mitarbeiter_id")
    private Employe employe;

    @Column(name = "STATUS")
    private String status;

    public Order(Date datum, Customer customer, Employe employe, String status) {
        this.datum = datum;
        this.customer = customer;
        this.employe = employe;
        this.status = status;
    }

    public void setDatum(Date datum) {
        this.datum = datum;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public void setEmploye(Employe employe) {
        this.employe = employe;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
