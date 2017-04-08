package com.example.nunomorais.GitFit.Food;

import java.io.Serializable;
import java.util.Iterator;

interface FoodManager extends Serializable {


    /**
     * returns the food that has the name that has been specified
     *
     * @param name the name of the food
     * @return the food where name == name
     * @throws FoodDoesNotExistException
     */
    Food getFood(String name) throws FoodDoesNotExistException;


    /**
     * removes the food from all the system
     * @param name
     * @return the removed food
     * @throws FoodDoesNotExistException
     */
    Food removeFood(String name) throws FoodDoesNotExistException;

    /**
     * returns yes if such food is available
     *
     * @param name the name of the ingredient in question
     * @return yes if the food is available
     * @throws FoodDoesNotExistException
     */
    boolean isAvailable(String name) throws FoodDoesNotExistException;


    /**
     * sets the stock of the food to the desired ammount
     * @param ingredient the food to be stocked
     * @param amount the ammount of units
     * @throws FoodDoesNotExistException
     */
    void SetStockToIngredient(String ingredient, int amount) throws FoodDoesNotExistException;

    /**
     * creates a new ingredient
     * @param type the type of ingredient
     * @param calories the calories in each portion
     * @param proteins the proteins in each portion
     * @param carbs the carbs in each portion
     * @param fat the fat in each portion
     * @param name the name of the food
     * @param portionSize the portion size
     * @return the created food
     */
    Food createFood(String type, int calories, int proteins, int carbs, int fat, String name, int portionSize);

    /**
     * lists all the available ingredients in the system
     *
     * @return the iterator of available food
     */
    Iterator<Ingredient> ListAvailableIngredients();

    /**
     * lists all food in the system
     * @return iterator of food, in no specific order
     */
    Iterator<Food> listAllFood();

    /**
     * removes 1 stock from the food (where you use it in meals
     *
     * @param name
     * @throws FoodDoesNotExistException
     */
    void updateAvailability(String name, int ammount_to_remove) throws FoodDoesNotExistException;

}
