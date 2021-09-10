package com.example.semana3_recycler;

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

public class Adapta1 extends RecyclerView.Adapter<Adapta1.myHolder> {

    List<Artefacto> lista;
    Context contexto;

    //agregar un constructor
    public Adapta1(List<Artefacto> lista, Context contexto) {
        this.lista = lista;
        this.contexto = contexto;
    }

    public class myHolder extends RecyclerView.ViewHolder {
        ImageView img1; // variables del holder
        TextView tdes, tpre;
        ConstraintLayout milayout;
        public myHolder(@NonNull View itemView) {
            super(itemView);
            //relacionar variables del holder con la vista1
            img1 = itemView.findViewById(R.id.image1);
            tdes = itemView.findViewById(R.id.txtdes);
            tpre = itemView.findViewById(R.id.txtpre);
            milayout = itemView.findViewById(R.id.milayaot);
        }
    }

    @NonNull
    @Override
    public myHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        //llamar a la vista1
        LayoutInflater inflater = LayoutInflater.from(contexto);
        View vis = inflater.inflate(R.layout.vista1, parent, false);

        //myholder es el contenedor de la variables que sera relacionado con la vista
        return new Adapta1.myHolder(vis);
    }

    @Override
    public void onBindViewHolder(@NonNull Adapta1.myHolder holder, int position) {
        //relacionar los datos de la lista con las variables del holder
        Artefacto ar = lista.get(position);
        holder.img1.setImageResource(ar.getImagen());
        holder.tdes.setText(ar.getDesp());
        holder.tpre.setText("" + ar.getPre());

        //cuando se hace un click enviar el item a la actividad2
        holder.milayout.setOnClickListener(view -> {
            Intent intent = new Intent(contexto, MainActivity2.class);
            intent.putExtra("dato", ar);
            contexto.startActivity(intent);
        });
    }

    @Override
    public int getItemCount() {
        return lista.size();
    }

}
