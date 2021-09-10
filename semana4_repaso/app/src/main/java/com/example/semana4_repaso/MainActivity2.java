package com.example.semana4_repaso;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.*;
public class MainActivity2 extends AppCompatActivity {
    TextView resp;
    ImageView img;
    EditText cant;
    GlobalClass global;
    Libro l;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        global = new GlobalClass();
        cant = findViewById(R.id.txtcant);
        resp = findViewById(R.id.txtres);
        img = findViewById(R.id.imagenlibro);
        l = (Libro)getIntent().getSerializableExtra("dato");
        String cad = "Precio: " + l.getPrecio();
        cad += "\n Titulo: " + l.getTitulo();
        resp.setText(cad);
        img.setImageResource(l.getImagen());
    }

    public void onAceptar(View v){
        int cantidad = Integer.parseInt(cant.getText().toString());
        Venta ven = new Venta();
        List<Venta> listv;
        ven.setCantidad(cantidad);
        ven.setPrecio(l.getPrecio());
        ven.setTitulo(l.getTitulo());
        ven.setImagen(l.getImagen());

        //validacion de si existe una venta o no
        if (global.getLis() == null) listv = new ArrayList<>();
        else listv = global.getLis();

        //se agrega
        listv.add(ven);
        //se actualiza
        global.setLis(listv);

        Toast.makeText(getApplicationContext(), "Total " + ven.total(), Toast.LENGTH_LONG).show();
    }

    public void onRetornar(View v){
        Intent it = new Intent(this, MainActivity.class);
        startActivity(it);
    }
}