package com.example.semana4_tarea;

import android.app.Application;

import java.util.*;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

public class GlobalClass extends Application {
    static List<Venta> lis;

    public static List<Venta> getLis() {
        return lis;
    }

    public static void setLis(List<Venta> lis) {
        GlobalClass.lis = lis;
    }
}
