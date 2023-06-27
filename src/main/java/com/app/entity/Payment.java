package com.app.entity;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "Zahlung")
public class Payment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Zahlung_id")
    private int id;

    @Column(name = "DATUM")
    private Date datum;

    @Column(name = "sollBETRAG", nullable = false)
    private float sollBetrag;

    @Column(name = "istBETRAG")
    private Float istBetrag;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "Bestellung_id")
    private Order order;

}
