package com.example.nunomorais.GitFit.Food;


public class CustomMealClass extends FoodClass implements CustomMeal {

    public CustomMealClass(int calories, int proteins, int carbs, int fat, String name,int portionSize){
        super(calories, proteins, carbs, fat, name, portionSize);
    }
}
