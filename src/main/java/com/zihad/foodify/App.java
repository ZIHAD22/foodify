package com.zihad.foodify;

import java.util.Scanner;

import com.zihad.foodify.model.Customer;
import com.zihad.foodify.service.FoodService;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("====== Welcome to Foodify ======");
        System.out.println("Please Register First\n");

        System.out.print("Enter Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Email: ");
        String email = sc.nextLine();

        System.out.print("Enter Phone: ");
        String phone = sc.nextLine();

        Customer customer = new Customer(1, name, email, phone);

        System.out.println("\n Registration Successful!");
        System.out.println("Welcome, " + customer.getName() + "\n");

        FoodService foodService = new FoodService();

        while (true) {
            System.out.println("\n====== MENU ======");
            System.out.println("1. Add Food to Menu");
            System.out.println("2. Show Menu");
            System.out.println("3. Order Food");
            System.out.println("4. Show Order");
            System.out.println("5. Exit");

            System.out.print("Enter choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    foodService.addFood(sc);
                    break;

                case 2:
                    foodService.showMenu();
                    break;

                case 3:
                    System.out.println("");
                    break;

                case 4:
                    System.out.println("");
                    break;

                case 5:
                    System.out.println("");
                    return;

                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}