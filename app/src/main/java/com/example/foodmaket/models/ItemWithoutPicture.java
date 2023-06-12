package com.example.foodmaket.models;

public class ItemWithoutPicture {
    private String name;
    private String info;
    private float price;

    public ItemWithoutPicture(String name, String info, float price) {
        this.name = name;
        this.info = info;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

}
