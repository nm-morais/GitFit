package com.example.nunomorais.GitFit.Food;

public class LiquidIngredientClass extends IngredientClass implements LiquidIngredient {

    public LiquidIngredientClass(String name, int proteins, int carbs, int fat, int calories, int portion) {
        super(name, calories, proteins, carbs, fat, portion);
    }
}
