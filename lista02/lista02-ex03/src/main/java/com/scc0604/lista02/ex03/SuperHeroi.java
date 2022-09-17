package com.scc0604.lista02.ex03;

public class SuperHeroi extends Personagem{
    private String nome_vida_real;
    
    public SuperHeroi(String nome_vida_real, String nome, int vida, int forca){
        super(nome, vida, forca);
        this.nome_vida_real = nome_vida_real;
    }
    
    public String getNomeVidaReal(){
        return nome_vida_real;
    }
}
