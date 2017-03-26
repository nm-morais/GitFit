package com.example.nunomorais.GitFit.Food;

import java.io.Serializable;

/**
 * Created by Leonardo on 25/03/2017.
 */

public abstract class Ingredient extends Food implements Serializable {

    private int stock;

    public Ingredient(String name, int calories, int proteins, int carbs, int fat) {
        super(calories, proteins, carbs, fat, name);
        this.stock = 0;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public void removeUnit(){
        stock--;
    }
}
