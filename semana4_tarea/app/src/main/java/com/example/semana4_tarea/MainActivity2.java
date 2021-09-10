package com.example.semana4_tarea;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.*;

public class MainActivity2 extends AppCompatActivity {
    TextView menu;
    RecyclerView recy;
    List<Menu> lista;
    List<Menu> listaAda;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_2);

        menu = findViewById(R.id.txtmenu);
        recy = findViewById(R.id.recy1);
        lista = new ArrayList<>();
        listaAda = new ArrayList<>();
        String type = (String)getIntent().getSerializableExtra("validador");
        String cad = "Menú " + type;
        menu.setText(cad);


        llena(type);

        for(Menu x: lista){
            if(x.getType().equals(type)){
                listaAda.add(x);
            }
        }

        recy.setLayoutManager(new LinearLayoutManager(this));
        Adapta1 dp =new Adapta1(listaAda, this);
        recy.setAdapter(dp);

    }

    void llena(String type){
            lista.add(new Menu("Ají de Gallina", "Criollo", 12, R.drawable.ajigallina));
            lista.add(new Menu("Arroz con Pollo", "Criollo",15, R.drawable.arrozpollo));
            lista.add(new Menu("Causa", "Criollo", 13, R.drawable.causa));
            lista.add(new Menu("Seco de Pollo", "Criollo", 14, R.drawable.seco));
            lista.add(new Menu("Tallarin Saltado", "Criollo", 11, R.drawable.tallarin));
            lista.add(new Menu("Arroz con Mariscos", "Mariscos",18, R.drawable.arrozmar));
            lista.add(new Menu("Camarones", "Mariscos", 20, R.drawable.camarones));
            lista.add(new Menu("Sopa de Choros", "Mariscos", 15, R.drawable.choros));
            lista.add(new Menu("Jalea de Pescado", "Mariscos", 10, R.drawable.jalea));
            lista.add(new Menu("Langosta Frita", "Mariscos", 17, R.drawable.langosta));
    }

    public void onReporte(View v){
        String type = (String)getIntent().getSerializableExtra("validador");
        Intent it = new Intent(this, MainActivity4.class);
        it.putExtra("reporte", type);
        startActivity(it);
    }

    public void onRetornar(View v){
        Intent it = new Intent(this, MainActivity.class);
        startActivity(it);
    }
}