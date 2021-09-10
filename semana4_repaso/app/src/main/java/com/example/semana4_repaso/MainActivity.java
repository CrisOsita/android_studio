package com.example.semana4_repaso;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import java.io.Serializable;
import java.util.*;
public class MainActivity extends AppCompatActivity {
    RecyclerView recy;
    List<Libro> lista;
    GlobalClass global;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recy = findViewById(R.id.recy1);
        lista = new ArrayList<>();
        llena();
        recy.setLayoutManager(new LinearLayoutManager(this));
        Adapta1 dp =new Adapta1(lista, this);
        recy.setAdapter(dp);
    }

    void llena(){
        lista.add(new Libro("DreamWeaver", 50, R.drawable.dreamw));
        lista.add(new Libro("Excel", 40, R.drawable.excel));
        lista.add(new Libro("Html", 70, R.drawable.html));
        lista.add(new Libro("InterDev", 45, R.drawable.interdev));
        lista.add(new Libro("Java", 80, R.drawable.java));
        lista.add(new Libro("Operaciones", 60, R.drawable.operacion));
    }

    public void onReporte(View v){
        Intent it = new Intent(this, MainActivity3.class);
        startActivity(it);
    }
}