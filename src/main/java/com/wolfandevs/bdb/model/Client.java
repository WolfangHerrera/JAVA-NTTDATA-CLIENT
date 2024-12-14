package com.wolfandevs.bdb.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Client {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String firstName;
    private String middleName;
    private String lastName;
    private String secondLastName;
    private String phone;
    private String address;
    private String cityResidence;
    private String typeDNI;
    private Long numberDNI;

    public Client(
        String firstName,
        String middleName,
        String lastName,
        String secondLastName,
        String phone,
        String address,
        String cityResidence,
        String typeDNI,
        Long numberDNI
    ) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.secondLastName = secondLastName;
        this.phone = phone;
        this.address = address;
        this.cityResidence = cityResidence;
        this.typeDNI = typeDNI;
        this.numberDNI = numberDNI;
    }

    public Client() {
    }

    public Long getId() {
        return id;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getMiddleName() {
        return this.middleName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public String getSecondLastName() {
        return this.secondLastName;
    }

    public String getPhone() {
        return this.phone;
    }

    public String getAddress() {
        return this.address;
    }

    public String getCityResidence() {
        return this.cityResidence;
    }

    public String getTypeDNI() {
        return this.typeDNI;
    }

    public Long getNumberDNI() {
        return this.numberDNI;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setSecondLastName(String secondLastName) {
        this.secondLastName = secondLastName;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setCityResidence(String cityResidence) {
        this.cityResidence = cityResidence;
    }

    public void setTypeDNI(String typeDNI) {
        this.typeDNI = typeDNI;
    }

    public void setNumberDNI(Long numberDNI) {
        this.numberDNI = numberDNI;
    }

}
