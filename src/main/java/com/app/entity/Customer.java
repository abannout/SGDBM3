package com.app.entity;

import com.app.vo.Address;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@NoArgsConstructor
@Table(name = "Kunde")
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "kunde_ID")

    private int id;
    @Column(name = "VORNAME")
    private String firstName;
    @Column(name = "NACHNAME")
    private String nachname;
    @Column(name = "EMAIL")
    private String email;
    @Column(name = "TELEFONNUMMER")

    private String telefonnummer;
    @Column(name = "Status")

    private String status;
    @Column(name = "Kunde_ADDRESSE_ID")

    @Embedded
    @AttributeOverrides(value = {
            @AttributeOverride(name = "street", column = @Column(name = "STRASSE")),
            @AttributeOverride(name = "houseNumber", column = @Column(name = "HAUSNUMMER")),
            @AttributeOverride(name = "city", column = @Column(name = "STADT")),
            @AttributeOverride(name = "zipCode", column = @Column(name = "PLZ"))

    })
    private Address address;

    public Customer(String firstName, String nachname, String email, String telefonnummer, String status, Address address) {
        this.firstName = firstName;
        this.nachname = nachname;
        this.email = email;
        this.telefonnummer = telefonnummer;
        this.status = status;
        this.address = address;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setNachname(String nachname) {
        this.nachname = nachname;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setTelefonnummer(String telefonnummer) {
        this.telefonnummer = telefonnummer;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
    @Override
    public String toString() {
        return "ID: " + getId() + System.lineSeparator() +
                "Nachname: " + getNachname() + System.lineSeparator() +
                "Vorname: " + getFirstName() + System.lineSeparator() +
                "Email: " + getEmail() + System.lineSeparator() +
                "Status: " + getStatus() + System.lineSeparator() +
                "Telefonnummer: " + getTelefonnummer() + System.lineSeparator() +
                "Adresse: " + getAddress().toString() + System.lineSeparator();
    }

}
