package com.example.semana02_android;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity5 extends AppCompatActivity {
    TextView res;
    ImageView imageV;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);

        res = findViewById(R.id.txtresviajes);
        imageV = findViewById(R.id.imageviajes);

        ArtefactoViajes ar = (ArtefactoViajes) getIntent().getSerializableExtra("dato");
        String cad = "Nombre: " + ar.getNombre();
        cad += "\n N° Personas: " + ar.getPersonas();
        cad += "\n N° Dias: " + ar.getDias();
        cad += "\n Descuento: " + ar.getDescuento() + " S/.";
        cad += "\n Costo: " + ar.getCosto() + " S/.";
        cad += "\n Pago Total Persona: " + ar.costoFinal() + " S/.";
        cad += "\n Pago Total: " + ar.costoTotal() + " S/.";
        res.setText(cad);
        imageV.setImageResource(ar.getImagen());
    }

    public void onRetorna(View v){
        Intent it = new Intent(this, MainActivity4.class);
        startActivity(it);
    }
}