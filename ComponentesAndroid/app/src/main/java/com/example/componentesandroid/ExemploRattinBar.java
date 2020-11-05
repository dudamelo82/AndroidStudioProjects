package com.example.componentesandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RatingBar;
import android.widget.Toast;

public class ExemploRattinBar extends AppCompatActivity {
    Button btnEnviar;
    RatingBar rbAvaliar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTitle("Exemplo RatingBar");
        setContentView(R.layout.activity_exemplo_rattin_bar);

            rbAvaliar = (RatingBar)findViewById(R.id.rbAvaliacao);
            btnEnviar = (Button)findViewById(R.id.cmdEnviarAvaliacao);

            btnEnviar.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Toast.makeText(ExemploRattinBar.this,String.valueOf(rbAvaliar.getRating()),Toast.LENGTH_LONG).show();
                }
            });
    }
}