package com.example.calculaimc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void calculaIMC (View v){
        EditText edtTextInputWeight = (EditText)findViewById(R.id.edtTextInputWight);
        EditText edtTextInputHeight = (EditText)findViewById(R.id.edtTextInputHeight);
        TextView textViewIMC = (TextView)findViewById(R.id.textViewIMC);

        Double peso = Double.parseDouble(edtTextInputWeight.getText().toString());
        Double altura = Double.parseDouble(edtTextInputHeight.getText().toString());
        Double IMC;

        IMC = peso/(pow(altura,2));

        textViewIMC.setText(String.valueOf(IMC));


    }
}