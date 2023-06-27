package com.app.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Getter
@Entity
@Table(name = "Gericht")
public class Dish {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "GERICHT_ID")
    private int id;

    @Column(name = "PREIS", nullable = false)
    private float preis;

    @Column(name = "NAME")
    private String name;

    public Dish(float preis, String name) {
        this.preis = preis;
        this.name = name;
    }

    public void setPreis(float preis) {
        this.preis = preis;
    }

    public void setName(String name) {
        this.name = name;
    }
}
