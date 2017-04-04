package com.example.nunomorais.GitFit.Food;

/**
 * Created by Leonardo on 25/03/2017.
 */

public abstract class IngredientClass extends FoodClass implements Ingredient {

    private int stock;

    public IngredientClass(String name, int calories, int proteins, int carbs, int fat, int portion) {
        super(calories, proteins, carbs, fat, name, portion);
        this.stock = 0;
    }

    @Override
    public int getStock() {
        return stock;
    }

    @Override
    public void setStock(int stock) {
        this.stock = stock;
    }

    @Override
    public int removeUnit() {
        return stock--;
    }
}
