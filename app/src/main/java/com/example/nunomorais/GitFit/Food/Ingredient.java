package com.example.nunomorais.GitFit.Food;

import java.io.Serializable;


interface Ingredient extends Food, Serializable {


    /**
     * returns the stock of food the user has in their home
     * @return int stock
     */
    int getStock();

    /**
     * sets the stock of the food to the inserted value
     * @param stock the actual stock
     */
    void setStock(int stock);

    /**
     * removes one unit from the stock (to when a person does a recipe with this ingredient
     * @return the current stock
     */
    int  removeUnit();
}
