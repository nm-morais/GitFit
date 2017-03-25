package com.example.nunomorais.a123;



public abstract class Food {

    private int calories, proteins, carbs, fat;
    private String name;

    public Food(int calories, int proteins, int carbs, int fat, String name) {
        this.calories = calories;
        this.proteins = proteins;
        this.carbs = carbs;
        this.fat = fat;
        this.name = name;
    }

    public int getCalories() {
        return calories;
    }

    public int getCarbs() {
        return carbs;
    }

    public int getFat() {
        return fat;
    }

    public String getName() {
        return name;
    }

    public int getProteins() {
        return proteins;

    }
}

