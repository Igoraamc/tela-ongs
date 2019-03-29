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
        AcaoOng ongAcoes;
        ArrayOngs allOngs = new ArrayOngs();

        ListView listaDeOngs = findViewById(R.id.lista1);

        List<String> ongs = new ArrayList<String>(Arrays.asList("ONG AACD", "ONG Novo Jeito", "ONG Visão Mundial", "ONG Instituto Travessia", "ONG Movimento Pró Criança", "ONG Mães dos Moradores do Alto do Refúgio", "ONG \t\n" +
                "Associação dos Trapeiros de Emaús", "ONG Instituto de Tecnologia", "ONG CALDEIRA CULTURAL BRASILEIRA"));

        List<String> ongsPhone = new ArrayList<>(Arrays.asList("(81) 3419-4000", "(81) 3132-2190", "(81) 3081-5600", "(81) 3019-5266", "(81) 3425-4450", "(81) 3265-7561", "(81) 3484-5731", "(81) 3183-4225", "(81) 3423-0722"));

        List<String> ongsEnd = new ArrayList<>(Arrays.asList("Av. Advogado José Paulo Cavalcanti, 155", "Rua Marques Amorim, 356", "Av. Conselheiro Aguiar, 1748", "R. dos Coelhos, 317", "Rua Alto do Refúgio, 468", "R. Mamede Coelho, 53", "Av. Prof. Luís Freire, 700", "Rua da Aurora, 212"));

        List<String> ongsAcao = new ArrayList<>(Arrays.asList("Tratar, reabilitar e reintegrar à sociedade crianças, adolescentes e adultos portadores de deficiência física.;15/04/2019 - 16h", "Estimular a mobilização de pessoas em prol do bem comum.;19/07/2019 - 12h", "Desenvolver cuidados em situações de emergência.;12/12/2019 - 13h", "Criar projetos para áreas de desenvolvimento humano.;31/03/2019 - 20h", "Procurar trabalhos sociais.;15/08/2019 - 8h", "Atividades publicas.;13/11/2019 - 10h", "Arrecadação de itens.;20/4/2019 - 10h", "Educação digital.;06/06/2019 - 18h", "Aula de dança.;24/12/2019 - 14h"));

        for(int i=0;i<(ongs.size()-1);i++) {
            String acao = ongsAcao.get(i).split(";")[0];
            String dataEHora = ongsAcao.get(i).split(";")[1];
            ongAcoes = new AcaoOng(acao, dataEHora);

            ong = new ObjOng(ongs.get(i), ongsPhone.get(i), ongsEnd.get(i), ongAcoes);
            allOngs.add(ong);
        }

        CustomAdapterOngs adapter = new CustomAdapterOngs(allOngs, this);

        listaDeOngs.setAdapter(adapter);
    }
}
