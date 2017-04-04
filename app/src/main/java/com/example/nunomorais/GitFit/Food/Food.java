package com.example.nunomorais.GitFit.Food;

import java.io.Serializable;

/**
 * Created by nunom on 30/03/2017.
 */

public interface Food extends Serializable {

    /**
     * returns the calorie content per portion size
     * @return
     */
    int getCalories();

    /**
     * returns the portion size of the ingredient
     * @return int portion size
     */
    int getportion();

    /**
     * returns the carbohydrate content of the food dependent on the portion size
     * @return int carbohydrates
     */
    int getCarbs();

    /**
     * returns the fat content of the food dependent on the portion size
     * @return int fat
     */
    int getFat();

    /**
     * returns the name of the food
     * @return String name
     */
    String getName();

    /**
     * returns the protein content of the food dependent on the portion size
     * @return int fat
     */
    int getProtein();


    /**
     * edits all the food stats
     * @param portionsize
     * @param carbs
     * @param fat
     * @param protein
     * @param name
     * @return the edited food
     */
    Food editFood(int calories, int portionsize,int carbs, int fat , int protein, String name );

}

