package com.example.metricconvert;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class HomeScreen extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_screen);
        ImageButton length_button = findViewById(R.id.image_button);
        ImageButton mass_button = findViewById(R.id.mass_button);
        ImageButton time_button= findViewById(R.id.time_button);



        time_button.setOnClickListener(v -> {
            Intent c = new Intent(HomeScreen.this,Time.class);
            startActivity(c);
        });

        mass_button.setOnClickListener(v -> {
            Intent b = new Intent(HomeScreen.this,Mass.class);
            startActivity(b);
        });


        length_button.setOnClickListener(v -> {
            Intent a = new Intent(HomeScreen.this,Length.class);
            startActivity(a);
        });

    }
}