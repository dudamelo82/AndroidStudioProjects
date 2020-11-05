package com.example.componentesandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button btnCadastro;
    Button btnSeekBar;
    Button btnRatingBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnCadastro = (Button)findViewById(R.id.cmdExemplo1);
        btnSeekBar = (Button)findViewById(R.id.cmdExemplo2);
        btnRatingBar = (Button)findViewById(R.id.cmdExemplo3);

       btnCadastro.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               Intent intent = new Intent( MainActivity.this,CadastroActivity.class);
               startActivity(intent);
           }
       });

       btnRatingBar.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               Intent intent =  new Intent(MainActivity.this,ExemploRattinBar.class);
               startActivity(intent);
           }
       });

       btnSeekBar.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               Intent intent = new Intent(MainActivity.this,ExemploSeekBar.class);
               startActivity(intent);
           }
       });


    }
}