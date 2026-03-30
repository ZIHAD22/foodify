package com.zihad.foodify.service;

import java.util.Scanner;

import com.zihad.foodify.model.Customer;
import com.zihad.foodify.model.food.FoodItem;
import com.zihad.foodify.model.food.FoodList;
import com.zihad.foodify.model.order.ItemCart;
import com.zihad.foodify.model.order.Order;

public class OrderService {

    private FoodList foodList;

    public OrderService(FoodList foodList) {
        this.foodList = foodList;
    }

    public void processOrder(Scanner sc, Customer customer) {

        Order order = new Order(
                customer.getOrderList().getOrders().size() + 1,
                customer.getName());

        while (true) {
            showMenu();

            System.out.print("\nEnter Food ID (0 to confirm): ");
            int id = sc.nextInt();

            if (id == 0)
                break;

            FoodItem item = foodList.getById(id);

            if (item != null) {
                if (order.getCartSize() != 0 && order.getItemsById(id) != null) {
                    System.out.print("Update quantity: ");
                    int quantity = sc.nextInt();
                    order.getItemsById(id).updateQuantity(quantity);
                    System.out.println("Quantity successfully!");

                } else {

                    System.out.print("Enter quantity: ");
                    int quantity = sc.nextInt();
                    order.addItem(id, quantity);

                    System.out.println("Added: " + item.getName());
                }
            } else {
                System.out.println("Invalid ID");
            }
        }

        customer.getOrderList().addOrder(order);

        showOrderSummary(order);

        System.out.println("Order placed successfully!");
    }

    public void showMenu() {
        System.out.println("\n====== MENU ======");

        for (FoodItem item : foodList.getAll()) {
            System.out.println(
                    item.getId() + ". " +
                            item.getName() + " | " +
                            item.getCategory() + " | " +
                            item.getDetails() + " | " +
                            item.getPrice() + " | " + item.getQuantity());
        }
    }

    public void showOrderSummary(Order order) {
        double total = 0;

        System.out.println("\n====== ORDER SUMMARY ======");
        System.out.println("Customer: " + order.getCustomerName());

        for (ItemCart cart : order.getItems()) {

            FoodItem item = foodList.getById(cart.getId());

            if (item != null) {

                int qty = cart.getQuantity();

                System.out.println(
                        item.getName() + " | " +
                                item.getCategory() + " | " +
                                qty + " x " + item.getPrice());

                total += item.getPrice() * qty;
            }
        }

        System.out.println("--------------------------");
        System.out.println("Total: " + total);
    }

    public void showOrderHistory(Customer customer) {

        System.out.println("\n====== ORDER HISTORY ======");

        for (Order order : customer.getOrderList().getOrders()) {

            System.out.println("\nOrder ID: " + order.getId());

            double total = 0;

            for (ItemCart cart : order.getItems()) {

                FoodItem item = foodList.getById(cart.getId());

                if (item != null) {

                    int qty = cart.getQuantity();

                    System.out.println(
                            "- " + item.getName() +
                                    " (" + qty + " x " + item.getPrice() + ")");

                    total += item.getPrice() * qty;
                }
            }

            System.out.println("Total: " + total);
            System.out.println("--------------------------");
        }
    }
}