package com.masterblncoding.restautantapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class DerrsertsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_derrserts);

        ListView dessertList = findViewById(R.id.list_view_dessert);



        Dish [] dessert  = {
                new Dish("Java Spring Boot","Welcome to learn Java Android",500.30) ,
                new Dish("Flutter and Dart","Welcome to learn Java Android",999.30) ,
                new Dish("HTML CSS & Java Scrip","Welcome to learn Java Android",340.30) ,
                new Dish("React and ReactJs","Welcome to learn Java Android",455.30) ,
                new Dish("Java Spring Boot","Welcome to learn Java Android",500.30) ,
                new Dish("Flutter and Dart","Welcome to learn Java Android",999.30) ,
                new Dish("HTML CSS & Java Scrip","Welcome to learn Java Android",340.30) ,
                new Dish("React and ReactJs","Welcome to learn Java Android",455.30) ,
                new Dish("Java Spring Boot","Welcome to learn Java Android",500.30) ,
                new Dish("Flutter and Dart","Welcome to learn Java Android",999.30) ,
                new Dish("HTML CSS & Java Scrip","Welcome to learn Java Android",340.30) ,
                new Dish("React and ReactJs","Welcome to learn Java Android",455.30) ,
                new Dish("Java Spring Boot","Welcome to learn Java Android",500.30) ,
                new Dish("Flutter and Dart","Welcome to learn Java Android",999.30) ,
                new Dish("HTML CSS & Java Scrip","Welcome to learn Java Android",340.30) ,
                new Dish("React and ReactJs","Welcome to learn Java Android",455.30) ,
                new Dish("Java Spring Boot","Welcome to learn Java Android",500.30) ,
                new Dish("Flutter and Dart","Welcome to learn Java Android",999.30) ,
                new Dish("HTML CSS & Java Scrip","Welcome to learn Java Android",340.30) ,
                new Dish("React and ReactJs","Welcome to learn Java Android",455.30) ,
                new Dish("Java Spring Boot","Welcome to learn Java Android",500.30) ,
                new Dish("Flutter and Dart","Welcome to learn Java Android",999.30) ,
                new Dish("HTML CSS & Java Scrip","Welcome to learn Java Android",340.30) ,
                new Dish("React and ReactJs","Welcome to learn Java Android",455.30) ,

        };

        ArrayAdapter<Dish> dessertAdapter = new ArrayAdapter<>(this , android.R.layout.simple_list_item_1,dessert);
        dessertList.setAdapter(dessertAdapter );

    }
}