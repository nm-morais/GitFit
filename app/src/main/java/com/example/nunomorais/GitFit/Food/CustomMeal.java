package com.example.nunomorais.GitFit.Food;

import java.io.Serializable;

/**
 * Created by messuped on 3/25/17.
 */

public class CustomMeal extends Food implements Serializable {

    public CustomMeal(int calories, int proteins, int carbs, int fat, String name){
        super(calories, proteins, carbs, fat, name);
    }
}
