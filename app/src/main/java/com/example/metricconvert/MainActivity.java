package com.example.metricconvert;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class MainActivity extends AppCompatActivity {
    final Handler h = new Handler();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
         h.postDelayed(() -> {
             Intent i = new Intent(MainActivity.this,HomeScreen.class);
             startActivity(i);
             finish();

         },2000);
    }
}