package com.example.faixaetaria;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void faixaEtaria(View v){
        EditText edtFaixaEtaria = (EditText) findViewById(R.id.inputAge);
        TextView resultadoFaixaEtaria = (TextView)findViewById(R.id.resultadoFaixaEtaria);
        Button btnValidarFaixaEtaria;

        Integer idade = Integer.parseInt(edtFaixaEtaria.getText().toString());

            if(idade >= 0 && idade <= 12){
                resultadoFaixaEtaria.setText("A pessoa é uma criança");
            } else if( idade >12 && idade <= 18){
                resultadoFaixaEtaria.setText("A pessoa é um adolescente");

            } else if ( idade > 18 && idade <= 65) {
                resultadoFaixaEtaria.setText("A pessoa é adulta");
            } else {
                resultadoFaixaEtaria.setText("A pessoa é idosa");
            }


    }
}