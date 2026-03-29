package com.zihad.foodify.model.food;

import java.util.ArrayList;

public class FoodList {
    private ArrayList<FoodItem> foodList = new ArrayList<>();

    public void add(FoodItem item) {
        foodList.add(item);
    }

    public ArrayList<FoodItem> getAll() {
        return foodList;
    }
}
