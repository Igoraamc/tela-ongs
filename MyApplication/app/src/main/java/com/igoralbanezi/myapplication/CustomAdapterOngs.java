package com.igoralbanezi.myapplication;

import android.app.Activity;
import android.content.Intent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import java.util.List;

public class CustomAdapterOngs extends BaseAdapter {
    private List<String> ongs;
    private Activity act;

    public CustomAdapterOngs(List<String> ongs, Activity act) {
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
        final String ong = ongs.get(position);

        TextView ongName = view.findViewById(R.id.nomeOng);
        ongName.setText(ong);

        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent launchActivity = new Intent(act , Ong.class);
                launchActivity.putExtra("nomeOng", ong);
                act.startActivity(launchActivity);
            }
        });
        return view;
    }
}
