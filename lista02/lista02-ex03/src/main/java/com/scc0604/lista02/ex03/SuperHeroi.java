package com.scc0604.lista02.ex03;

public class SuperHeroi extends Personagem{
    private String nome_vida_real;
    
    public SuperHeroi(String pNomeReal, String pNome, int vida, int forca){
        super(pNome, vida, forca);
        nome_vida_real = pNomeReal;
    }
    
    public String getNomeVidaReal(){
        return nome_vida_real;
    }
}
