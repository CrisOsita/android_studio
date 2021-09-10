package com.example.semana02_android;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity3 extends AppCompatActivity {

    EditText peso, altura;
    TextView res;
    ImageView imagee;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        peso = findViewById(R.id.txtPeso);
        altura = findViewById(R.id.txtAltura);
        res = findViewById(R.id.txtResultado);
        imagee = findViewById(R.id.imagen1);
    }

    public void calcular(View v){
        double pe, alt, imc;
        String cad = "";
        pe = Double.parseDouble(peso.getText().toString());
        alt = Double.parseDouble(altura.getText().toString());
        imc = pe/(alt*alt);
        if(imc < 16){
            cad = "Su IMC: " + imc + "\n Su peso es Delgado";
            imagee.setImageResource(R.drawable.flaco);
        }else if(imc >= 16 && imc < 25){
            cad = "Su IMC: " + imc + "\n Su peso es Normal";
            imagee.setImageResource(R.drawable.normal);
        }else{
            cad = "Su IMC: " + imc + "\n Su peso es Obeso";
            imagee.setImageResource(R.drawable.gordo);
        }

        res.setText(cad);
    }
}