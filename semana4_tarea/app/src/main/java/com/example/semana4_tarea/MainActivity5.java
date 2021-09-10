package com.example.semana4_tarea;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity5 extends AppCompatActivity {

    TextView respre, reportT;
    ImageView imgre;
    Venta ven;
    String type;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_5);

        respre = findViewById(R.id.txtresreport);
        imgre = findViewById(R.id.imgreportplt);
        ven = (Venta)getIntent().getSerializableExtra("dato");

        String cad = "Descripcion: " + ven.getDescripcion();
        cad += "\n Precio: " + ven.getPrecio();
        cad += "\n Tipo: " + ven.getType();
        cad += "\n Cantidad: " + ven.getCantidad();
        cad += "\n Total: " + ven.getPeciototal();

        respre.setText(cad);
        imgre.setImageResource(ven.getImagen());
    }

    public void onRetornar(View v){
        type =  (String)getIntent().getSerializableExtra("type");
        Intent it = new Intent(this, MainActivity4.class);
        it.putExtra("reporte", type);
        startActivity(it);
    }
}