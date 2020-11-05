package com.example.componentesandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;
import android.widget.ToggleButton;

public class CadastroActivity extends AppCompatActivity {

    Button btnEnviar;
    RadioButton rdMasculino, rdFeminino;
    CheckBox ckEstudante, ckDesenvolvimento;
    ToggleButton tgNotificacao;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro);

        btnEnviar = (Button)findViewById(R.id.cmdEnviar);
        rdMasculino = (RadioButton) findViewById(R.id.rdMasculino);
        rdFeminino = (RadioButton) findViewById(R.id.rdFeminino);
        ckEstudante = (CheckBox)findViewById(R.id.ckbEstudante);
        ckDesenvolvimento = (CheckBox)findViewById(R.id.ckbDesenvolvimento);
        tgNotificacao = (ToggleButton)findViewById(R.id.tbReceber);

        btnEnviar.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){


                if (rdFeminino.isChecked()){
                    Toast.makeText(getApplicationContext(),"Sexo Feminino Selecionado",Toast.LENGTH_SHORT).show();
                }else {
                    Toast.makeText(getApplicationContext(),"Sexo Masculino Selecionado",Toast.LENGTH_SHORT).show();
                };

                //grava o que foi selecionado no checkbox
                StringBuilder result = new StringBuilder();
                if(ckEstudante.isChecked()){
                    result.append("Estudante");
                };
                if(ckDesenvolvimento.isChecked()){
                    result.append("Desenvolvimento");
                };

                Toast.makeText(getApplicationContext(),result.toString(),Toast.LENGTH_SHORT).show();
            }
        });
                tgNotificacao.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                        if (tgNotificacao.isChecked()){
                            Toast.makeText(getApplicationContext(),"Enviar Notificação",Toast.LENGTH_SHORT).show();
                        }else{
                            Toast.makeText(getApplicationContext(),"Não Enviar",Toast.LENGTH_SHORT).show();
                        }
                    };
                });

    }
}