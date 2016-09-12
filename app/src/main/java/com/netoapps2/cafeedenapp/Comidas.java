package com.netoapps2.cafeedenapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class Comidas extends AppCompatActivity {
    ArrayList<Comida> listaComidas;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lista_comidas_view);
        RecyclerView rv = (RecyclerView)  findViewById(R.id.listaDeComidasView) ;
        rv.setHasFixedSize(true);
        LinearLayoutManager llm = new LinearLayoutManager(this);
        rv.setLayoutManager(llm);

         listaComidas = new ArrayList<>();
        adicionarComida(new Comida("https://scontent.flis1-1.fna.fbcdn.net/t31.0-8/10457406_446693658802041_6998969287042776197_o.jpg","Francesinha", "Uma deliciosa sandes, carateristica do norte" +
                ".\nRechada de um delicioso bife, queijo, fiambre e salsicha fresca"));
        adicionarComida(new Comida("https://scontent.flis1-1.fna.fbcdn.net/t31.0-8/12240195_589998354471570_1228903458506469620_o.jpg", "Lombo Assado", "Uma deliciosa fatia de lombo, acompanhada de umas +" +
                "saborosas batatasa assadas e arroz branco"));
        RecyclerAdapter adapterComida = new RecyclerAdapter(this, listaComidas);
        rv.setAdapter(adapterComida);
    }

    public void adicionarComida(Comida comida){
        if (!listaComidas.contains(comida)) listaComidas.add(comida);
    }
}

