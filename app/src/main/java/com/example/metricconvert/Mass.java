package com.example.metricconvert;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class Mass extends AppCompatActivity {

    private EditText kilogram_textbox;
    private EditText pound_textbox;
    private EditText gram_textbox;

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mass);
        kilogram_textbox=findViewById(R.id.kilogram_textbox);
        pound_textbox=findViewById(R.id.pound_textbox);
        gram_textbox=findViewById(R.id.gram_textbox);
        Button button_mass = findViewById(R.id.button_mass);

        button_mass.setOnClickListener(v -> {


            String kilogram_string= kilogram_textbox.getText().toString();
            String pound_string= pound_textbox.getText().toString();
            String gram_string=gram_textbox.getText().toString();

            if(!kilogram_string.isEmpty()){
                double kilogram_value= Double.parseDouble(kilogram_string);
                double pound_value= 2.20462*kilogram_value;
                double gram_value=1000*kilogram_value;
                pound_textbox.setText("pound value is "+pound_value);
                gram_textbox.setText("gram value is "+gram_value);
            }
            if(!pound_string.isEmpty()){
                double pound_value= Double.parseDouble(pound_string);
                double kilogram_value= 0.453592*pound_value;
                double gram_value=453.592*pound_value;
                kilogram_textbox.setText("pound value is "+kilogram_value);
                gram_textbox.setText("gram value is "+gram_value);
            }
            if(!gram_string.isEmpty()){
                double gram_value= Double.parseDouble(gram_string);
                double kilogram_value= 0.001*gram_value;
                double pound_value=0.002204*gram_value;
                kilogram_textbox.setText("pound value is "+kilogram_value);
                pound_textbox.setText("gram value is "+pound_value);
            }



        });






    }
}