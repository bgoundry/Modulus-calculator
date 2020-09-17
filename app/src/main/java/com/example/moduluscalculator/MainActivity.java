package com.example.moduluscalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void toModulus(View view){
        Intent intent = new Intent(MainActivity.this, Modulus.class);
        startActivity(intent);
    }

    public void toInteger(View view){
        Intent intent = new Intent(MainActivity.this, IntegerDivide.class);
        startActivity(intent);
    }
}