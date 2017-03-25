package com.example.nunomorais.a123;

/**
 * Created by Leonardo on 25/03/2017.
 */

public abstract class Ingredient extends Food {

    public Ingredient(String name, int calories, int capacity, int proteins, int carbs, int fat) {
        super(calories, proteins, carbs, fat, name, capacity);
    }
}
