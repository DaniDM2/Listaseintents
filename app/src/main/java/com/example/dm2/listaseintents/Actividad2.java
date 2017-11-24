package com.example.dm2.listaseintents;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;

public class Actividad2 extends AppCompatActivity {

    private ListView lista;
    private ArrayList<Web>webs;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_actividad2);

        webs= new ArrayList<Web>();
        webs.add(new Web("Google","https://www.google.es/","google",1));
        webs.add(new Web("Youtube","https://www.youtube.com/?hl=es","youtube",2));
        webs.add(new Web("Tripadvisor","https://www.tripadvisor.es/","tripadvisor",3));


        Adaptador ad=new Adaptador(this,webs);
        lista=(ListView)findViewById(R.id.lista);
        lista.setAdapter(ad);
        //PONER U GETIDAT POSITION para que devuelva el objeto y poner coger la URL

        lista.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Web item= (Web) lista.getItemAtPosition(position);
                Uri uri = Uri.parse(item.getUrl());
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });
    }
}
