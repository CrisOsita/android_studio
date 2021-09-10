package com.example.semana4_tarea;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Menu implements Serializable {

    String descripcion;
    String type;
    double precio;
    int imagen;
}
