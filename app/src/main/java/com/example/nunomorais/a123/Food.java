package com.example.nunomorais.a123;

//**
 * Created by Leonardo on 25/03/2017.
         */

public abstract class Food {

    int calories, proteins, carbs, fat;
    String name;

    public Food(int calories, int proteins, int carbs, int fat, String name) {
        this.calories = calories;
        this.proteins = proteins;
        this.carbs = carbs;
        this.fat = fat;
        this.name = name;
    }


}

