package com.example.abriractivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button btnAbrir;
    Button btnAbrir2;
    Button btnAbrir3;
    Button btnAbrir4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnAbrir=(Button)findViewById(R.id.cmdAbrir);
        btnAbrir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentSegunda = new Intent(MainActivity.this,SegundaActivity.class);
                startActivity(intentSegunda);
            }

        });

        btnAbrir2=(Button)findViewById(R.id.cmdAbrir2);
        btnAbrir2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent intentTerceira = new Intent(MainActivity.this,TerceiraActivity.class);
                startActivity(intentTerceira);

            }



    });
        btnAbrir3=(Button)findViewById(R.id.cmdAbrir3);
        btnAbrir3.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent intentQuarta = new Intent(MainActivity.this,QuartaActivity.class);
                startActivity(intentQuarta);
            }




        });

        btnAbrir4=(Button)findViewById(R.id.cmdAbrir4);
        btnAbrir4.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent intentQuinta = new Intent(MainActivity.this,QuintaActivity.class);
                startActivity(intentQuinta);

            }




        });


    }

}