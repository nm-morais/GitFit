package com.example.nunomorais.GitFit.Recipes;

import com.example.nunomorais.GitFit.Food.IngredientClass;

import java.io.Serializable;
import java.util.Iterator;
import java.util.List;

/**
 * Created by Leonardo on 25/03/2017.
 */

public class Recipe implements Serializable {

    int calories, proteins, carbs, fat;
    private String steps, description;
    private List<IngredientClass> ingredientClasses;
    private String name;

    public Recipe(String name, String description, List<IngredientClass> ingredientClasses) {
        this.name = name;
        this.description = description;
        this.ingredientClasses = ingredientClasses;
        this.updateMacros();
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

        Iterator<IngredientClass> ingredient_iterator = ingredientClasses.iterator();
        IngredientClass next = null;
        while (ingredient_iterator.hasNext()) {
            next = (IngredientClass) ingredient_iterator.next();
            this.calories += next.getCalories();
            this.carbs += next.getCarbs();
            this.proteins += next.getProteins();
        }
    }

    public List<IngredientClass> getIngredientClasses() {
        return ingredientClasses;
    }

    public Iterator<IngredientClass> getIngredientIterator() {
        return ingredientClasses.iterator();
    }

    public void removeIngredient(IngredientClass ingredientClass) {
        ingredientClasses.remove(ingredientClass);
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