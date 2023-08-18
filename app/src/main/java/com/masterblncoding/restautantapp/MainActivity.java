package com.masterblncoding.restautantapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    CardView startCard;
    CardView menuCard;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        startCard = findViewById(R.id.card_View_Stater);
        menuCard = findViewById(R.id.card_View_main);

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
                Intent starterActivityIntent = new Intent( MainActivity.this,Starter_Activity.class);
                startActivity(starterActivityIntent);
            }
        });


    }
}