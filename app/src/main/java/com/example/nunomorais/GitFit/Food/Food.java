package com.example.nunomorais.GitFit.Food;

import java.io.Serializable;


public interface Food extends Serializable {

    /**
     * returns the calorie content per portion size
     * @return integer calories
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
     * @param portionsize the size of the portion of the food
     * @param carbs the carbs in each portion
     * @param fat the fat in each portion
     * @param protein the protein in each portion
     * @param name the name of the food
     * @return the edited food
     */
    Food editFood(int calories, int portionsize,int carbs, int fat , int protein, String name );

}

