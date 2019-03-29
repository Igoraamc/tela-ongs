package com.igoralbanezi.myapplication;

import android.content.Intent;
import android.net.Uri;
import android.support.v4.app.FragmentActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);

        final TextView textView2 = findViewById(R.id.textView2);
        final TextView textView3 = findViewById(R.id.textView3);
        final TextView textView4 = findViewById(R.id.textView4);
        final TextView textView5 = findViewById(R.id.textView5);
        final TextView textView6 = findViewById(R.id.textView6);

        textView2.setText(getIntent().getExtras().getString("ongNome"));
        textView3.setText(getIntent().getExtras().getString("ongPhone"));
        textView4.setText(getIntent().getExtras().getString("ongEnd"));
        textView5.setText("Ação: "+getIntent().getExtras().getString("ongNomeAcao"));
        textView6.setText("Data e Hora: "+getIntent().getExtras().getString("ongDataAcao"));

        final String phone_no = textView3.getText().toString().replaceAll("[\\.$|\\s+|(|)|-]", "");
        System.out.println(phone_no);

        textView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent callIntent = new Intent(Intent.ACTION_CALL);
                callIntent.setData(Uri.parse("tel:"+phone_no));
                startActivity(callIntent);
            }
        });
    }


    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        // Add a marker in Sydney and move the camera
        LatLng recife = new LatLng(-8.0631, -34.8713);
        mMap.addMarker(new MarkerOptions().position(recife).title("Recife"));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(recife, 14));
    }
}
