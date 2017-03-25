package com.example.nunomorais.a123;

import com.example.nunomorais.a123.Food.Food;
import com.example.nunomorais.a123.Food.FoodManager;
import com.example.nunomorais.a123.Food.Ingredient;
import com.example.nunomorais.a123.Food.Meal;
import com.example.nunomorais.a123.Logs.History;
import com.example.nunomorais.a123.Logs.Log;
import com.example.nunomorais.a123.Recipes.Recipe;
import com.example.nunomorais.a123.Recipes.RecipeManager;
import com.example.nunomorais.a123.Recipes.RecipeNotExistingException;

import java.io.Serializable;
import java.util.Iterator;
import java.util.List;

/**
 * Created by messuped on 3/25/17.
 */

public class Gitfit implements Serializable {

    private FoodManager food_manager;
    private RecipeManager recipe_manager;
    private History history;
    private User user;
    private Log current_log;


    public void addRecipe(String name, String steps, String description, List<Ingredient> ingredients) {
        recipe_manager.createRecipe(name, steps, description, ingredients);
    }

    public void removeRecipe(String name) throws RecipeNotExistingException {
        recipe_manager.removeRecipe(name);
    }

    public Iterator<Recipe> getAvailableRecipes() {
        return recipe_manager.getAllAvailableRecipes();
    }

    public Iterator<Recipe> getAllRecipes() {
        return recipe_manager.getAllRecipes();
    }

    private void checkIfDayHasPassed() {
        //TODO
    }

    public void editUser(String name, int age, char sex, int height, int weight,
                         int reqCal, int actIndex, int reqCarbs, int reqProtein, int reqFat) {
        user.setName(name);
        user.setAge(age);
        user.setHeight(height);
        user.setWeight(weight);
        user.setSex(sex);
        user.setReqCarbs(reqCarbs);
        user.setReqFat(reqFat);
        user.setActIndex(actIndex);
        user.setReqCal(reqCal);
        user.setReqProtein(reqProtein);

    }

    public void createLog() {
        this.current_log = new Log();
    }

    public Iterator<Food> getInventory() {
        return this.food_manager.ListAvailableIngredients();
    }

    public Iterator<Food> getAllFoods() {
        return this.food_manager.listAllFood();
    }

    public void addFood(String type, String name, int calories, int protein, int carbs, int fat) {
        food_manager.createFood(type, calories, protein, carbs, fat, name);
    }

    public void removeFood(String name) {
        food_manager.removeFood(name);
    }

    public void addMeal(List<Food> food, String name) {
        Meal meal = new Meal(food, name);
        this.current_log.addMeal(meal);
    }

    public Iterator<Meal> getAllMealsInLog() {
        return this.current_log.getMeals();
    }


    public Iterator<Log> seeHistory() {
        return this.history.getAllHistory();
    }


}
