package com.scc0604.ex03;

abstract class Predio{
    int tempoConstrucao; //em dias
    int area; //em m²
    int altura; //em m
    int andares;
    int janelas;

    public Predio(int tempoConstrucao, int area, int altura, int andares, int janelas){
        this.tempoConstrucao = tempoConstrucao;
        this.area = area;
        this.altura = altura;
        this.andares = andares;
        this.janelas = janelas;
    }

    public int getTempoConstrucao(){return tempoConstrucao;}
    public int getArea(){return area;}
    public int getAltura(){return altura;}
    public int getAndares(){return andares;}
    public int getJanelas(){return janelas;}
}
