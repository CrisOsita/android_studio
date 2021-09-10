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

import java.util.List;

public class Adapta2 extends RecyclerView.Adapter<Adapta2.myHolder>{

    List<Alumno> lista;
    Context contexto;

    public Adapta2(List<Alumno> lista, Context contexto) {
        this.lista = lista;
        this.contexto = contexto;
    }

    public class myHolder extends RecyclerView.ViewHolder {

        ImageView img; // variables del holder
        TextView tnom, tnota;
        ConstraintLayout milayout;

        public myHolder(@NonNull View itemView) {
            super(itemView);
            img = itemView.findViewById(R.id.imgalum);
            tnom = itemView.findViewById(R.id.txtnom);
            tnota = itemView.findViewById(R.id.txtnota);
            milayout = itemView.findViewById(R.id.milayout2);
        }
    }

    @NonNull
    @Override
    public myHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(contexto);
        View vis = inflater.inflate(R.layout.vista2, parent, false);

        return new Adapta2.myHolder(vis);
    }

    @Override
    public void onBindViewHolder(@NonNull Adapta2.myHolder holder, int position) {
        Alumno ar = lista.get(position);
        holder.img.setImageResource(ar.getImagen());
        holder.tnom.setText(ar.getNombre());
        holder.tnota.setText("" + ar.getNota());
        ar.setResultado(ar.getNota() < 12 ? "triste" : "feliz");

        holder.milayout.setOnClickListener(view -> {
            Intent intent = new Intent(contexto, MainActivity4.class);
            intent.putExtra("datex", ar);
            contexto.startActivity(intent);
        });
    }

    @Override
    public int getItemCount() {
        return lista.size();
    }

}
