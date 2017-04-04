package com.example.nunomorais.GitFit.Food;

import java.io.Serializable;

/**
 * Created by nunom on 30/03/2017.
 */

public interface Food extends Serializable {

    /**
     * returns the calorie content
     * @return
     */
    int getCalories();

    int getCarbs();

    int getFat();

    String getName();

    int getProteins();
}
