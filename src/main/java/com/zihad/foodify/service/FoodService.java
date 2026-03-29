package com.zihad.foodify.service;

import java.util.Scanner;

import com.zihad.foodify.model.food.Burger;
import com.zihad.foodify.model.food.Drink;
import com.zihad.foodify.model.food.FoodItem;
import com.zihad.foodify.model.food.FoodList;
import com.zihad.foodify.model.food.Pizza;
import com.zihad.foodify.utils.Category;

public class FoodService {

    private FoodList foodList = new FoodList();

    public void addFood(Scanner sc) {
        FoodItem item = createFoodItem(sc);
        if (item != null) {
            foodList.add(item);
            System.out.println("Food added successfully!");

        }
    }

    public void showMenu() {
        System.out.println("------ Menu ------");

        for (FoodItem item : foodList.getAll()) {
            System.out.println(item.getId() + ". " +
                    item.getDetails() + " - " + item.getCategory() + " - " + item.getSize() + " - " +
                    item.getPrice());
        }
    }

    public static FoodItem createFoodItem(Scanner sc) {
        System.out.println("Select Food Type:");
        System.out.println("1. Burger");
        System.out.println("2. Pizza");
        System.out.println("3. Drink");

        int choice = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter ID: ");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Price: ");
        double price = sc.nextDouble();
        sc.nextLine();

        switch (choice) {
            case 1:
                System.out.print("Enter Size: ");
                String bSize = sc.nextLine();
                return new Burger(id, name, price, Category.BURGER, "Large");

            case 2:
                System.out.print("Enter Size: ");
                String pSize = sc.nextLine();
                return new Pizza(id, name, price, Category.PIZZA, pSize);

            case 3:
                System.out.print("Enter Volume (ml): ");
                String volume = sc.nextLine();
                return new Drink(id, name, price, Category.DRINK, volume);

            default:
                System.out.println("Invalid choice!");
                return null;
        }
    }
}
