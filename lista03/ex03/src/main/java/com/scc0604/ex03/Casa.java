package com.scc0604.ex03;

public class Casa extends Predio
implements PegadaDeCarbono{
    public Casa(int tempoConstrucao, int area, int altura, int janelas){
        super(tempoConstrucao, area, altura, 1, janelas);
    }
    
    public int getPegadaDeCarbono(){
        int pegadaTotal = getArea() * getAltura() * getTempoConstrucao() - getJanelas();
        return pegadaTotal;
    }
}
