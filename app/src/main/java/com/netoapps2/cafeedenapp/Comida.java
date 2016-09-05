package com.netoapps2.cafeedenapp;

class Comida {

    private String nome;
    private String descricao;
    private int pic;


    public Comida(int pic, String nome, String descricao){
        setPic(pic);
        setDescricao(descricao);
        setNome(nome);
    }

    public void setPic(int pic){
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

    public int getPic() {
        return pic;
    }
}
