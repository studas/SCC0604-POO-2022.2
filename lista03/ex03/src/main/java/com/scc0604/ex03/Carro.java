package com.scc0604.ex03;

public class Carro extends Veiculo
implements PegadaDeCarbono{
    int forcaMotor; //em cavalos
    int consumo; //em km/l

    public Carro(int motor, int peso, int consumo, int tempoFabricacao){
        super(4, peso, tempoFabricacao);
        this.forcaMotor = motor;
        this.consumo = consumo;
    }
    
    public int getPegadaDeCarbono(){
        int pegadaTotal = getPeso() * getTempoFabricacao() + getRodas() * this.forcaMotor + this.consumo * this.forcaMotor;
        return pegadaTotal;
    }
}
