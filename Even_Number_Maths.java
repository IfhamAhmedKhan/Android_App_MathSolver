package com.example.ifteriousmathsolver;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Even_Number_Maths extends AppCompatActivity {

    TextView textView2;
    Button button6;
    EditText editTextNumber2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_even_number_maths);
        editTextNumber2 = findViewById(R.id.editTextNumber2);
        textView2 = findViewById(R.id.textView2);
        button6 = findViewById(R.id.button6);
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int val = Integer.parseInt(editTextNumber2.getText().toString());
                if(val % 2 == 0){
                    textView2.setText("Number is even");
                }
                else{
                    textView2.setText("Number is not even");
                }
            }
        });
    }
}