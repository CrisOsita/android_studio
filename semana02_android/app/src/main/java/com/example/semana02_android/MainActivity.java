package com.example.semana02_android;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {
    Spinner sp1;
    TextView tpre;
    ImageView img1;
    Artefacto art;
    RadioGroup rgp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        sp1 = findViewById(R.id.spinner1);
        //asociar el xml
        ArrayAdapter ad = ArrayAdapter.createFromResource(this,
                R.array.arte,
                android.R.layout.simple_list_item_1);
        sp1.setAdapter(ad);
        tpre = findViewById(R.id.txtPre);
        img1 = findViewById(R.id.imageView1);
        art = new Artefacto();
        rgp = findViewById(R.id.rbp1);
        sp1.setOnItemSelectedListener(this);
    }

    public void calculo(View v){
        //asociar el radiogroup con el mes
        art.setMeses(0);
        switch (rgp.getCheckedRadioButtonId()){
            case R.id.rb1: art.setMeses(6); break;
            case R.id.rb2: art.setMeses(12); break;
            case R.id.rb3: art.setMeses(18); break;
        }

        Intent it = new Intent(this, MainActivity2.class);
        it.putExtra("dato", art); //al intent lo asocia la clase
        startActivity(it); // llamar a la actividad
    }

    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
        //el nombre de la imagen
        String nombre = sp1.getSelectedItem().toString();
        art.setNoma(nombre);
        //obtener la direccion de memoria
        int dir = getResources().getIdentifier("drawable/" + nombre,
                null,
                getPackageName());
        img1.setImageResource(dir);
        double v[] = {400, 1200, 230, 180, 1800, 800, 550};
        art.setPrecio(v[i]);
        tpre.setText("Precio Contado: " + v[i]);
    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }
}