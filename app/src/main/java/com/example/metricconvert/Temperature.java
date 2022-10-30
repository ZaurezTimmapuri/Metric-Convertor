package com.example.metricconvert;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Temperature extends AppCompatActivity {
    private EditText celcius_textbox;
    private EditText farenheit_textbox;
    private EditText kelvin_textbox;
    private Button button_temperature;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_temperature);
        celcius_textbox=findViewById(R.id.celcius_textbox);
        farenheit_textbox=findViewById(R.id.farenheit_textbox);
        kelvin_textbox=findViewById(R.id.kelvin_textbox);

        button_temperature.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String celcius_string= celcius_textbox.getText().toString();
                String farenheit_string=farenheit_textbox.getText().toString();
                String kelvin_string=kelvin_textbox.getText().toString();

                if(!celcius_string.isEmpty()){
                    double celcius_value = Double.parseDouble(celcius_string);
                    double farenheit_value= (celcius_value*1.8)+ 32;
                    double kelvin_value= celcius_value + 273.15;
                    farenheit_textbox.setText("farenheit value is "+farenheit_value);
                    kelvin_textbox.setText("kelvin vakue is "+ kelvin_value);
                }
            }
        });



    }
}