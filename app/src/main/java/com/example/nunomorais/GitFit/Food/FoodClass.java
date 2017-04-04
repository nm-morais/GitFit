package com.example.nunomorais.GitFit.Food;


public class FoodClass implements Food {

    private int calories, proteins, carbs, fat, portionsize;
    private String name;

    public FoodClass(int calories, int proteins, int carbs, int fat, String name, int portionsize) {
        this.calories = calories;
        this.proteins = proteins;
        this.carbs = carbs;
        this.fat = fat;
        this.name = name;
        this.portionsize = portionsize;
    }

    @Override
    public int getCalories() {
        return calories;
    }

    @Override
    public int getportion() {
        return portionsize;
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
    public int getProtein() {
        return proteins;

    }

    @Override
    public Food editFood(int calories, int portionsize, int carbs, int fat, int protein, String name) {
        this.portionsize = portionsize;
        this.calories = calories;
        this.carbs = carbs;
        this.proteins = protein;
        this.fat = fat;
        this.name = name;
        return this;
    }


}

