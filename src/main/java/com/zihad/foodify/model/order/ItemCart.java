package com.zihad.foodify.model.order;

public class ItemCart {
    private int id;
    private int quantity;

    public ItemCart(int id, int quantity) {
        this.id = id;
        this.quantity = quantity;
    }

    public int getId() {
        return this.id;
    }

    public int getQuantity() {
        return this.quantity;
    }

    public void updateQuantity(int newQuantity) {
        this.quantity = this.quantity + newQuantity;
    }
}
