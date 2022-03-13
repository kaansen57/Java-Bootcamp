package com.company.entities.concretes;

import com.company.entities.abstracts.IEntity;

import java.util.Date;

public class Customer implements IEntity {
    private int id;
    private String firstName;
    private String lastName;
    private String nationalIdentityId;
    private Date dateOfBirth;

    public Customer() {
    }

    public Customer(int id, String firstName, String lastName, String nationalIdentityId, Date dateOfBirth) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.nationalIdentityId = nationalIdentityId;
        this.dateOfBirth = dateOfBirth;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getNationalIdentityId() {
        return nationalIdentityId;
    }

    public void setNationalIdentityId(String nationalIdentityId) {
        this.nationalIdentityId = nationalIdentityId;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }
}
