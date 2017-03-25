package com.example.nunomorais.a123;

import java.io.Serializable;
import java.util.Iterator;
import java.util.List;

/**
 * Created by messuped on 3/25/17.
 */

public class Gitfit implements Serializable {
    private FoodManager foodm;
    private RecipeManager recm;
    private History history;
    private User user;


    public void addRecipe(String name, String steps, String description, List<Ingredient> ingredients){
        recm.createRecipe(name,steps,descriptions,ingredients);
    }

    public void removeRecipe(String name){
        recm.removeRecipe(name);
    }

    public Iterator<Recipe> getAvailableRecipes(){
        return recm.getAllAvailableRecipes();
    }

    public Iterator<Recipe> getAllRecipes(){
        return recm.getAllRecipes();
    }

    public void editUser(String name, int age, char sex, double bmi, int height, int weight, int reqCal, int actIndex, int reqCarbs, int reqProtein, int reqFat){
        user.setName(name);
    }
}
