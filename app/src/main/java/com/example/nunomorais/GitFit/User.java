package com.example.nunomorais.GitFit;

import java.io.Serializable;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by messuped on 3/25/17.
 */

public class User implements Serializable {

    private int age, height, weight, reqCal, actIndex, reqCarbs, reqProtein, reqFat;
    private char sex;
    private double bmi;
    private String name;
    private List<Integer> weightHistory;

    public User(String name, int age, char sex, int height, int weight, int reqCal, int actIndex, int reqCarbs, int reqProtein, int reqFat) {
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.height = height;
        this.weight = weight;
        this.reqCal = reqCal;
        this.actIndex = actIndex;
        this.reqCarbs = reqCarbs;
        this.reqProtein = reqProtein;
        this.reqFat = reqFat;
        this.getBmi();
        this.weightHistory = new LinkedList<>();


    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getHeight() {
        return height;
    }

    public  void updateWeight(int newWeight) {
        this.weightHistory.add(newWeight);
    }

    public void setHeight(int height) {
        this.height = height;
        this.getBmi();
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
        this.getBmi();
    }

    public int getReqCal() {
        return reqCal;
    }

    public void setReqCal(int reqCal) {
        this.reqCal = reqCal;
    }

    public int getActIndex() {
        return actIndex;
    }

    public void setActIndex(int actIndex) {
        this.actIndex = actIndex;
    }

    public int getReqCarbs() {
        return reqCarbs;
    }

    public void setReqCarbs(int reqCarbs) {
        this.reqCarbs = reqCarbs;
    }

    public int getReqProtein() {
        return reqProtein;
    }

    public void setReqProtein(int reqProtein) {
        this.reqProtein = reqProtein;
    }

    public int getReqFat() {
        return reqFat;
    }

    public void setReqFat(int reqFat) {
        this.reqFat = reqFat;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public double getBmi() {
        this.bmi = weight / (height / 100 * (height / 100));
        return bmi;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
