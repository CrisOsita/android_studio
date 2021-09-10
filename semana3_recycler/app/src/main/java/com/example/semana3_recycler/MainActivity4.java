package com.example.semana3_recycler;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity4 extends AppCompatActivity {

    TextView res;
    ImageView image;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

        res = findViewById(R.id.txtresalumno);
        image = findViewById(R.id.imgalumno);
        Alumno ar = (Alumno) getIntent().getSerializableExtra("datex");
        String cad = "Nombre: " + ar.getNombre();
        cad += "\n Nota: " + ar.getNota();
        cad += "\n Esta: " + ar.getResultado();

        int dir = getResources().getIdentifier("drawable/" + ar.getResultado(),
                null,
                getPackageName());
        image.setImageResource(dir);
        res.setText(cad);
    }

    public void onRetornar(View v){
        Intent it = new Intent(this, MainActivity3.class);
        startActivity(it);
    }
}