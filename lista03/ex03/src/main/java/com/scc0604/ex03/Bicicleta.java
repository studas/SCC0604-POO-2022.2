package com.scc0604.ex03;

public class Bicicleta extends Veiculo
implements PegadaDeCarbono{
    int marchas;

    public Bicicleta(int marchas, int peso, int tempoFabricação){
        super(2, peso, tempoFabricação);
        this.marchas = marchas;
    }
    
    public int getPegadaDeCarbono(){
        int pegadaTotal = getPeso() * getTempoFabricacao() + getRodas() * marchas;
        return pegadaTotal;
    }
}
