package com.example.ejercuenca;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentActivity;

import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptor;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class MapsActivityFutbol extends AppCompatActivity implements OnMapReadyCallback {

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps_futbol);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }

    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        //Cuenca
        LatLng cuenca = new LatLng( -2.90055 ,-79.00453);

        //StretSoccer
        LatLng streeSoccer = new LatLng(-2.901085,-78.979858);
        //Canchas Ciudadela Electrica
        LatLng ciudadelaE = new LatLng(-2.892767, -78.976976);
        //Canchas UDA
        LatLng UDA = new LatLng(-2.917174, -78.997795);
        //Canchas Paraiso
        LatLng paraiso = new LatLng(-2.911911, -78.990266);
        //Champions Remigio
        LatLng championsR = new LatLng(-2.897919, -79.021556);

        //StreetSoccer
        mMap.addMarker(new MarkerOptions().position(streeSoccer).title("StreetSoccer")  .snippet("Cancha de futbol Pagada").icon(BitmapDescriptorFactory.fromResource(R.drawable.dolar)));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(cuenca,12));
        //Canchas Ciudadela Electrica
        mMap.addMarker(new MarkerOptions().position(ciudadelaE).title("Ciudadela Electrica")  .snippet("Cancha de futbol Gratis").icon(BitmapDescriptorFactory.fromResource(R.drawable.gratis)));
        //mMap.moveCamera(CameraUpdateFactory.newLatLng(ciudadelaE));
        //Canchas UDA
        mMap.addMarker(new MarkerOptions().position(UDA).title("Cancha de la UDA")  .snippet("Cancha de futbol Pagada").icon(BitmapDescriptorFactory.fromResource(R.drawable.dolar)));
        //mMap.moveCamera(CameraUpdateFactory.newLatLng(UDA));

        //Canchas Paraiso
        mMap.addMarker(new MarkerOptions().position(paraiso).title("Cancha el Paraiso")  .snippet("Cancha de futbol Gratis").icon(BitmapDescriptorFactory.fromResource(R.drawable.gratis)));
        //mMap.moveCamera(CameraUpdateFactory.newLatLng(paraiso));

        //Champions Remigio
        mMap.addMarker(new MarkerOptions().position(championsR).title("Cancha de la UDA")  .snippet("Cancha de futbol Pagada").icon(BitmapDescriptorFactory.fromResource(R.drawable.dolar)));
        //mMap.moveCamera(CameraUpdateFactory.newLatLng(championsR));

    }
}