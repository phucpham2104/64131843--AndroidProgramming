package com.example.simplecalculator;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    EditText num1, num2;
    Button btnAdd, btnSub, btnMul, btnDiv;
    TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        num1 = findViewById(R.id.num1);
        num2 = findViewById(R.id.num2);

        btnAdd = findViewById(R.id.btnAdd);
        btnSub = findViewById(R.id.btnSub);
        btnMul = findViewById(R.id.btnMul);
        btnDiv = findViewById(R.id.btnDiv);

        result = findViewById(R.id.result);

        btnAdd.setOnClickListener(v -> tinh("+"));
        btnSub.setOnClickListener(v -> tinh("-"));
        btnMul.setOnClickListener(v -> tinh("*"));
        btnDiv.setOnClickListener(v -> tinh("/"));
    }

    private void tinh(String pheptoan) {

        double a = Double.parseDouble(num1.getText().toString());
        double b = Double.parseDouble(num2.getText().toString());
        double kq = 0;

        switch (pheptoan){
            case "+": kq = a + b; break;
            case "-": kq = a - b; break;
            case "*": kq = a * b; break;
            case "/": kq = a / b; break;
        }

        result.setText("Kết quả: " + kq);
    }
}