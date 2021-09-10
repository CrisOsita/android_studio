package com.example.semana4_repaso;

public class Venta extends Libro{

    int cantidad;

    public double total(){
        return super.precio * cantidad;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
}
