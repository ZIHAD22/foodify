package com.zihad.foodify.model.food;

import com.zihad.foodify.utils.Category;

public class Drink extends FoodItem {
    protected String Size;

    public Drink(int id, String name, double price, Category cat, String Size, int quantity) {
        super(id, name, price, cat, quantity);
        this.Size = Size;
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
        return this.Size;
    }

    @Override
    public String getDetails() {
        return this.name;
    }

    @Override
    public int getQuantity() {
        return this.quantity;
    }

    @Override
    public void updateQuantity(int newQuantity) {
        this.quantity = this.quantity - newQuantity;
    };
}
