package com.zihad.foodify.model.food;

import com.zihad.foodify.utils.Category;

public class Burger extends FoodItem {
    protected String size;

    public Burger(int id, String name, double price, Category cat, String size) {
        super(id, name, price, cat);
        this.size = size;
    }

    @Override
    public int getId() {
        return id;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public Category getCategory() {
        return this.category;
    }

    @Override
    public String getSize() {
        return this.size;
    }

    @Override
    public String getDetails() {
        return this.name;

    }
}
