package com.example.ejercuenca;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Categorias extends AppCompatActivity {
    Button btnAtletismo,btnBasket,btnFutbol,btnCiclismo,btnNatacion,btnPatinaje;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_categorias);

    btnAtletismo=(Button)findViewById(R.id.btnAtletismo);
    btnBasket=(Button)findViewById(R.id.btnBasket);
    btnCiclismo=(Button)findViewById(R.id.btnCiclismo);
    btnFutbol=(Button) findViewById(R.id.btnFutbol);
    btnNatacion=(Button)findViewById(R.id.btnNatacion);
    btnPatinaje=(Button)findViewById(R.id.btnPatinaje);

    //Atletismo
    btnAtletismo.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intentAtletismo = new Intent(getApplicationContext(),MapsActivityAtletismo.class);
            startActivity(intentAtletismo);
        }
    });
    //Basket
    btnBasket.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intentBasquet=new Intent(getApplicationContext(),MapsActivityBasquet.class);
            startActivity(intentBasquet);
        }
    });
    //Ciclismo
    btnCiclismo.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intentCiclismo = new Intent(getApplicationContext(), MapsActivityCiclismo.class);
            startActivity(intentCiclismo);
        }
    });
    //Futbol
    btnFutbol.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intentFutbol = new Intent(getApplicationContext(),MapsActivityFutbol.class);
            startActivity(intentFutbol);
        }
    });
    //Natacion
    btnNatacion.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intentNatacion= new Intent(getApplicationContext(),MapsActivityNatacion.class);
            startActivity(intentNatacion);
        }
    });
    //Patinaje
    btnPatinaje.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intentPatinaje = new Intent(getApplicationContext(),MapsActivityPatinaje.class);
            startActivity(intentPatinaje);
        }
    });
    }

}
