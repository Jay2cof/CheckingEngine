package com.example.checkingengine.Entities;

import java.util.Date;

public class Customers {

    private int Id;
    private String firstName;
    private String LastName;
    private String gender;
    private Date dateOfBirth;
    private String CustomerStatus;
    private String email;
    private String Password;
    private String address;
    private String country;

    public Customers(){

    }

    public Customers(String firstName, String lastName, String gender, Date dateOfBirth, String customerStatus, String email, String password, String address, String country) {
        this.firstName = firstName;
        this.LastName = lastName;
        this.gender = gender;
        this.dateOfBirth = dateOfBirth;
        this.CustomerStatus = customerStatus;
        this.email = email;
        this.Password = password;
        this.address = address;
        this.country = country;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getCustomerStatus() {
        return CustomerStatus;
    }

    public void setCustomerStatus(String customerStatus) {
        CustomerStatus = customerStatus;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}
