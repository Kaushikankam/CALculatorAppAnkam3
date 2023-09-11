package com.example.calculatorappankam;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    public void Add(View v){
        EditText number1 =(EditText)findViewById(R.id.no1);
        EditText number2 =(EditText)findViewById(R.id.no2);
        EditText result =(EditText)findViewById(R.id.result);

        int n1 = Integer.parseInt(number1.getText().toString());
        int n2 = Integer.parseInt(number2.getText().toString());
        int r = n1+n2;
        result.setText("  "+r);
    }

    public void minus(View v){
        EditText number1 =(EditText)findViewById(R.id.no1);
        EditText number2 =(EditText)findViewById(R.id.no2);
        EditText result =(EditText)findViewById(R.id.result);

        int n1 = Integer.parseInt(number1.getText().toString());
        int n2 = Integer.parseInt(number2.getText().toString());
        int r = n1-n2;
        result.setText("  "+r);
    }

    public void multiply(View v){
        EditText number1 =(EditText)findViewById(R.id.no1);
        EditText number2 =(EditText)findViewById(R.id.no2);
        EditText result =(EditText)findViewById(R.id.result);

        int n1 = Integer.parseInt(number1.getText().toString());
        int n2 = Integer.parseInt(number2.getText().toString());
        int r = n1*n2;
        result.setText("  "+r);
    }

    public void divide(View v){
        EditText number1 =(EditText)findViewById(R.id.no1);
        EditText number2 =(EditText)findViewById(R.id.no2);
        EditText result =(EditText)findViewById(R.id.result);

        int n1 = Integer.parseInt(number1.getText().toString());
        int n2 = Integer.parseInt(number2.getText().toString());
        int r = n1/n2;
        result.setText("  "+r);
    }
    public void square(View v) {
        EditText number1 = (EditText) findViewById(R.id.no1);
        EditText number2 = (EditText) findViewById(R.id.no2);
        EditText result = (EditText) findViewById(R.id.result);

        int n1 = Integer.parseInt(number1.getText().toString());
        int n2 = Integer.parseInt(number2.getText().toString());
        int r = n1*n1;
        result.setText("  " + r);
    }
    public void root(View v) {
        EditText number1 = (EditText) findViewById(R.id.no1);
        EditText number2 = (EditText) findViewById(R.id.no2);
        EditText result = (EditText) findViewById(R.id.result);

        int n1 = Integer.parseInt(number1.getText().toString());
        int n2 = Integer.parseInt(number2.getText().toString());
        double r = Math.sqrt(n1);



        result.setText("  " + r);


    }
    public void clear(View v) {
        EditText number1 = (EditText) findViewById(R.id.no1);
        EditText number2 = (EditText) findViewById(R.id.no2);
        EditText result = (EditText) findViewById(R.id.result);

        int n1 = Integer.parseInt(number1.getText().toString());
        int n2 = Integer.parseInt(number2.getText().toString());
        int r = n1 * n1;
        result.setText("  ");
        number1.setText("  ");
        number2.setText("   ");

    }

    public void power(View v) {
        EditText number1 = (EditText) findViewById(R.id.no1);
        EditText number2 = (EditText) findViewById(R.id.no2);
        EditText result = (EditText) findViewById(R.id.result);

        int n1 = Integer.parseInt(number1.getText().toString());
        int n2 = Integer.parseInt(number2.getText().toString());
        double r = Math.pow(n1, n2);
        result.setText("  " + r);
    }
}