package com.netoapps2.cafeedenapp;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.ViewHolder>{

    private Context mContext;
    private List<Comida> listaComidas;
    public RecyclerAdapter (Context context, List<Comida> comidas){
        mContext = context;
        listaComidas = comidas;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View itemView = LayoutInflater.from(
                parent.getContext()).inflate(
                R.layout.elemento_lista_comida,
                parent,false);
        return new ViewHolder (itemView);


    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {

        Comida item = listaComidas.get(position);
        holder.textNome.setText(item.getNome());
        holder.textDescricao.setText(item.getDescricao());
        holder.imageComida.setImageResource(item.getPic());

    }

    @Override
    public int getItemCount() {
        return listaComidas.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder{

        TextView textNome;
        TextView textDescricao;
        ImageView imageComida;

        public ViewHolder(View itemView){
            super(itemView);
            textDescricao= (TextView) itemView.findViewById(R.id.descricaoComida);
            textNome = (TextView) itemView.findViewById(R.id.nomeComida);
            imageComida = (ImageView) itemView.findViewById(R.id.fotoComida);

        }
    }
}
