package com.example.nunomorais.a123;

import java.util.Iterator;
import java.util.SortedMap;
import java.util.TreeMap;

/**
 * Created by nunomorais on 25/03/2017.
 */

public class FoodManager {

    SortedMap<String, Food> all_food; //all the food

    SortedMap<String, Food> available_ingredients; //constantly updated as stock changes TODO


    TreeMap<String, Food> available_food;

    public FoodManager() {
        all_food = new TreeMap<>();
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
     */
    void updateAvailability(String name) throws FoodDoesNotExistException {
        Ingredient ingredient = (Ingredient) this.getFood(name);
        if (ingredient.getStock() < 1) available_ingredients.remove(name);
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
        Food food = null;
        switch (type) {
            case "LIQUID":
                food = new LiquidIngredient(name, calories, proteins, carbs, fat);
                break;
            case "SOLID":
                food = new SolidIngredient(name, calories, proteins, carbs, fat);
                break;
            case "COUNTABLE":
                food = new CountableIngredient(name, calories, proteins, carbs, fat);
                break;
        }
        return food;
    }

    Iterator<Food> ListAvailableIngredients() {
        return available_ingredients.values().iterator();
    }

    Iterator<Food> listAllFood() {
        return all_food.values().iterator();
    }


}




