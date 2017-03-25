package com.example.nunomorais.a123;

import java.util.HashMap;
import java.util.SortedMap;
import java.util.TreeMap;

/**
 * Created by nunomorais on 25/03/2017.
 */

public class FoodManager {

    HashMap<String,Food> all_ingredients;

    TreeMap<String, Food> available_food;

    public FoodManager() {
        map_foods =  new HashMap<>();
    }
}
