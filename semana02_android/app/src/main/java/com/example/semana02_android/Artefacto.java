package com.example.semana02_android;

import java.io.Serializable;

public class Artefacto implements Serializable {
    String noma;
    double precio;
    int meses;

    public double interes(){
        double inte = 0;
        switch (meses){
            case 6: inte = 0.20 * precio; break;
            case 12: inte = 0.30 * precio; break;
            case 18: inte = 0.40 * precio; break;
        }

        return inte;
    }

    public double pfinal(){
        return precio + interes();
    }

    public double cuota(){
        return pfinal()/meses;
    }

    public String getNoma() {
        return noma;
    }

    public void setNoma(String noma) {
        this.noma = noma;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getMeses() {
        return meses;
    }

    public void setMeses(int meses) {
        this.meses = meses;
    }
}
