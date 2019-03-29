package com.igoralbanezi.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import org.w3c.dom.Text;

public class Ong extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ong);

        TextView textView = findViewById(R.id.nomeOng);

        textView.setText(getIntent().getExtras().getString("nomeOng"));
    }
}
