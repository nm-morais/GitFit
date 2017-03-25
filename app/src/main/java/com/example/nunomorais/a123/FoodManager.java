package com.example.nunomorais.a123;

import java.util.HashMap;
import java.util.SortedMap;
import java.util.TreeMap;

/**
 * Created by nunomorais on 25/03/2017.
 */

public class FoodManager {

    HashMap<String,Food> all_food; //all the food

    SortedMap<String,Food> available_ingredients; //constantly updated as stock changes TODO



    TreeMap<String, Food> available_food

    public FoodManager() {
        all_food =  new HashMap<>();
        //all_ingredients = new TreeMap<>();
        available_ingredients = new TreeMap<>();
    }


    void updateAvailability(Ingredient ingredient){
        if(ingredient.getStock() < 1) available_ingredients.remove(ingredient.getName());





    }




}
