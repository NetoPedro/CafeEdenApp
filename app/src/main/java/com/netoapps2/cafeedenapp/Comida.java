package com.netoapps2.cafeedenapp;

import java.net.URI;
import java.net.URL;

class Comida {

    private String nome;
    private String descricao;
    private String pic;


    public Comida(String pic, String nome, String descricao){
        setPic(pic);
        setDescricao(descricao);
        setNome(nome);
    }


    public void setPic(String pic){
        this.pic = pic;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getPic() {
        return pic;
    }
}
