package com.masterblncoding.restautantapp;

import androidx.annotation.NonNull;

public class Dish {

    String title;
    String description;
    double price;


    Dish(String title ,String description , double price ){
        this.title = title;
        this.description = description;
        this.price =price;
    }

    @NonNull
    @Override
    public String toString() {
        return title;
    }
}
