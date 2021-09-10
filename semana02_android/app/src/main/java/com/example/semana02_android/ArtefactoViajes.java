package com.example.semana02_android;

import java.io.Serializable;

public class ArtefactoViajes implements Serializable {

    String nombre;
    double costo;
    double descuento;
    int dias;
    int personas;
    int imagen;

    public double costoFinal(){
        return costo - descuento;
    }

    public double costoTotal(){
        return costoFinal() * personas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }

    public double getDescuento() {
        return descuento;
    }

    public void setDescuento(double descuento) {
        this.descuento = descuento;
    }

    public int getDias() {
        return dias;
    }

    public void setDias(int dias) {
        this.dias = dias;
    }

    public int getPersonas() {
        return personas;
    }

    public void setPersonas(int personas) {
        this.personas = personas;
    }

    public int getImagen() {
        return imagen;
    }

    public void setImagen(int imagen) {
        this.imagen = imagen;
    }
}
