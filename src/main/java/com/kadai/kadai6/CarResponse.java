package com.kadai.kadai6;

public class CarResponse {

    private String name;

    private String color;

    private int price;

    public CarResponse(String name, String color, int price) {
        this.name = name;
        this.color = color;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public int getPrice() {
        return price;
    }
}
