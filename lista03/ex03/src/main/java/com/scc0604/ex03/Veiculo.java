package com.scc0604.ex03;

abstract class Veiculo {
    int peso; //em kgs
    int rodas;
    int tempoFabricacao; //em dias

    public Veiculo(int rodas, int peso, int tempoFabricacao){
        this.rodas = rodas;
        this.peso = peso;
        this.tempoFabricacao = tempoFabricacao;
    }

    public int getPeso(){ return peso; }
    public int getRodas(){ return rodas; }
    public int getTempoFabricacao(){ return tempoFabricacao; }
}
