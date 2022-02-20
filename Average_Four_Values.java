package com.example.ifteriousmathsolver;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Average_Four_Values extends AppCompatActivity {
    EditText editTextNumber3,editTextNumber4,editTextNumber5,editTextNumber6;
    Button button13;
    TextView textView17;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_average_four_values);
        editTextNumber3 = findViewById(R.id.editTextNumber3);
        editTextNumber4 = findViewById(R.id.editTextNumber4);
        editTextNumber5 = findViewById(R.id.editTextNumber5);
        editTextNumber6 = findViewById(R.id.editTextNumber6);
        button13 = findViewById(R.id.button13);
        textView17 = findViewById(R.id.textView17);
        button13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int val1 = Integer.parseInt(editTextNumber3.getText().toString());
                int val2 = Integer.parseInt(editTextNumber4.getText().toString());
                int val3 = Integer.parseInt(editTextNumber5.getText().toString());
                int val4 = Integer.parseInt(editTextNumber6.getText().toString());
                int val5 = (val1+val2+val3+val4)/4;
                textView17.setText("Average = "+val5);
            }
        });
    }
}