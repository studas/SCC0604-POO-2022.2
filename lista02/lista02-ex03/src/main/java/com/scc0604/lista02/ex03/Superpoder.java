package com.scc0604.lista02.ex03;

public class Superpoder {
    private int categoria;
    private String nome;
    
    public Superpoder(String pNome, int pCategoria){
        nome = pNome;
        categoria = pCategoria;
    }
    
    public int getCategoria(){
        return categoria;
    }
    
    public String getNome(){
        return nome;
    }
}
