package com.example.calculadora;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.calculadora.R;

import static android.provider.AlarmClock.EXTRA_MESSAGE;

public class MainActivity extends AppCompatActivity {
    public  static final String EXTRA_MESSAGE = "com.example.principal.MESSAGE";
    Double result;
    String oldNumber = "";
    String op = "+";
    boolean isNewOp = true;
    TextView ed1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ed1 = findViewById(R.id.textView);
    }

    public void numberEvent(View view) {
        if (isNewOp)
            ed1.setText("");
        isNewOp = false;
        String number = ed1.getText().toString();
        switch (view.getId()) {
            case R.id.btn1:
                number += "1";
                break;
            case R.id.btn2:
                number += "2";
                break;
            case R.id.btn3:
                number += "3";
                break;
            case R.id.btn4:
                number += "4";
                break;
            case R.id.btn5:
                number += "5";
                break;
            case R.id.btn6:
                number += "6";
                break;
            case R.id.btn7:
                number += "7";
                break;
            case R.id.btn8:
                number += "8";
                break;
            case R.id.btn9:
                number += "9";
                break;
            case R.id.btn0:
                number += "0";
                break;
            case R.id.btnComa:
                number += ".";
                break;
            case R.id.btnRestar:
                number = "-" + number;
                break;
        }
        ed1.setText(number);

    }

    public void operatorEvent(View view) {
        isNewOp = true;
        oldNumber = ed1.getText().toString();
        switch (view.getId()) {
            case R.id.btnDividir:
                op = "/";
                break;
            case R.id.btnMultiplicar:
                op = "*";
                break;
            case R.id.btnSuma:
                op = "+";
                break;
            case R.id.btnRestar:
                op = "-";
                break;
        }


    }

    public void equalEvent(View view) {
        String newNumber = ed1.getText().toString();
        switch (op) {
            case "+":
                result = Double.parseDouble(oldNumber) + Double.parseDouble(newNumber);
                break;
            case "-":
                result = Double.parseDouble(oldNumber) - Double.parseDouble(newNumber);
                break;

            case "*":
                result = Double.parseDouble(oldNumber) * Double.parseDouble(newNumber);
                break;
            case "/":
                result = Double.parseDouble(oldNumber) / Double.parseDouble(newNumber);
                break;
        }
        Intent intent = new Intent(this, MainActivity2.class);
        String message = result.toString();
        intent.putExtra(EXTRA_MESSAGE, message);
        startActivity(intent);
    }

    public void acEvent(View view){
        ed1.setText("0");
        isNewOp = true;

    }
    public void percentEvent(View view){
        double no = Double.parseDouble(ed1.getText().toString());
        ed1.setText(no+"");
        isNewOp = true;
    }

    public void btnBorrar (View view){
        TextView tv = findViewById(R.id.textView);
        String str = tv.getText().toString();
        str = str.substring(0, str.length()-1);
        tv.setText(str.toString());
    }
}