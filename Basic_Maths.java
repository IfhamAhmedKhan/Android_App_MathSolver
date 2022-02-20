package com.example.ifteriousmathsolver;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Basic_Maths extends AppCompatActivity {
    TextView textView,textView2,textView3,textView4;
    Button button;
    EditText n1,n2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_basic_maths);
        textView = findViewById(R.id.textView);
        textView2 = findViewById(R.id.textView2);
        textView3 = findViewById(R.id.textView3);
        textView4 = findViewById(R.id.textView4);
        n1 = findViewById(R.id.n1);
        n2 = findViewById(R.id.n2);
        button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int sum = Integer.parseInt(n1.getText().toString()) + Integer.parseInt(n2.getText().toString());
                int sum2 = Integer.parseInt(n1.getText().toString()) - Integer.parseInt(n2.getText().toString());
                int sum3 = Integer.parseInt(n1.getText().toString()) * Integer.parseInt(n2.getText().toString());
                int sum4 = Integer.parseInt(n1.getText().toString()) / Integer.parseInt(n2.getText().toString());
                textView.setText("Addition: " + sum);
                textView2.setText("Subtraction: " + sum2);
                textView3.setText("Multiplication: " + sum3);
                textView4.setText("Division: " + sum4);
            }
        });
    }
}