package com.example.nunomorais.GitFit.Food;


import java.io.Serializable;

/**
 * Created by Leonardo on 25/03/2017.
 */

public class SolidIngredient extends Ingredient implements Serializable {

    public SolidIngredient(String name, int calories, int proteins, int carbs, int fat) {
        super(name, calories, proteins, carbs, fat);
    }
}
