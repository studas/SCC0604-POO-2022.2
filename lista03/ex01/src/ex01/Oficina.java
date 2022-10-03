package ex01;

import java.util.ArrayList;

public class Oficina extends ArrayList<Veiculo>{
    
    private ArrayList<Veiculo> veiculos;
    private int proximo = -1;
    
    Oficina (){
        veiculos = new ArrayList();
        veiculos.add(new Bicicleta(1000, "Caloi 10", "Caloi", "Dourada", 21, 700));
        veiculos.add(new Automovel(50000, "Kwid", "Renault", "Branco", "AUB-5A92"));     
    }
    
    public Veiculo proximo() {
       proximo++;
       return veiculos.get(proximo);
    }
    
    public void manutencao(Veiculo v) {
        v.listarVerificacoes();
        v.ajustar();
        v.limpar();
        
        if(v instanceof Automovel){
            ((Automovel)v).trocarOleo();
        }
    }

    
    
}
