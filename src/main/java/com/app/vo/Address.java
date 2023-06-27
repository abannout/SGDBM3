package com.app.vo;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Embeddable
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Address {
    @NotNull
    @Size(max = 100)
    private String street;
    @NotNull
    @Size(max = 100)
    private String houseNumber;

    @NotNull
    @Size(max = 100)
    private String city;

    @NotNull
    @Size(max = 5)
    private String zipCode;

    @Override
    public String toString(){
        return getStreet() +getHouseNumber() + getZipCode() + getCity() ;
    }

}
