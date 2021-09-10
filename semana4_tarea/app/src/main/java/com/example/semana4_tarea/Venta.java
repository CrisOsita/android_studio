package com.example.semana4_tarea;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Venta extends Menu{

    int cantidad;
    double peciototal;

    public double total(){
        return super.precio * cantidad;
    }

}
