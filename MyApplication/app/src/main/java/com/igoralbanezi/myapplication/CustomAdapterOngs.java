package com.igoralbanezi.myapplication;

import android.app.Activity;
import android.content.Intent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import java.util.List;

public class CustomAdapterOngs extends BaseAdapter {
    private ArrayOngs ongs;
    private Activity act;

    public CustomAdapterOngs(ArrayOngs ongs, Activity act) {
        this.ongs = ongs;
        this.act = act;
    }

    @Override
    public int getCount() {
        return ongs.size();
    }

    @Override
    public Object getItem(int position) {
        return ongs.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view = act.getLayoutInflater().inflate(R.layout.listview_ong, parent, false);
        final ObjOng ong = ongs.get(position);
        final String ongNome = ong.getNome();
        final String ongPhone = ong.getTel();
        final String ongEnd = ong.getEnd();
        final AcaoOng ongAcao = ong.getAcao();

        TextView ongName = view.findViewById(R.id.nomeOng);
        ongName.setText(ongNome);

        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent launchActivity = new Intent(act , MapsActivity.class);
                launchActivity.putExtra("ongNome", ongNome);
                launchActivity.putExtra("ongPhone", ongPhone);
                launchActivity.putExtra("ongEnd", ongEnd);
                launchActivity.putExtra("ongNomeAcao", ongAcao.getNome());
                launchActivity.putExtra("ongDataAcao", ongAcao.getDataEHora());
                act.startActivity(launchActivity);
            }
        });
        return view;
    }
}
