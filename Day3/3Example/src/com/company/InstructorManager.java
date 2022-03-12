package com.company;

import java.util.ArrayList;
import java.util.List;

public class InstructorManager extends UserManager {
    @Override
    public void add(User user) {
        System.out.println(user.getFirstName() + " eğitmen eklendi!");
    }

}