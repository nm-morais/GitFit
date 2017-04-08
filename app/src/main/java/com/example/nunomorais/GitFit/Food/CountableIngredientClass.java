package com.example.nunomorais.GitFit.Food;

import java.io.Serializable;

/**
 * Countable food (ex: eggs)
 */

public class CountableIngredientClass extends IngredientClass implements Serializable, CountableIngredient {

    public CountableIngredientClass(String name, int calories, int proteins, int carbs, int fat, int portionSize) {
        super(name, calories, proteins, carbs, fat, portionSize);
    }
}