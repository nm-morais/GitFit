package com.example.nunomorais.a123.Recipes;

import com.example.nunomorais.a123.Food.Ingredient;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;

/**
 * Created by nunomorais on 25/03/2017.
 */

public class RecipeManager {

    private LinkedHashMap<String, Recipe> all_recipes;
    private LinkedHashMap<String, Recipe> available_recipes;

    public RecipeManager() {
        all_recipes = new LinkedHashMap<>();
        available_recipes = new LinkedHashMap<>();
    }

    public Iterator<Recipe> getAllAvailableRecipes() {
        return available_recipes.values().iterator();
    }

    public Iterator<Recipe> getAllRecipes() {
        return all_recipes.values().iterator();
    }

    private void updateAvailableRecipes() {


        Recipe recipe = null;
        Iterator<Recipe> recipe_iterator = all_recipes.values().iterator();
        Ingredient ingredient;
        boolean available;

        //PRAY TO THE GODS !!!!
        while (recipe_iterator.hasNext()) {
            available = true;
            Recipe current = recipe_iterator.next();
            Iterator<Ingredient> ingredient_iterator = recipe.getIngredientIterator();
            while (ingredient_iterator.hasNext() && available == true) {
                ingredient = ingredient_iterator.next();
                if (ingredient.getStock() == 0) available = false;
            }
            if (available) available_recipes.put(current.getName(), current);
            else if (available_recipes.containsValue(recipe)) available_recipes.remove(recipe);
        }

    }

    public void cookRecipe(String name) throws RecipeNotExistingException, RecipeNotAvailableException {
        Recipe recipe = this.getRecipe(name);
        if (!available_recipes.containsValue(recipe)) throw new RecipeNotAvailableException();
        Iterator<Ingredient> ingredient_iterator = recipe.getIngredientIterator();
        while (ingredient_iterator.hasNext()) {
            Ingredient next_ingredient = ingredient_iterator.next();
            next_ingredient.setStock(next_ingredient.getStock() - 1);
        }
        updateAvailableRecipes();
    }


    public Recipe getRecipe(String name) throws RecipeNotExistingException {
        Recipe recipe = all_recipes.get(name);
        if (recipe == null) throw new RecipeNotExistingException();
        return recipe;
    }

    public Recipe createRecipe(String name, String steps, String description, List<Ingredient> ingredients) {
        Recipe recipe = new Recipe(name, steps, description, ingredients);
        all_recipes.put(name, recipe);
        updateAvailableRecipes();
        return recipe;

    }

    public Recipe removeRecipe(String name) throws RecipeNotExistingException {
        Recipe recipe = this.getRecipe(name);
        all_recipes.remove(recipe);
        if (available_recipes.containsValue(recipe)) available_recipes.remove(recipe);
        return recipe;
    }
}