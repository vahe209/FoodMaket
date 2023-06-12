package com.example.foodmaket.models;

public class Items {
    private int button;
    private String details;
    private float price;



    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }



    public Items(String details, float price) {
        this.details = details;
        this.price = price;
    }
}
