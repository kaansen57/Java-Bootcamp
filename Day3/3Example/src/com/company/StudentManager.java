package com.company;

public class StudentManager extends UserManager {
    @Override
    public void add(User user) {
        System.out.println(user.getFirstName() + " öğrenci eklendi!");
    }

}