package com.example.nunomorais.a123;

import java.util.Iterator;
import java.util.List;

/**
 * Created by Leonardo on 25/03/2017.
 */

public class Recipe {

    int calories, proteins, carbs, fat;
    private String steps, description;
    private List<Ingredient> ingredients;
    private String name;

    public Recipe(String name, String steps, String description, List<Ingredient> ingredients) {
        this.steps = steps;
        this.name = name;
        this.description = description;
        this.ingredients = ingredients;
        this.updateMacros();
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

    private void updateMacros() {

        this.calories = 0;
        this.carbs = 0;
        this.proteins = 0;

        Iterator<Ingredient> ingredient_iterator = ingredients.iterator();
        Ingredient next = null;
        while (ingredient_iterator.hasNext()) {
            next = (Ingredient) ingredient_iterator.next();
            this.calories += next.getCalories();
            this.carbs += next.getCarbs();
            this.proteins += next.getProteins();
        }
    }

    public List<Ingredient> getIngredients() {
        return ingredients;
    }

    public Iterator getIngredientIterator() {
        return ingredients.iterator();
    }

    public void removeIngredient(Ingredient ingredient) {
        ingredients.remove(ingredient);
        this.updateMacros();
    }

    public int getCalories() {
        return calories;
    }


    public int getProteins() {
        return proteins;
    }

    public int getCarbs() {
        return carbs;
    }


    public int getFat() {
        return fat;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
