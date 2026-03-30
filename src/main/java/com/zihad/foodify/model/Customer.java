package com.zihad.foodify.model;

import com.zihad.foodify.model.order.OrderList;

public class Customer {
    private int id;
    private String name;
    private String email;

    private OrderList orderList = new OrderList();

    public Customer(int id, String name, String email) {
        this.email = email;
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public String getEmail() {
        return this.email;
    }

    public OrderList getOrderList() {
        return orderList;
    }
}
