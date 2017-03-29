package com.example.nunomorais.GitFit.Food;

import java.io.Serializable;
import java.util.Iterator;

/**
 * Created by nunom on 30/03/2017.
 */

interface FoodManager extends Serializable {

    Food getFood(String name) throws FoodDoesNotExistException;

    Food removeFood(String name) throws FoodDoesNotExistException;

    boolean isAvailable(String name) throws FoodDoesNotExistException;

    void SetStockToIngredient(String ingredient, int amount) throws FoodDoesNotExistException;

    Food createFood(String type, int calories, int proteins, int carbs, int fat, String name);

    Iterator<Food> ListAvailableIngredients();

    Iterator<Food> listAllFood();

    Iterator<Food> listByCal();
}
