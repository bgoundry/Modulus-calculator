package com.example.moduluscalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class IntegerDivide extends AppCompatActivity {


    private EditText numer, denom;
    private Button calculate;
    private TextView result;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_integer);

        numer = (EditText) findViewById(R.id.intNumer);
        denom = (EditText) findViewById(R.id.intDenom);
        calculate = (Button) findViewById(R.id.intButton);
        result = (TextView) findViewById(R.id.intResult);

        calculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String numerator = numer.getText().toString().trim();
                String denominator = denom.getText().toString().trim();

                if (numerator.isEmpty() && denominator.isEmpty()){
                    numer.setError("");
                    denom.setError("");
                } else if (denominator.isEmpty()){
                    denom.setError("");
                } else if (numerator.isEmpty()){
                    numer.setError("");
                } else {
                    int numNumerator = Integer.parseInt(numerator);
                    int numDenominator = Integer.parseInt(denominator);
                    int numAnswer = numNumerator / numDenominator;

                    result.setText("" + numAnswer);
                }
            }
        });


    }
}