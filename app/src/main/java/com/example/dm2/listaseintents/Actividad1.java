package com.example.dm2.listaseintents;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

public class Actividad1 extends AppCompatActivity {

    private Spinner spPaises;
    private TextView texto;
    private String[] paisesArr=new String[]{"Irlanda","Noruega","Portugal"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_actividad1);

        spPaises=(Spinner)findViewById(R.id.spPaises);
        texto=(TextView)findViewById(R.id.texto);

        final ArrayAdapter adapter= ArrayAdapter.createFromResource(this, R.array.paises,
                R.layout.support_simple_spinner_dropdown_item);
         spPaises.setAdapter(adapter);
        spPaises.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                String seleccion=parent.getItemAtPosition(position).toString();
                switch (seleccion) {
                    case "Irlanda" :
                        texto.setText("Poblacion de Irlanda: 1200000 superficie 45871km2");
                        break;
                    case "Noruega":
                        texto.setText("Poblacion de Noruega: 150000 superficie 25000km2");
                        break;
                    case "Portugal":
                        texto.setText("Poblacion de Portugal: 14851 superficie 122555km2");
                        break;
                    case "Francia":
                        texto.setText("Poblacion de Francia: 148752 superficie 6898km2");
                        break;
                    case "Brasil":
                        texto.setText("Poblacion de Brasil: 5887000 superficie 455571km2");
                        break;
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }


}
