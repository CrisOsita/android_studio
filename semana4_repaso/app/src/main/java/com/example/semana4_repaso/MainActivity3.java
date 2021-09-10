package com.example.semana4_repaso;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.*;
import java.util.stream.Stream;

public class MainActivity3 extends AppCompatActivity {

    TextView tv;
    GlobalClass gc;

    @RequiresApi(api = Build.VERSION_CODES.N)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        tv = findViewById(R.id.txtreporte);
        gc = new GlobalClass();
        List<Venta> list = gc.getLis();
        String cad = "";
        double sm = 0;
        for (Venta x: list){
            cad = cad + x.getTitulo() + "..." + x.total() + "\n";
            sm = sm + x.total();
        }
        cad = cad + "\n Total Venta: " + sm;
        tv.setText(cad);
    }

    public void onFinalizar(View v){
        Intent it = new Intent(this, MainActivity.class);
        startActivity(it);
    }
}