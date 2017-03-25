package com.example.nunomorais.a123;

/**
 * Created by Leonardo on 25/03/2017.
 */

public abstract class Ingredient extends Food {
    int capacity;

    public Ingredient(String name, int calories, int capacity, int proteins, int carbs, int fat) {
        super(calories, proteins, carbs, fat, name);
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
}
