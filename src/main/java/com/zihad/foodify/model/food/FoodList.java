package com.zihad.foodify.model.food;

import java.util.ArrayList;

public class FoodList {
    private ArrayList<FoodItem> foodList = new ArrayList<>();

    public void add(FoodItem item) {
        foodList.add(item);
    }

    public int getSize() {
        return foodList.size();
    }

    public ArrayList<FoodItem> getAll() {
        return foodList;
    }

    public FoodItem getById(int id) {
        return foodList.get(id - 1);
    }
}
