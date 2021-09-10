package com.example.semana1_inicio;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    EditText edat, edba;
    TextView res;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        edat = findViewById(R.id.edat);
        edba = findViewById(R.id.edba);
        res = findViewById(R.id.txtRes);
    }

    public void calculo(View v){
        double bas, alt, hipo, are;
        bas = Double.parseDouble(edat.getText().toString());
        alt = Double.parseDouble(edba.getText().toString());
        hipo = Math.sqrt(bas*bas+alt*alt);
        are = alt*bas/2;
        String cad = "Hipotenusa: " + hipo + "\n Area: " + are;
        res.setText(cad);
    }
}