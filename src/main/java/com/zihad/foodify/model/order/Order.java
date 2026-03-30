package com.zihad.foodify.model.order;

import java.util.ArrayList;

public class Order {

    private int id;
    private ArrayList<ItemCart> itemCarts = new ArrayList<>();
    private String customerName;

    public Order(int id, String customerName) {
        this.id = id;
        this.customerName = customerName;
    }

    public void addItem(int foodId, int quantity) {
        ItemCart item = new ItemCart(foodId, quantity);
        itemCarts.add(item);
    }

    public int getId() {
        return this.id;
    }

    public ArrayList<ItemCart> getItems() {
        return itemCarts;
    }

    public ItemCart getItemsById(int id) {
        if (itemCarts.size() > id - 1) {
            return itemCarts.get(id - 1);
        } else {
            return null;
        }
    }

    public String getCustomerName() {
        return customerName;
    }

    public int getCartSize() {
        return itemCarts.size();
    }
}