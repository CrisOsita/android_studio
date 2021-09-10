package com.example.semana3_recycler;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    TextView tres;
    ImageView image;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        tres = findViewById(R.id.txtRes);
        image = findViewById(R.id.image2);
        Artefacto ar = (Artefacto) getIntent().getSerializableExtra("dato");
        String cad = "Descripcion: " + ar.getDesp();
        cad += "\n Precio: " + ar.getPre();
        tres.setText(cad);
        image.setImageResource(ar.getImagen());
    }

    public void retorna(View v){
        Intent it = new Intent(this, MainActivity.class);
        startActivity(it);
    }
}