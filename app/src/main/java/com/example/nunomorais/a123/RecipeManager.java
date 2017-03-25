package com.example.nunomorais.a123;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/**
 * Created by nunomorais on 25/03/2017.
 */

public class RecipeManager {

    private HashMap<String, Recipe> all_recipes;
    private HashMap<String, Recipe> available_recipes;

    public RecipeManager() {

        all_recipes = new HashMap<>();
        available_recipes = new HashMap<>();
    }

    public Iterator<Recipe> getAllAvailableRecipes() {

        return available_recipes.values().iterator();
    }

    public Iterator<Recipe> getAllRecipes() {

        return all_recipes.values().iterator();
    }

    private void updateAvailableRecipes() {

        //TODO
    }

    public Recipe createRecipe(String name, String steps, String description, List<Ingredient> ingredients) {
        Recipe recipe = new Recipe(name, steps, description, ingredients);
        all_recipes.put(recipe);
        return recipe

    }
}
