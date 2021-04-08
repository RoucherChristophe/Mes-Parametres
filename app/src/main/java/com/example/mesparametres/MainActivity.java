package com.example.mesparametres;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btnWifi, btnAvion, btnModeEco, btnAppareilConnecte;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnWifi = findViewById(R.id.btnWifi);
        btnAvion = findViewById(R.id.btnAvion);
        btnModeEco = findViewById(R.id.btnModeEco);
        btnAppareilConnecte = findViewById(R.id.btnAppareilConnecte);

    }
}