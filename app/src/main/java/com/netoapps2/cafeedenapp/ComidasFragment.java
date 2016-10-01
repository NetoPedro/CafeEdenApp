package com.netoapps2.cafeedenapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.GridView;

import java.util.ArrayList;

/**
 * Created by pedroneto on 01/10/16.
 */
public class ComidasFragment extends Fragment {


    private static final String ARG_SECTION_NUMBER = "section_number";
    ArrayList<Comida> listaComidas;
    public ComidasFragment() {
    }

    /**
     * Returns a new instance of this fragment for the given section
     * number.
     */
    public static ComidasFragment newInstance(int sectionNumber) {
        ComidasFragment fragment = new ComidasFragment();
        Bundle args = new Bundle();
        args.putInt(ARG_SECTION_NUMBER, sectionNumber);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.lista_comidas_view, container, false);
        RecyclerView rv = (RecyclerView)  rootView.findViewById(R.id.listaDeComidasView) ;
        rv.setHasFixedSize(true);
        LinearLayoutManager llm = new LinearLayoutManager(getContext());
        rv.setLayoutManager(llm);

        listaComidas = new ArrayList<>();
        adicionarComida(new Comida("https://scontent.flis1-1.fna.fbcdn.net/t31.0-8/10457406_446693658802041_6998969287042776197_o.jpg","Francesinha", "Uma deliciosa sandes, carateristica do norte" +
                ".\nRechada de um delicioso bife, queijo, fiambre e salsicha fresca"));
        adicionarComida(new Comida("https://scontent.flis1-1.fna.fbcdn.net/t31.0-8/12240195_589998354471570_1228903458506469620_o.jpg", "Lombo Assado", "Uma deliciosa fatia de lombo, acompanhada de umas +" +
                "saborosas batatasa assadas e arroz branco"));
        RecyclerAdapter adapterComida = new RecyclerAdapter(getContext(), listaComidas);
        rv.setAdapter(adapterComida);
        return rootView;
    }

    public void adicionarComida(Comida comida){
        if (!listaComidas.contains(comida)) listaComidas.add(comida);
    }
}
