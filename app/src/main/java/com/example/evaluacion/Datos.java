package com.example.evaluacion;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class Datos extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_datos);
        if(getSupportActionBar()!=null){
            getSupportActionBar().setTitle("INFORMACION");
        }
    }
}
