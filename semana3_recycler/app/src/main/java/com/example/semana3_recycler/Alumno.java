package com.example.semana3_recycler;

import java.io.Serializable;

public class Alumno implements Serializable {

    String nombre;
    int nota;
    String resultado;
    int imagen;

    public Alumno(String nombre, int nota, int imagen) {
        this.nombre = nombre;
        this.nota = nota;
        this.imagen = imagen;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNota() {
        return nota;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }

    public int getImagen() {
        return imagen;
    }

    public void setImagen(int imagen) {
        this.imagen = imagen;
    }

    public String getResultado() {
        return resultado;
    }

    public void setResultado(String resultado) {
        this.resultado = resultado;
    }
}
