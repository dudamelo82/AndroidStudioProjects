package com.example.mudartexto;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    public void mudarTexto(View view){
        TextView texto = (TextView)findViewById(R.id.TxtAula1);
        texto.setText("O texto foi alterado");

    }

}