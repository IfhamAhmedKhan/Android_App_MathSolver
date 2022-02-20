package com.example.ifteriousmathsolver;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Table_Maths extends AppCompatActivity {

    EditText editTextNumber;
    Button button;
    TextView textView,textView5,textView6,textView7,textView8,textView9,textView10,textView11,textView12,textView13;
    int var1=1,var2=2,var3=3,var4=4,var5=5,var6=6,var7=7,var8=8,var9=9,var10=10;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_table_maths);
        editTextNumber = findViewById(R.id.editTextNumber);
        textView = findViewById(R.id.textView);
        textView5 = findViewById(R.id.textView5);
        textView6 = findViewById(R.id.textView6);
        textView7 = findViewById(R.id.textView7);
        textView8 = findViewById(R.id.textView8);
        textView9 = findViewById(R.id.textView9);
        textView10 = findViewById(R.id.textView10);
        textView11 = findViewById(R.id.textView11);
        textView12 = findViewById(R.id.textView12);
        textView13 = findViewById(R.id.textView13);
        button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int table = Integer.parseInt(editTextNumber.getText().toString());
                int val1 = Integer.parseInt(editTextNumber.getText().toString())* var1;
                int val2 = Integer.parseInt(editTextNumber.getText().toString())* var2;
                int val3 = Integer.parseInt(editTextNumber.getText().toString())* var3;
                int val4 = Integer.parseInt(editTextNumber.getText().toString())* var4;
                int val5 = Integer.parseInt(editTextNumber.getText().toString())* var5;
                int val6 = Integer.parseInt(editTextNumber.getText().toString())* var6;
                int val7 = Integer.parseInt(editTextNumber.getText().toString())* var7;
                int val8 = Integer.parseInt(editTextNumber.getText().toString())* var8;
                int val9 = Integer.parseInt(editTextNumber.getText().toString())* var9;
                int val10 = Integer.parseInt(editTextNumber.getText().toString())* var10;
                textView.setText(table+" x 1 = " + val1);
                textView5.setText(table+" x 2 = " + val2);
                textView6.setText(table+" x 3 = " + val3);
                textView7.setText(table+" x 4 = " + val4);
                textView8.setText(table+" x 5 = " + val5);
                textView9.setText(table+" x 6 = " + val6);
                textView10.setText(table+" x 7 = " + val7);
                textView11.setText(table+" x 8 = " + val8);
                textView12.setText(table+" x 9 = " + val9);
                textView13.setText(table+" x 10 = " + val10);
            }
        });
    }
}