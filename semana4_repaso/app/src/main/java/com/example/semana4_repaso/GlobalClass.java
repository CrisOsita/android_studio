package com.example.semana4_repaso;

import android.app.Application;

import java.util.*;
public class GlobalClass extends Application {
    static List<Venta> lis; //= new ArrayList<>();

    public List<Venta> getLis() {
        return lis;
    }

    public void setLis(List<Venta> lis) {
        this.lis = lis;
    }
}
