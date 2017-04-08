package com.example.nunomorais.GitFit;

import android.app.Application;

import com.example.nunomorais.GitFit.Food.Food;
import com.example.nunomorais.GitFit.Food.FoodManagerClass;
import com.example.nunomorais.GitFit.Food.IngredientClass;
import com.example.nunomorais.GitFit.Food.MealClass;
import com.example.nunomorais.GitFit.Logs.History;
import com.example.nunomorais.GitFit.Logs.Log;
import com.example.nunomorais.GitFit.Recipes.Recipe;
import com.example.nunomorais.GitFit.Recipes.RecipeManager;
import com.example.nunomorais.GitFit.Recipes.RecipeNotExistingException;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;


public class Gitfit extends Application implements Serializable {

    private FoodManagerClass food_manager;
    private RecipeManager recipe_manager;
    private History history;
    private User user;
    private Log current_log;

    public Gitfit() {

        recipe_manager = new RecipeManager();
        food_manager = new FoodManagerClass();
        history = new History();


    }


    public void addRecipe(String name, String steps, String description, List<IngredientClass> ingredientClasses) {
        recipe_manager.createRecipe(name, description, ingredientClasses);
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
        long millisIn24Hours = 1000 * 60 * 60 * 24;
        Date timestamp = new Date();
        Date hours24ago = new Date(new Date().getTime() - millisIn24Hours);

        if (timestamp.before(hours24ago)) {
            this.current_log = history.addLog();
        }
    }

    public void createUser(String name, int age, char sex, int height, int weight,
                           int reqCal, int actIndex, int reqCarbs, int reqProtein, int reqFat) {
        this.user = new User(name, age, sex, height, weight, reqCal, actIndex, reqCarbs, reqProtein, reqFat);

    }

    public User getUser() {
        return this.user;
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

    public ArrayList<String> getInventory() {

        ArrayList<String> to_return = new ArrayList<>();
        Iterator it = food_manager.listAllFood();
        while (it.hasNext()) {
            IngredientClass next = (IngredientClass) it.next();
            to_return.add(next.getName() + " Stock: " + next.getStock());
        }
        return to_return;
    }

    public ArrayList<String> getRecipes() {
        ArrayList<String> to_return = new ArrayList<>();
        Iterator it = recipe_manager.getAllRecipes();
        while (it.hasNext()) {
            Recipe next = (Recipe) it.next();
            to_return.add(next.getName());
        }
        return to_return;
    }


    public Iterator<Food> getAllFoods() {
        return this.food_manager.listAllFood();
    }

    public void addFood(String type, String name, int calories, int protein, int carbs, int fat, int portionSize) {
        food_manager.createFood(type, calories, protein, carbs, fat, name, portionSize);
    }

    public void setFoodStock(String name, int amount) {
        food_manager.SetStockToIngredient(name, amount);
    }

    public void removeFood(String name) {
        food_manager.removeFood(name);
    }

    public void addMeal(List<Food> food, String name) {
        MealClass mealClass = new MealClass(food, name);
        this.current_log.addMeal(mealClass);
    }

    public void addRecipe(String name, String description, List<IngredientClass> ingredientClasses) {
        recipe_manager.createRecipe(name, description, ingredientClasses);
    }

    public Iterator<MealClass> getAllMealsInLog() {
        return this.current_log.getMealClasses();
    }


    public Iterator<Log> seeHistory() {
        return this.history.getAllHistory();
    }


}
