package com.example.nunomorais.GitFit.Food;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

/**
 * Created by nunomorais on 25/03/2017.
 */

public class FoodManagerClass implements FoodManager {

    Map<String, Food> all_food; //all the food

    Map<String, Food> available_ingredients; //constantly updated as stock changes TODO

    public FoodManagerClass() {
        all_food = new TreeMap<>();
        available_ingredients = new TreeMap<>();
    }

    @Override
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
    @Override
    public Food removeFood(String name) throws FoodDoesNotExistException {
        Food toremove = this.getFood(name);
        if (toremove == null) throw new FoodDoesNotExistException();
        all_food.remove(toremove);
        available_ingredients.remove(toremove);
        return toremove;

    }

    /**
     * if the stock of a food is zero
     * removes the ingredient from the structure of available ingredients
     */
    void updateAvailability(String name) throws FoodDoesNotExistException {
        Ingredient ingredient = (Ingredient) this.getFood(name);
        if (ingredient.getStock() < 1) available_ingredients.remove(name);
    }

    /**
     * returns yes if the food is available in the inventory
     *
     * @param name
     * @return
     * @throws FoodDoesNotExistException
     */
    @Override
    public boolean isAvailable(String name) throws FoodDoesNotExistException {
        IngredientClass food = (IngredientClass) this.getFood(name);
        return food.getStock() >= 1;

    }

    @Override
    public void SetStockToIngredient(String ingredient, int amount) throws FoodDoesNotExistException {
        IngredientClass food = (IngredientClass) this.getFood(ingredient);
        food.setStock(amount);
        updateAvailability(ingredient);
    }

    @Override
    public Food createFood(String type, int calories, int proteins, int carbs, int fat, String name) {
        Food food = null;
        switch (type) {
            case "LIQUID":
                food = new LiquidIngredientClass(name, calories, proteins, carbs, fat);
                break;
            case "SOLID":
                food = new SolidIngredientClass(name, calories, proteins, carbs, fat);
                break;
            case "COUNTABLE":
                food = new CountableIngredientClass(name, calories, proteins, carbs, fat);
                break;
            case "CUSTOM":
                food = new CustomMealClass(calories, proteins, carbs, fat, name);
                break;
        }
        if (!type.equals("CUSTOM"))
            all_food.put(food.getName(), food);
        return food;
    }

    @Override
    public Iterator<Food> ListAvailableIngredients() {
        return available_ingredients.values().iterator();
    }

    @Override
    public Iterator<Food> listAllFood() {
        return all_food.values().iterator();
    }

}





