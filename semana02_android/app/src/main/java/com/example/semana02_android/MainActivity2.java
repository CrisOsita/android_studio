package com.example.semana02_android;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    TextView tres;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        tres = findViewById(R.id.txtResultado);
        Artefacto ar = (Artefacto) getIntent().getSerializableExtra("dato");
        String cad = "Nombre: " + ar.getNoma();
        cad += "\n Precio Contado: " + ar.getPrecio();
        cad += "\n Interes: " + ar.interes();
        cad += "\n Precio Final: " + ar.pfinal();
        cad += "\n Cuota Mensual: " + ar.cuota();
        tres.setText(cad);
    }

    public void retorno(View v){
        Intent it = new Intent(this, MainActivity.class);
        startActivity(it);
    }
}