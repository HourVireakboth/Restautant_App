 package com.masterblncoding.restautantapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

 public class MainActivity extends AppCompatActivity {
    CardView startCard;
    CardView menuCard;

    CardView dessertCard;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        startCard = findViewById(R.id.card_View_Stater);
        menuCard = findViewById(R.id.card_View_main);
        dessertCard = findViewById(R.id.card_View_Dessert);


        startCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent starterActivityIntent = new Intent( MainActivity.this,Starter_Activity.class);
                startActivity(starterActivityIntent);
            }
        });

        menuCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent starterActivityIntent = new Intent( MainActivity.this,MainCourses_Activity.class);
                startActivity(starterActivityIntent);
            }
        });

        TextView emailTextview = findViewById(R.id.text_view_Email);
        emailTextview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent launchEmailAppIntent = new Intent(Intent.ACTION_SENDTO);
                launchEmailAppIntent.setData(Uri.parse("mailto:hourvireakboth88@gmail.com"));
                startActivity(launchEmailAppIntent);
            }
        });

        dessertCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent dessertActivityIntent = new Intent(MainActivity.this,DerrsertsActivity.class);
                startActivity(dessertActivityIntent);
            }
        });



    }
}