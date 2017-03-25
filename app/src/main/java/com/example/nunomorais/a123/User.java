package com.example.nunomorais.a123;

/**
 * Created by messuped on 3/25/17.
 */

public class User {

    private int age, height, weight, reqCal, actIndex, reqCarbs, reqProtein, reqFat;
    private char sex;
    private double bmi;
    private String name;

    public User(String name, int age, char sex, double bmi, int height, int weight, int reqCal, int actIndex, int reqCarbs, int reqProtein, int reqFat) {
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.bmi = bmi;
        this.height = height;
        this.weight = weight;
        this.reqCal = reqCal;
        this.actIndex = actIndex;
        this.reqCarbs = reqCarbs;
        this.reqProtein = reqProtein;
        this.reqFat = reqFat;

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

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
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
        return bmi;
    }

    public void setBmi(double bmi) {
        this.bmi = bmi;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
