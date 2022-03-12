package com.company;

public class Main {

    public static void main(String[] args) {
        Instructor instructor = new Instructor(1,"kaan","şen","denem@gmail.com","2222222","img.png","yazılım");
        Student student = new Student(1,"recep","şen","recep@gmail.com","2222222","img.png","11112222333344444","adres");

        InstructorManager instructorManager = new InstructorManager();
        instructorManager.add(instructor);
        instructor.setFirstName("kaans");
        instructorManager.update(instructor);

        StudentManager studentManager = new StudentManager();
        studentManager.add(student);
        studentManager.delete(student);

    }
}
