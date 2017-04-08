package com.example.nunomorais.GitFit.Food;


import java.io.Serializable;


public class SolidIngredientClass extends IngredientClass implements Serializable {

    public SolidIngredientClass(String name, int calories, int proteins, int carbs, int fat, int portionSize) {
        super(name, calories, proteins, carbs, fat, portionSize);
    }
}
