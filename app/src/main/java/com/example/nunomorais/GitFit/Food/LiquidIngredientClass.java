package com.example.nunomorais.GitFit.Food;

import java.io.Serializable;

/**
 * Created by Leonardo on 25/03/2017.
 */

public class LiquidIngredientClass extends IngredientClass implements LiquidIngredient {

    public LiquidIngredientClass(String name, int proteins, int carbs, int fat, int calories) {
        super(name, calories, proteins, carbs, fat);
    }
}
