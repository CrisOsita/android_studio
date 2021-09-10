package com.example.semana3_recycler;

import java.io.Serializable;

public class Artefacto implements Serializable {
    String desp;
    double pre;
    int imagen;

    public Artefacto(String desp, double pre, int imagen) {
        this.desp = desp;
        this.pre = pre;
        this.imagen = imagen;
    }

    public String getDesp() {
        return desp;
    }

    public void setDesp(String desp) {
        this.desp = desp;
    }

    public double getPre() {
        return pre;
    }

    public void setPre(double pre) {
        this.pre = pre;
    }

    public int getImagen() {
        return imagen;
    }

    public void setImagen(int imagen) {
        this.imagen = imagen;
    }
}
