package com.company;

public class Instructor  extends User {
    private String department;

    public Instructor() {
    }

    public Instructor(int id, String firstName, String lastName, String email, String password, String profileImg, String department) {
        super(id, firstName, lastName, email, password, profileImg);
        this.department = department;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
}