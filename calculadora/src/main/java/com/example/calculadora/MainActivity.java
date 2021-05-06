package com.example.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;
import android.view.View;

public class MainActivity extends AppCompatActivity {
     Double num1;
     Double num2;
     Double resultado;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    public void guardarNum1 (View view) {
        TextView tv = findViewById(R.id.textView);
        num1 = Double.parseDouble(tv.getText().toString());
        tv.setText("");
    }

    public void guardarNum2 (View view) {
        TextView tv = findViewById(R.id.textView);
        num1 = Double.parseDouble(tv.getText().toString());
        tv.setText("");
    }

    public void botonSumar (View view) {
        guardarNum1(view);
        guardarNum2(view);

        resultado = num1 + num2;
    }

    public void botonRestar (View view) {
        guardarNum1(view);
        guardarNum2(view);
        resultado = num1 - num2;
    }

    public void botonMultiplicar (View view) {
        guardarNum1(view);
        guardarNum2(view);
        resultado = num1 * num2;
    }

    public void botonDividir (View view) {
        guardarNum1(view);
        guardarNum2(view);
        resultado = num1 / num2;
    }



    public void resultado (View view) {
        TextView tv = findViewById(R.id.textView);
        num2 = Double.parseDouble(tv.getT)
    }

    public void btn0 (View view) {
        TextView tv = findViewById(R.id.textView);
        tv.setText(tv.getText().toString() + "0");
    }

    public void btn1 (View view) {
        TextView tv = findViewById(R.id.textView);
        tv.setText(tv.getText().toString() + "1");
    }

    public void btn2 (View view) {
        TextView tv = findViewById(R.id.textView);
        tv.setText(tv.getText().toString() + "2");
    }

    public void btn3 (View view) {
        TextView tv = findViewById(R.id.textView);
        tv.setText(tv.getText().toString() + "3");
    }

    public void btn4 (View view) {
        TextView tv = findViewById(R.id.textView);
        tv.setText(tv.getText().toString() + "4");
    }

    public void btn5 (View view) {
        TextView tv = findViewById(R.id.textView);
        tv.setText(tv.getText().toString() + "5");
    }

    public void btn6 (View view) {
        TextView tv = findViewById(R.id.textView);
        tv.setText(tv.getText().toString() + "6");
    }
    public void btn7 (View view) {
        TextView tv = findViewById(R.id.textView);
        tv.setText(tv.getText().toString() + "7");
    }

    public void btn8 (View view) {
        TextView tv = findViewById(R.id.textView);
        tv.setText(tv.getText().toString() + "8");
    }

    public void btn9 (View view) {
        TextView tv = findViewById(R.id.textView);
        tv.setText(tv.getText().toString() + "9");
    }
}