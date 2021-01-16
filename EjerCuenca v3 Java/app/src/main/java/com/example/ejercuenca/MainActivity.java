package com.example.ejercuenca;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button siguiente,btnAtletismo,btnBasket,btnFutbol,btnCiclismo,btnNatacion,btnPatinaje;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    siguiente=(Button)findViewById(R.id.btnEmpezar);
    siguiente.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {

            Intent siguiente = new Intent(MainActivity.this
                    ,Categorias.class);
        startActivity(siguiente);
        }
    });


    }
}