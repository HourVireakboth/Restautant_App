package com.masterblncoding.restautantapp;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainCourses_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_courses);
        ListView mainCoursesList = findViewById(R.id.list_view_main);

        Dish [] mainCourses  = {
                new Dish("Vireakboth","Welcome to learn Java Android",500.30) ,
                new Dish("Dyna","Welcome to learn Java Android",999.30) ,
                new Dish("soklay","Welcome to learn Java Android",340.30) ,
                new Dish("Kakda","Welcome to learn Java Android",455.30) ,
        };

        ArrayAdapter<Dish> mainAdapter = new ArrayAdapter<>(this , android.R.layout.simple_list_item_1,mainCourses);
        mainCoursesList.setAdapter(mainAdapter);
    }
}