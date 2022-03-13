package com.company.entities.concretes;

import com.company.entities.abstracts.IEntity;

public class Game implements IEntity {
    private int id;
    private String gameName;
    private double price;

    public Game() {
    }

    public Game(int id, String gameName, double price) {
        this.id = id;
        this.gameName = gameName;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getGameName() {
        return gameName;
    }

    public void setGameName(String gameName) {
        this.gameName = gameName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
