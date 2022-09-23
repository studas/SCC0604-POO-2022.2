package com.scc0604.ex03;

public class Escola extends Predio
implements PegadaDeCarbono{
    public Escola(int tempoConstrucao, int area, int andares, int altura, int janelas){
        super(tempoConstrucao, area, altura, andares, janelas);
    }
    
    public int getPegadaDeCarbono(){
        int pegadaTotal = getArea() * getAltura() * getAndares() * getTempoConstrucao() - getJanelas();
        return pegadaTotal;
    }
    
}
