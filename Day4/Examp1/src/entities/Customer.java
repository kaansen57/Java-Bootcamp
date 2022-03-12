package entities;

import java.util.Date;

import abstracts.IEntity;

public class Customer implements IEntity{
    private int id;
    private String firstName;
    private String lastName;
    private String nationalIdentyId;
    private Date dateOfBirth;

    public Customer() {
    }

    public Customer(int id, String firstName, String lastName, String nationalIdentyId, Date dateOfBirth) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.nationalIdentyId = nationalIdentyId;
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

    public String getNationalIdentyId() {
        return nationalIdentyId;
    }

    public void setNationalIdentyId(String nationalIdentyId) {
        this.nationalIdentyId = nationalIdentyId;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }
}
