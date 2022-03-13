package com.company.entities.concretes;

import com.company.entities.abstracts.IEntity;

public class Compaign implements IEntity {
    private int id;
    private String compaignName;
    private double discount;


    public Compaign() {
    }

    public Compaign(int id, String compaignName, double discount) {
        this.id = id;
        this.compaignName = compaignName;
        this.discount = discount;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCompaignName() {
        return compaignName;
    }

    public void setCompaignName(String compaignName) {
        this.compaignName = compaignName;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }
}
