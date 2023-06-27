package com.app.entity;

import com.app.vo.Address;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.Date;


@Entity
@Getter
@Table(name = "Mitarbeiter")
@NoArgsConstructor
public class Employe {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Mitarbeiter_ID")

    private int id;
    @Column(name = "VORNAME",nullable = false)
    private String firstName;
    @Column(name = "NACHNAME",nullable = false)
    private String nachname;
    @Column(name = "TELEFONNUMMER")
    private String telefonnummer;
    @Column(name = "POSITION")
    private String status;
    @Column(name = "GEHALT")
    private float salary;
    @Column(name = "GEBURTSDATUM",nullable = false)
    private Date birthday;
    @Embedded
    @AttributeOverrides(value = {
            @AttributeOverride(name = "street", column = @Column(name = "STRASSE")),
            @AttributeOverride(name = "houseNumber", column = @Column(name = "HAUSNUMMER")),
            @AttributeOverride(name = "city", column = @Column(name = "STADT")),
            @AttributeOverride(name = "zipCode", column = @Column(name = "PLZ"))

    })
    private Address address;

    public Employe(String firstName, String nachname, String telefonnummer, String status, float salary, Date birthday, Address address) {
        this.firstName = firstName;
        this.nachname = nachname;
        this.telefonnummer = telefonnummer;
        this.status = status;
        this.salary = salary;
        this.birthday = birthday;
        this.address = address;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setNachname(String nachname) {
        this.nachname = nachname;
    }

    public void setTelefonnummer(String telefonnummer) {
        this.telefonnummer = telefonnummer;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}
