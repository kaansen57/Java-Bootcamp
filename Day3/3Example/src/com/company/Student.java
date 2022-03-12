package com.company;

public class Student extends User {
    private String cardNumber;
    private String adress;

    public Student() {
    }

    public Student(int id, String firstName, String lastName, String email, String password, String profileImg, String cardNumber, String adress) {
        super(id, firstName, lastName, email, password, profileImg);
        this.cardNumber = cardNumber;
        this.adress = adress;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }
}