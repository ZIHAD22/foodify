package com.zihad.foodify;

import java.util.Scanner;

import com.zihad.foodify.service.FoodService;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        FoodService foodService = new FoodService();

        while (true) {
            System.out.println("1. Add Food to Menu");
            System.out.println("2. Show Menu");
            System.out.println("3. Order Food");
            System.out.println("4. Show Order");
            System.out.println("5. Exit");

            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    foodService.addFood(sc);
                    break;

                case 2:
                    foodService.showMenu();
                    break;

                // case 3:
                // System.out.print("Enter Food ID: ");
                // int id = sc.nextInt();
                // FoodItem item = foodService.selectFood(id);
                // if (item != null) {
                // order.addItem(item);
                // }
                // break;

                // case 4:
                // order.showSummary();
                // break;

                case 5:
                    return;
            }
        }

    }
}
