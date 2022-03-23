package com.example.camina_calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    EditText txtboxVar1, txtboxVar2;
    Button btnAdd, btnSubtract, btnDivide, btnMultiply, btnPercent;
    TextView txtOutput;

    double var1, var2, output;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnAdd = findViewById(R.id.btnAdd);
        btnSubtract = findViewById(R.id.btnSubtract);
        btnDivide = findViewById(R.id.btnDivide);
        btnMultiply = findViewById(R.id.btnMultiply);
        btnPercent = findViewById(R.id.btnPercent);

        txtOutput = findViewById(R.id.txtOutput);

        btnAdd.setOnClickListener(this);
        btnSubtract.setOnClickListener(this);
        btnDivide.setOnClickListener(this);
        btnMultiply.setOnClickListener(this);
        btnPercent.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {

        var1 = Double.parseDouble(String.valueOf(txtboxVar1.getText()));
        var2 = Double.parseDouble(String.valueOf(txtboxVar2.getText()));

        switch (view.getId()) {
            case R.id.btnAdd:
                output = var1 + var2;
                txtOutput.setText(String.valueOf(output));
                break;
            case R.id.btnSubtract:
                output = var1 - var2;
                txtOutput.setText(String.valueOf(output));
                break;
            case R.id.btnMultiply:
                output = var1 * var2;
                txtOutput.setText(String.valueOf(output));
                break;
            case R.id.btnDivide:
                output = var1 / var2;
                txtOutput.setText(String.valueOf(output));
                break;
            case R.id.btnPercent:
                output = var1 % var2;
                txtOutput.setText(String.valueOf(output));
                break;
        }
    }
}