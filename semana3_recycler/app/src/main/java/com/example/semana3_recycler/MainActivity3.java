package com.example.semana3_recycler;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity3 extends AppCompatActivity {

    List<Alumno> lista;
    RecyclerView recy;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        recy = findViewById(R.id.recy2);
        lista = new ArrayList<>();
        llena();
        recy.setLayoutManager(new LinearLayoutManager(this));
        Adapta2 dp = new Adapta2(lista, this);
        recy.setAdapter(dp);
    }

    void llena(){
        lista.add(new Alumno("butters", 11, R.drawable.butters));
        lista.add(new Alumno("eric", 7, R.drawable.eric));
        lista.add(new Alumno("heidi", 17, R.drawable.heidi));
        lista.add(new Alumno("jimmy", 3, R.drawable.jimmy));
        lista.add(new Alumno("kenny", 10, R.drawable.kenny));
        lista.add(new Alumno("kyle", 14, R.drawable.kyle));
        lista.add(new Alumno("stan", 20, R.drawable.stan));
        lista.add(new Alumno("timmy", 12, R.drawable.timmy));
    }
}