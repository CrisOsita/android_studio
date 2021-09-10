package com.example.semana4_tarea;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.*;

public class MainActivity3 extends AppCompatActivity {

    TextView resp;
    ImageView img;
    EditText cant;
    GlobalClass glo;
    Menu menu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_3);

        glo = new GlobalClass();
        cant =findViewById(R.id.txtcant);
        resp = findViewById(R.id.txtres);
        img = findViewById(R.id.imgplt);

        menu = (Menu)getIntent().getSerializableExtra("dato");
        String cad = "Precio: " + menu.getPrecio();
        cad += "\n Descripcion: " + menu.getDescripcion();
        cad += "\n Tipo: " + menu.getType();
        resp.setText(cad);
        img.setImageResource(menu.getImagen());
    }

    public void onCalc(View v){
        int cantidad = Integer.parseInt(cant.getText().toString());
        Venta ven = new Venta();
        List<Venta> lisv;
        ven.setCantidad(cantidad);
        ven.setDescripcion(menu.getDescripcion());
        ven.setType(menu.getType());
        ven.setImagen(menu.getImagen());
        ven.setPrecio(menu.getPrecio());
        double total = ven.total();
        ven.setPeciototal(total);

        if (glo.getLis() == null) lisv = new ArrayList<>();
        else lisv = glo.getLis();

        lisv.add(ven);
        glo.setLis(lisv);

        Toast.makeText(getApplicationContext(), "Total " + total, Toast.LENGTH_LONG).show();
    }

    public void onRetornar(View v){
        Intent it = new Intent(this, MainActivity2.class);
        it.putExtra("validador", menu.getType());
        startActivity(it);
    }
}