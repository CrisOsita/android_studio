package com.example.semana4_tarea;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onMariscos(View v){
        Intent it = new Intent(this, MainActivity2.class);
        it.putExtra("validador", "Mariscos");
        startActivity(it);
    }

    public void onReporteGeneral(View v){
        Intent it = new Intent(this, MainActivity4.class);
        it.putExtra("reporte", "General");
        startActivity(it);
    }

    public void onCriollo(View v){
        Intent it = new Intent(this, MainActivity2.class);
        it.putExtra("validador", "Criollo");
        startActivity(it);
    }
}