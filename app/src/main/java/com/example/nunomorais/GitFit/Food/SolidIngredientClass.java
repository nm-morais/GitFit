package com.example.nunomorais.GitFit.Food;


import java.io.Serializable;

/**
 * Created by Leonardo on 25/03/2017.
 */

public class SolidIngredientClass extends IngredientClass implements Serializable {

    public SolidIngredientClass(String name, int calories, int proteins, int carbs, int fat) {
        super(name, calories, proteins, carbs, fat);
    }
}
