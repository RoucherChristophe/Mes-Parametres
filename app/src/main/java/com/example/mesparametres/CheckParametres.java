package com.example.mesparametres;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.CheckBox;

public class CheckParametres extends AppCompatActivity {

    Button btnActualiser;
    CheckBox chbWifi, chbAvion, chbModeEco, chbAppareilConnecte;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_check_parametres);

        btnActualiser = findViewById(R.id.btnActualiser);
        chbWifi = findViewById(R.id.chbWifi);
        chbAvion = findViewById(R.id.chbAvion);
        chbModeEco = findViewById(R.id.chbModeEco);
        chbAppareilConnecte = findViewById(R.id.chbAppareilConnecte);

    }
}