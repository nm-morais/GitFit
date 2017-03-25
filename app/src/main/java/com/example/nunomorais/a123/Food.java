package com.example.nunomorais.a123;



public abstract class Food {

    int calories, proteins, carbs, fat, stock;
    String name;

    public Food(int calories, int proteins, int carbs, int fat, String name, int stock) {
        this.calories = calories;
        this.proteins = proteins;
        this.carbs = carbs;
        this.fat = fat;
        this.name = name;
        this.stock = stock;
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

    public int getStock() {
        return stock;
    }

    public String getName() {
        return name;
    }

    public int getProteins() {
        return proteins;

    }
}

