package com.example.semana4_tarea;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.*;

public class MainActivity4 extends AppCompatActivity {

    TextView menureport;
    RecyclerView recy;
    GlobalClass global;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_4);

        menureport = findViewById(R.id.txtreporttot);
        recy = findViewById(R.id.recy2);
        global = new GlobalClass();
        String type = (String)getIntent().getSerializableExtra("reporte");

        List<Venta> lista = global.getLis();
        List<Venta> listaAdap = new ArrayList<>();
        double total = 0;
        String cad = "";

        if(Arrays.asList("Mariscos", "Criollo").contains(type)) {
            for (Venta x : lista) {
                if (x.getType().equals(type)) {
                    listaAdap.add(x);
                    total = total + x.getPeciototal();
                }
            }
        }else if(type.equals("General")){
            for (Venta x : lista) {
                    listaAdap.add(x);
                    total = total + x.getPeciototal();
            }
        }

        cad = "Reporte Total " + type + " es de: " + total;

        menureport.setText(cad);
        recy.setLayoutManager(new LinearLayoutManager(this));
        Adapta2 dp =new Adapta2(listaAdap, type, this);
        recy.setAdapter(dp);
    }

    public void onRetornar(View v){
        String type = (String)getIntent().getSerializableExtra("reporte");
        Intent it = new Intent();
        if(Arrays.asList("Mariscos", "Criollo").contains(type)){
            it = new Intent(this, MainActivity2.class);
        }else if(type.equals("General")){
            it = new Intent(this, MainActivity.class);
        }

        it.putExtra("validador", type);
        startActivity(it);
    }
}