package com.example.foodmaket.models;

public class ItemWithPicture {
   private String name;
    private String info;
    private float price;
    private int img;

    public ItemWithPicture(String name, String info, float price, int img) {
        this.name = name;
        this.info = info;
        this.price = price;
        this.img = img;
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

    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }
}
