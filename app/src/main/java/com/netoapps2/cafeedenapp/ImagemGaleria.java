package com.netoapps2.cafeedenapp;

/**
 * Created by pedroneto on 08/11/16.
 */
public class ImagemGaleria {


    public enum Categoria{
        COMIDA,SALGADOS,DOCES
    }
    private Categoria categoria;
    private String url;

    public ImagemGaleria (String url , Categoria categoria){
        setCategoria(categoria);
        setUrl(url);
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String toString(){
        return getUrl();
    }

}
