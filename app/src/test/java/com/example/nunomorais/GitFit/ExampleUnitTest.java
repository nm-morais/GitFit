package com.example.nunomorais.GitFit;

import com.example.nunomorais.GitFit.Food.Food;

import org.junit.Test;

import java.util.Iterator;
import java.util.Map;

import static org.junit.Assert.assertEquals;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    Gitfit g = new Gitfit();



    public void testRecipes(){
        g.addFood("liquid","agua",1,1,1,1);
        g.addFood("liquid","aga",0,0,0,0);
        g.addFood("liquid","aua",2,2,2,2);
        g.addFood("liquid","a",4,4,4,4);
        g.setFoodStock("agua", 3);
        g.setFoodStock("a",2);

        Iterator<Food> itAll = g.getAllFoods();
        Iterator<Food> itAv = g.getAvailableRecipes()
        Iterator<Food> itCal = g.getRecipiesByCal();

        while(itAll.hasNext()){
            System.out.println(itAll.next().getName());
        }
        System.out.println();

        while(itAv.hasNext()){
            System.out.println(itAll.next().getName());
        }
        System.out.println();

        while(itCal.hasNext()){
            System.out.println(itAll.next().getName());
        }
        System.out.println();
    }

}