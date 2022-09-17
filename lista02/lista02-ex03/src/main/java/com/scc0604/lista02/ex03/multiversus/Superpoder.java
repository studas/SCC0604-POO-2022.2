package com.scc0604.lista02.ex03.multiversus;

public class Superpoder {
    private int categoria;
    private String nome;
    
    public Superpoder(String nome, int categoria){
        this.nome = nome;
        this.categoria = categoria;
    }
    
    public int getCategoria(){
        return categoria;
    }
    
    public String getNome(){
        return nome;
    }
}
