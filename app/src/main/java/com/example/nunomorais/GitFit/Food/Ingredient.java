package com.example.nunomorais.GitFit.Food;

import java.io.Serializable;

/**
 * Created by nunom on 30/03/2017.
 */

interface Ingredient extends Food, Serializable {
    int getStock();

    void setStock(int stock);

    void removeUnit();
}
