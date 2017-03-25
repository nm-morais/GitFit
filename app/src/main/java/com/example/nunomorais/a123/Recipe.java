package com.example.nunomorais.a123;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Leonardo on 25/03/2017.
 */

public class Recipe {

    private String steps, description;
    private Map<String, Ingredient> ingredients;
    int calories, proteins, carbs, fat;

    public Recipe(String steps, String description, int calories, int proteins, int carbs, int fat) {
        this.steps = steps;
        this.description = description;
        ingredients = new HashMap<String, Ingredient>();
        this.calories = calories;
        this.proteins = proteins;
        this.carbs = carbs;
        this.fat = fat;
    }

    public String getSteps() {
        return steps;
    }

    public void setSteps(String steps) {
        this.steps = steps;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Map<String, Ingredient> getIngredients() {
        return ingredients;
    }

    public void setIngredients(Ingredient ingredient) {
        ingredients.put(ingredient.getName(), ingredient);
    }

    public void removeIngredient(Ingredient ingredient) {
        ingredients.remove(ingredient.getName());
    }

    public int getCalories() {
        return calories;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }

    public int getProteins() {
        return proteins;
    }

    public void setProteins(int proteins) {
        this.proteins = proteins;
    }

    public int getCarbs() {
        return carbs;
    }

    public void setCarbs(int carbs) {
        this.carbs = carbs;
    }

    public int getFat() {
        return fat;
    }

    public void setFat(int fat) {
        this.fat = fat;
    }
}
