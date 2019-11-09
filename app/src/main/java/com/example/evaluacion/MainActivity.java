package com.example.evaluacion;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        if(getSupportActionBar()!=null){
            getSupportActionBar().setTitle("EVALUACION");
        }
    }
    public void OnClickCalculadora(View v){
        Intent i = new Intent(this,Calculadora.class);
        startActivity(i);
    }
    public void OnClickDatos(View v){
        Intent i = new Intent(this,Datos.class);
        startActivity(i);
    }
}