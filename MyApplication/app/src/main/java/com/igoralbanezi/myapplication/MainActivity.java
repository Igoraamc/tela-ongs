package com.igoralbanezi.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView listaDeOngs = findViewById(R.id.lista1);

        List<String> ongs = new ArrayList<String>(Arrays.asList("ONG AACD", "ONG Novo Mundo", "ONG Visão Mundial", "ONG Instituto Travessia", "ONG Movimento Pró Criança", "ONG Mães dos Moradores do Alto do Refúgio", "ONG \t\n" +
                "Associação dos Trapeiros de Emaús", "ONG Instituto de Tecnologia", "ONG CALDEIRA CULTURAL BRASILEIRA"));

        CustomAdapterOngs adapter = new CustomAdapterOngs(ongs, this);

        listaDeOngs.setAdapter(adapter);
    }
}
