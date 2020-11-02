package com.example.enviardados;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class SegundaActivity extends AppCompatActivity {
    TextView tvNome, tvIdade;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segunda);
        tvNome = (TextView)findViewById(R.id.txtName);
        tvIdade = (TextView)findViewById(R.id.txtIdade);
        Bundle dados = getIntent().getExtras();
        String nome = dados.getString("nome");
        Integer idade = dados.getInt("idade");
        tvNome.setText(nome);
        tvIdade.setText(String.valueOf(idade));
        setTitle("Segunda Activity");

    }
}