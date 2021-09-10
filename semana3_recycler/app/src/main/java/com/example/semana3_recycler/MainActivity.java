package com.example.semana3_recycler;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import java.util.*;

public class MainActivity extends AppCompatActivity {

    List<Artefacto> lista;
    RecyclerView recy;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recy = findViewById(R.id.recy1);
        lista = new ArrayList<>();
        llena();
        recy.setLayoutManager(new LinearLayoutManager(this));
        Adapta1 dp = new Adapta1(lista, this);
        recy.setAdapter(dp); //relacionar
    }

    void llena(){
        lista.add(new Artefacto("cocina", 230, R.drawable.cocina));
        lista.add(new Artefacto("filmadora", 2230, R.drawable.filmadora));
        lista.add(new Artefacto("horno", 530, R.drawable.horno));
        lista.add(new Artefacto("licuadora", 280, R.drawable.licuadora));
        lista.add(new Artefacto("radio", 190, R.drawable.radio));
        lista.add(new Artefacto("regrigeradora", 3230, R.drawable.refrigeradora));
        lista.add(new Artefacto("televisor", 2130, R.drawable.telelevisor));
    }
}