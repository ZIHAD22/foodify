package com.zihad.foodify.model;

public class Customer {
    private int id;
    private String name;
    private String email;
    private String phone;

    public Customer(int id, String name, String email, String phone) {
        this.email = email;
        this.id = id;
        this.name = name;
        this.phone = phone;
    }

    public int getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public String getPhone() {
        return this.phone;
    }

    public String getEmail() {
        return this.email;
    }
}
