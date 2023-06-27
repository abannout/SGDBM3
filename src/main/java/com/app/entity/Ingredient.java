package com.app.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "ZUTAT")
@NoArgsConstructor
@Getter
public class Ingredient {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ZUTAT_ID")
    private int id;

    @Column(name = "NAME", nullable = false)
    private String name;

    @Column(name = "EINHEIT")
    private String einheit;

    @Column(name = "MENGE", nullable = false)
    private float menge;

    public Ingredient(String name, String einheit, float menge) {
        this.name = name;
        this.einheit = einheit;
        this.menge = menge;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEinheit(String einheit) {
        this.einheit = einheit;
    }

    public void setMenge(float menge) {
        this.menge = menge;
    }
}
