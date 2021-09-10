package com.example.semana02_android;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity4 extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    Spinner sp;
    TextView tpre;
    EditText nper, ndias;
    ImageView img;
    ArtefactoViajes art;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

        sp = findViewById(R.id.spinner);
        ArrayAdapter ad = ArrayAdapter.createFromResource(this,
                R.array.tour,
                android.R.layout.simple_list_item_1);
        sp.setAdapter(ad);
        tpre = findViewById(R.id.txtPrecios);
        img = findViewById(R.id.imgtour);
        nper = findViewById(R.id.txtpersonas);
        ndias = findViewById(R.id.txtdias);
        art = new ArtefactoViajes();
        sp.setOnItemSelectedListener(this);
    }

    public void onCalculo(View v){
        //asociar el radiogroup con el mes
        int per, dias;
        per = Integer.parseInt(nper.getText().toString());
        dias = Integer.parseInt(ndias.getText().toString());
        art.setPersonas(per);
        art.setDias(dias);
        if (per > 4){
            art.setDescuento(art.getCosto()*0.15);
        }else{
            art.setDescuento(0);
        }

        Intent it = new Intent(this, MainActivity5.class);
        it.putExtra("dato", art); //al intent lo asocia la clase
        startActivity(it); // llamar a la actividad
    }

    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
        String nombre = sp.getSelectedItem().toString();
        art.setNombre(nombre);
        //obtener la direccion de memoria
        int dir = getResources().getIdentifier("drawable/" + nombre,
                null,
                getPackageName());
        img.setImageResource(dir);
        art.setImagen(dir);
        double v[] = {130, 150, 100, 110};
        art.setCosto(v[i]);
        tpre.setText("Precio por Persona: " + v[i]);
    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }
}