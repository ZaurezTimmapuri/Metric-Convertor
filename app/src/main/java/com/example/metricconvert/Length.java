package com.example.metricconvert;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class Length extends AppCompatActivity {
 private EditText  metre_textbox;
 private EditText foot_textbox;
 private EditText centimeter_textbox;

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_length);

        metre_textbox = findViewById(R.id.metre_textbox);
        foot_textbox = findViewById(R.id.foot_textbox);
        centimeter_textbox = findViewById(R.id.centimeter_textbox);

        Button convert = findViewById(R.id.button);

        convert.setOnClickListener(v -> {
            String meter_string = metre_textbox.getText().toString();
            String foot_string = foot_textbox.getText().toString();
            String centimeter_string = centimeter_textbox.getText().toString();


            if(!meter_string.isEmpty()) {
                double meter_value = Double.parseDouble(meter_string);

                double centimeter_value = meter_value * 100;
                double foot_value = meter_value * 3.280;

                centimeter_textbox.setText("centimetre value is " + centimeter_value);
                foot_textbox.setText("foot value is " + foot_value);
            }

            if (!foot_string.isEmpty()) {
                double foot_value = Double.parseDouble(foot_string);

                double meter_value = foot_value * 0.3048;
                double centimeter_value = foot_value * 30.48;

                metre_textbox.setText("metre value is " + meter_value);
                centimeter_textbox.setText("centimetre value is " + centimeter_value);
            }

            if (!centimeter_string.isEmpty()) {
                double centimeter_value = Double.parseDouble(centimeter_string);

                double meter_value = centimeter_value * 0.01;
                double foot_value = centimeter_value * 0.0328;

                metre_textbox.setText("metre value is" + meter_value);
                foot_textbox.setText("foot value is" + foot_value);
            }
        });
    }
}

