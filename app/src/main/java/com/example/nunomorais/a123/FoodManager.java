package com.example.nunomorais.a123;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.SortedMap;
import java.util.TreeMap;

/**
 * Created by nunomorais on 25/03/2017.
 */

public class FoodManager {

    HashMap<String, Food> all_food; //all the food

    SortedMap<String, Food> available_ingredients; //constantly updated as stock changes TODO


    TreeMap<String, Food> available_food;

    public FoodManager() {
        all_food = new LinkedHashMap<>();
        //all_ingredients = new TreeMap<>();
        available_ingredients = new TreeMap<>();
    }

    public Food getFood(String name) throws FoodDoesNotExistException {
        Food food = null;
        food = all_food.get(name);
        if (food == null) throw new FoodDoesNotExistException();
        return food;
    }

    /**
     * removes
     *
     * @param name
     * @return
     * @throws FoodDoesNotExistException
     */
    public Food removeFood(String name) throws FoodDoesNotExistException {
        Food toremove = this.getFood(name);
        all_food.remove(toremove);
        if (this.available_food.get(toremove) != null) available_food.remove(toremove);
        return toremove;

    }

    /**
     * if the stock of a food is zero
     * removes the ingredient from the structure of available ingredients
     *
     * @param ingredient
     */
    void updateAvailability(Ingredient ingredient) {
        if (ingredient.getStock() < 1) available_ingredients.remove(ingredient.getName());
        else return;
    }

    /**
     * returns yes if the food is available in the inventory
     *
     * @param name
     * @return
     * @throws FoodDoesNotExistException
     */
    boolean isAvailable(String name) throws FoodDoesNotExistException {
        Food food = this.getFood(name);
        return food.getStock() > 1;

    }

    void SetStockToIngredient(String ingredient, int ammount) throws FoodDoesNotExistException {
        Food food = this.getFood(ingredient);
        food.setStock(ammount);
    }

    Food createFood(String type, int calories, int proteins, int carbs, int fat, String name) {

        switch (type) {
            case "LIQUID":
                Food LiquidIngredient = new LiquidIngredient(name, calories, proteins, carbs, fat);


        }


    }
}





}
