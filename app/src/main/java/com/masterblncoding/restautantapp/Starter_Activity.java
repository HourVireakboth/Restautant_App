package com.masterblncoding.restautantapp;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Starter_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_starter);
        ListView starterList = findViewById(R.id.list_item_new);

//        dishOne.title = ;
//        dishOne.description = ;
//        dishOne.price = ;

        Dish [] dishes  = {
                new Dish("Vireakboth","Welcome to learn Java Android",500.30) ,
                new Dish("Dyna","Welcome to learn Java Android",999.30) ,
                new Dish("soklay","Welcome to learn Java Android",340.30) ,
                new Dish("Kakda","Welcome to learn Java Android",455.30) ,
        };

        ArrayAdapter<Dish> dishAdapter = new  ArrayAdapter<>(this, android.R.layout.simple_list_item_1,dishes);
        starterList.setAdapter(dishAdapter);
    }
}