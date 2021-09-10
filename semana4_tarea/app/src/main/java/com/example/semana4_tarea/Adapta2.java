package com.example.semana4_tarea;

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

public class Adapta2 extends RecyclerView.Adapter<Adapta2.MyHolder>{

    List<Venta> lista;
    String type;
    Context contexto;

    public Adapta2(List<Venta> lista, String type, Context contexto) {
        this.lista = lista;
        this.type = type;
        this.contexto = contexto;
    }

    @NonNull
    @Override
    public Adapta2.MyHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        //cuando se crea el adaptador con los controles de la  vista
        LayoutInflater infla= LayoutInflater.from(contexto);
        View vis=infla.inflate(R.layout.vista1,parent,false);
        return new Adapta2.MyHolder(vis);
    }

    @Override
    public void onBindViewHolder(@NonNull Adapta2.MyHolder holder, int position) {
        //enlazar los datos con los controles
        final Venta art =lista.get(position);
        holder.tdes.setText(art.getDescripcion());
        holder.tpre.setText(""+art.getPrecio() + ", Platos " + art.getCantidad());
        holder.img1.setImageResource(art.getImagen());
        //al seleccionar un item llamar a la pantalla2
        holder.milayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent it=new Intent(contexto, MainActivity5.class);
                it.putExtra("dato", art);
                it.putExtra("type", type);
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
        TextView tdes,tpre;
        ConstraintLayout milayout;
        public MyHolder(@NonNull View itemView) {
            super(itemView);
            img1=itemView.findViewById(R.id.imgplato);
            tdes=itemView.findViewById(R.id.txtdes);
            tpre=itemView.findViewById(R.id.txtpre);
            milayout=itemView.findViewById(R.id.milayout);

        }
    }
}
