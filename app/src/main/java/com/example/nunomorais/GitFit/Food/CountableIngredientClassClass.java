package com.example.nunomorais.GitFit.Food;

import java.io.Serializable;

/**
 * Created by Leonardo on 25/03/2017.
 * Countable food (ex: eggs)
 */

public class CountableIngredientClassClass extends IngredientClass implements Serializable, CountableIngredient {

    public CountableIngredientClassClass(String name, int calories, int proteins, int carbs, int fat) {
        super(name, calories, proteins, carbs, fat);
    }
}