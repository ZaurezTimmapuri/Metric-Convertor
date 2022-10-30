package com.example.metricconvert;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class Time extends AppCompatActivity {

    private EditText hour_textbox;
    private EditText min_textbox;
    private EditText sec_textbox;


    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_time);
        hour_textbox=findViewById(R.id.hour_textbox);
        min_textbox=findViewById(R.id.min_textbox);
        sec_textbox=findViewById(R.id.sec_textbox);
        Button button_time = findViewById(R.id.button_time);

        button_time.setOnClickListener(v -> {
            String hour_string = hour_textbox.getText().toString();
            String min_string = min_textbox.getText().toString();
            String sec_string = sec_textbox.getText().toString();

            if(!hour_string.isEmpty()) {
                double hour_value = Double.parseDouble(hour_string);

                double min_value = hour_value* 60;
                double sec_value = hour_value * 3600;

                min_textbox.setText("minutes value is " + min_value);
                sec_textbox.setText("seconds value is " + sec_value);
            }

            if (!min_string.isEmpty()) {
                double min_value = Double.parseDouble(min_string);

                double hour_value = min_value * 0.01666;
                double sec_value = min_value * 60;

                hour_textbox.setText("hour value is " + hour_value);
                sec_textbox.setText("seconds value is " + sec_value);
            }

            if (!sec_string.isEmpty()) {
                double sec_value = Double.parseDouble(sec_string);

                double hour_value = sec_value * 0.0002778;
                double min_value = sec_value * 0.01667;

                hour_textbox.setText("hour value is" + hour_value);
                min_textbox.setText("minutes value is" + min_value);
            }


        });

    }
}