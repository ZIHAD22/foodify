package com.zihad.foodify.model.order;

import java.util.ArrayList;

public class OrderList {

    private ArrayList<Order> orders = new ArrayList<>();

    public void addOrder(Order order) {
        orders.add(order);
    }

    public ArrayList<Order> getOrders() {
        return orders;
    }
}