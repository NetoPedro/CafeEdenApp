package com.netoapps2.cafeedenapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class Comidas extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lista_comidas_view);
        RecyclerView rv = (RecyclerView)  findViewById(R.id.listaDeComidasView) ;
        rv.setHasFixedSize(true);
        LinearLayoutManager llm = new LinearLayoutManager(this);
        rv.setLayoutManager(llm);

        ArrayList<Comida> listaComidas = new ArrayList<>();
        listaComidas.add(new Comida(0, "name", "Bolo de cohmfeopwfmemmfefffefefefefefefwfxfcghnjmk,l.ervbhnjmkl kewlckwefmklwefowefnwofniwefonenofiwnweofnewofiwofnwofnewofnewofnewofewofinwo"));

        RecyclerAdapter adapterComida = new RecyclerAdapter(this, listaComidas);
        rv.setAdapter(adapterComida);
    }
}

