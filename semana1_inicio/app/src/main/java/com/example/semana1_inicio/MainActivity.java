package com.example.semana1_inicio;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button btn1, btn2;
    ImageView img1;
    int vec[]= {R.drawable.cocina, R.drawable.filmadora, R.drawable.horno, R.drawable.licuadora};
    int nd = vec.length; //numero de elementos
    int cn = 0, ca = 0; //contador de next y anterior

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //reconocer los controles
        btn1 = findViewById(R.id.btnnext);
        btn2 = findViewById(R.id.btnant);
        img1 = findViewById(R.id.image1);
        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {
        if(v == btn2){
            cn--;
            if (cn == 0){
                cn = nd-1;
            }
        }
        if(v == btn1){
            cn++;
            if(cn == nd){
                cn = 0;
            }
        }
        img1.setImageResource(vec[cn]);
    }
}