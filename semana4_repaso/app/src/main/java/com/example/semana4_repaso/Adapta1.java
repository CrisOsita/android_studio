package com.example.semana4_repaso;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

import java.util.*;
public class Adapta1 extends RecyclerView.Adapter<Adapta1.MyHolder> {
    List<Libro> lista;
    Context contexto;

    public Adapta1(List<Libro> lista, Context contexto) {
        this.lista = lista;
        this.contexto = contexto;
    }
    @NonNull
    @Override
    public MyHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        //cuando se crea el adaptador con los controles de la  vista
        LayoutInflater infla= LayoutInflater.from(contexto);
        View vis=infla.inflate(R.layout.vista1,parent,false);
        return new Adapta1.MyHolder(vis);
    }

    @Override
    public void onBindViewHolder(@NonNull MyHolder holder, int position) {
        //enlazar los datos con los controles
        final Libro art=lista.get(position);
        holder.tnom.setText(art.getTitulo());
        holder.tpre.setText(""+art.getPrecio());
        holder.img1.setImageResource(art.getImagen());
        //al seleccionar un item llamar a la pantalla2
        holder.milayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent it=new Intent(contexto, MainActivity2.class);
                it.putExtra("dato",art);
                contexto.startActivity(it);
            }
        });


    }

    @Override
    public int getItemCount() {
        return lista.size(); //cantidad de elementos
    }

    public class MyHolder extends RecyclerView.ViewHolder {
        ImageView img1;
        TextView tnom,tpre;
        ConstraintLayout milayout;
        public MyHolder(@NonNull View itemView) {
            super(itemView);
            img1=itemView.findViewById(R.id.imglibro);
            tnom=itemView.findViewById(R.id.txtnom);
            tpre=itemView.findViewById(R.id.txtpre);
            milayout=itemView.findViewById(R.id.milayout);

        }
    }
}
