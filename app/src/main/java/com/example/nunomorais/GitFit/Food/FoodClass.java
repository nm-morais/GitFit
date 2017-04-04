package com.example.nunomorais.GitFit.Food;


public abstract class FoodClass implements Food {

    int calories, proteins, carbs, fat;
    String name;

    public FoodClass(int calories, int proteins, int carbs, int fat, String name) {
        this.calories = calories;
        this.proteins = proteins;
        this.carbs = carbs;
        this.fat = fat;
        this.name = name;
    }

    @Override
    public int getCalories() {
        return calories;
    }

    @Override
    public int getCarbs() {
        return carbs;
    }

    @Override
    public int getFat() {
        return fat;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getProteins() {
        return proteins;

    }
}

