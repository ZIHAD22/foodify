package com.zihad.foodify.model.food;

import com.zihad.foodify.utils.Category;

public abstract class FoodItem {
    protected int id;
    protected String name;
    protected double price;
    protected Category category;
    protected int quantity;

    FoodItem(int id, String name, double price, Category cat, int quantity) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.category = cat;
        this.quantity = quantity;
    }

    public abstract int getId();

    public abstract String getName();

    public abstract double getPrice();

    public abstract Category getCategory();

    public abstract String getSize();

    public abstract String getDetails();

    public abstract int getQuantity();

}
