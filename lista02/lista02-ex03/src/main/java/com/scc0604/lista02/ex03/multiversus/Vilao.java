package com.scc0604.lista02.ex03.multiversus;

public class Vilao extends Personagem{
    int anos_prisao;
    
    public Vilao(String nome, int vida, int forca){
        super(nome, vida, forca);
    }
    
    public int getAnosPrisao(){
        return anos_prisao;
    }
    
    public void setAnosPrisao(int pAnos){
        anos_prisao = pAnos;
    }
}
