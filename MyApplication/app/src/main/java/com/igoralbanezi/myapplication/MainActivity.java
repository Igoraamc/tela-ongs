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

        ObjOng ong;
        ArrayOngs allOngs = new ArrayOngs();

        ListView listaDeOngs = findViewById(R.id.lista1);

        List<String> ongs = new ArrayList<String>(Arrays.asList("ONG AACD", "ONG Novo Jeito", "ONG Visão Mundial", "ONG Instituto Travessia", "ONG Movimento Pró Criança", "ONG Mães dos Moradores do Alto do Refúgio", "ONG \t\n" +
                "Associação dos Trapeiros de Emaús", "ONG Instituto de Tecnologia", "ONG CALDEIRA CULTURAL BRASILEIRA"));

        List<String> ongsPhone = new ArrayList<>(Arrays.asList("(81) 3419-4000", "(81) 3132-2190", "(81) 3081-5600", "(81) 3019-5266", "(81) 3425-4450", "(81) 3265-7561", "(81) 3484-5731", "(81) 3183-4225", "(81) 3423-0722"));

        List<String> ongsEnd = new ArrayList<>(Arrays.asList("Av. Advogado José Paulo Cavalcanti, 155", "Rua Marques Amorim, 356", "Av. Conselheiro Aguiar, 1748", "R. dos Coelhos, 317", "Rua Alto do Refúgio, 468", "R. Mamede Coelho, 53", "Av. Prof. Luís Freire, 700", "Rua da Aurora, 212"));

        List<String> ongsAcao = new ArrayList<>(Arrays.asList("Promove ações com o intuito de tratar, reabilitar e reintegrar à sociedade crianças, adolescentes e adultos portadores de deficiência física.", "Promove ações que estimulam a mobilização de pessoas em prol do bem comum.", "Organização cristã de desenvolvimento e resposta às situações de emergência.", "Organização que possibilita a criação de estratégias de responsabilidade social e projetos, acelerando áreas de desenvolvimento humano.", "Promove o direito à cidadania para milhares de crianças e jovens através de trabalhos sociais.", "Organização que desenvolve diversas atividades voltadas para crianças, adolescentes, jovens e adultos.", "Organização que recicla utensílios descartados pela população para manter bazar destinado a famílias carentes.", "Organização que busca oferecer soluções tecnológicas e multidisciplinares para os mais diversos setores produtivos.", "Representam artistas comprometidos em levar poesia e emoção ao público através da sua arte. "));

        for(int i=0;i<(ongs.size()-1);i++) {
            ong = new ObjOng(ongs.get(i), ongsPhone.get(i), ongsEnd.get(i), ongsAcao.get(i));
            allOngs.add(ong);
        }

        CustomAdapterOngs adapter = new CustomAdapterOngs(allOngs, this);

        listaDeOngs.setAdapter(adapter);
    }
}
