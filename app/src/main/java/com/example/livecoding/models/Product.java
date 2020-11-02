package com.example.livecoding.models;

public class Product {

    public String name;
    public int qty, price;
    public final int OLD_PRICE;

    public Product(String name, int price) {
        this.name = name;
        this.price = price;
        this.OLD_PRICE = price;
    }
}
