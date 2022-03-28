package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Page1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page1);

        Button ConnexionPage1 = findViewById(R.id.buttonConexPage1);
        Button InscripPage1 = findViewById(R.id.buttonInscriPage1);

        ConnexionPage1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Page1.this, MainActivity.class);
                startActivity(intent);
            }
        });

        InscripPage1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent2 = new Intent(Page1.this, MainActivity2.class);
                startActivity(intent2);
            }
        });
    }
}