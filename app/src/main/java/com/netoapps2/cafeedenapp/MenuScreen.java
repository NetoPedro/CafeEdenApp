package com.netoapps2.cafeedenapp;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MenuScreen extends AppCompatActivity {


    private Button botaoEventos
     ,botaoComida
     ,botaoContactos
     ,botaoGaleria;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_screen);
        botaoEventos = (Button) findViewById(R.id.menuBotaoEventos);
        botaoComida = (Button) findViewById(R.id.menuBotaoComida);
        botaoContactos= (Button) findViewById(R.id.menuBotaoContactos);
        botaoGaleria = (Button) findViewById(R.id.menuBotaoGaleria);
        botaoGaleria.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i= new Intent(getApplicationContext(), GalleryScreen.class);
                startActivity(i);
            }
        });
        botaoContactos = (Button) findViewById(R.id.menuBotaoContactos);
        botaoContactos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(), Contacts.class);
                startActivity(i);
            }
        });
        botaoComida = (Button) findViewById(R.id.menuBotaoComida);
        botaoComida.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(), Comidas.class);
                startActivity(i);
            }
        });

        botaoEventos = (Button) findViewById(R.id.menuBotaoEventos);
        botaoEventos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


            }
        });
    }
}
