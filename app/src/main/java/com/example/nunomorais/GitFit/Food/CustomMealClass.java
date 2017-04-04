package com.example.nunomorais.GitFit.Food;

/**
 * Created by messuped on 3/25/17.
 */

public class CustomMealClass extends FoodClass implements CustomMeal {

    public CustomMealClass(int calories, int proteins, int carbs, int fat, String name){
        super(calories, proteins, carbs, fat, name);
    }
}
