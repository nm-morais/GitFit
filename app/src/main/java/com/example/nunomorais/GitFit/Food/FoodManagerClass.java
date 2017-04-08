package com.example.nunomorais.GitFit.Food;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;


public class FoodManagerClass implements FoodManager {

    Map<String, Food> all_food; //all the food

    Map<String, Ingredient> available_ingredients; //constantly updated as stock changes

    Map<String, Ingredient> all_ingredients;

    public FoodManagerClass() {
        all_food = new TreeMap<>();
        available_ingredients = new TreeMap<>();
    }

    @Override
    public Food getFood(String name) throws FoodDoesNotExistException {
        Food food = all_food.get(name);
        if (food == null) throw new FoodDoesNotExistException();
        return food;
    }

    @Override
    public Food removeFood(String name) throws FoodDoesNotExistException {
        Food to_remove = this.getFood(name);
        if (to_remove == null) throw new FoodDoesNotExistException();
        all_food.remove(to_remove);
        if (to_remove instanceof Ingredient) available_ingredients.remove(to_remove);
        return to_remove;

    }

    @Override
    public void updateAvailability(String name, int ammount_to_remove) throws FoodDoesNotExistException {
        Ingredient ingredient = (Ingredient) this.getFood(name);
        if (ingredient.getStock() < 1) available_ingredients.remove(name);
        ingredient.setStock(ingredient.getStock() - ammount_to_remove);
    }

    @Override
    public boolean isAvailable(String name) throws FoodDoesNotExistException {
        Ingredient food = (Ingredient) this.getFood(name);
        return food.getStock() >= 1;

    }

    @Override
    public void SetStockToIngredient(String ingredient, int amount) throws FoodDoesNotExistException {
        Ingredient food = (Ingredient) this.getFood(ingredient);
        food.setStock(amount);
        food.setStock(amount);
    }

    @Override
    public Food createFood(String type, int calories, int proteins, int carbs, int fat, String name, int portionSize) {
        Food food = null;
        switch (type) {
            case "LIQUID":
                food = new LiquidIngredientClass(name, calories, proteins, carbs, fat, portionSize);
                break;
            case "SOLID":
                food = new SolidIngredientClass(name, calories, proteins, carbs, fat, portionSize);
                break;
            case "COUNTABLE":
                food = new CountableIngredientClass(name, calories, proteins, carbs, fat, portionSize);
                break;
            case "CUSTOM":
                food = new CustomMealClass(calories, proteins, carbs, fat, name, portionSize);
                break;
        }
        if (!type.equals("CUSTOM"))
            all_food.put(food.getName(), food);
        return food;
    }

    @Override
    public Iterator<Ingredient> ListAvailableIngredients() {
        return available_ingredients.values().iterator();
    }

    @Override
    public Iterator<Food> listAllFood() {
        return all_food.values().iterator();
    }

}





