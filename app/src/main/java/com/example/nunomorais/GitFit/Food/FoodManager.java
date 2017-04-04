package com.example.nunomorais.GitFit.Food;

import java.io.Serializable;
import java.util.Iterator;

/**
 * Created by nunom on 30/03/2017.
 */

interface FoodManager extends Serializable {


    /**
     * returns the food by the name that has been specified
     *
     * @param name
     * @return the food where name == name
     * @throws FoodDoesNotExistException
     */
    Food getFood(String name) throws FoodDoesNotExistException;


    /**
     * removes the food from all the datastructures that contain it
     *
     * @param name
     * @return the removed food
     * @throws FoodDoesNotExistException
     */
    Food removeFood(String name) throws FoodDoesNotExistException;

    boolean isAvailable(String name) throws FoodDoesNotExistException;

    void SetStockToIngredient(String ingredient, int amount) throws FoodDoesNotExistException;

    Food createFood(String type, int calories, int proteins, int carbs, int fat, String name, int portionSize);

    Iterator<Food> ListAvailableIngredients();

    Iterator<Food> listAllFood();

    void updateAvailability(String name) throws FoodDoesNotExistException;

}
