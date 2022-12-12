package ex01;

public class Cafeteria implements Runnable {
    private final Armazem<Bolo> dispensa;
    private String nome;
    private final int cota_de_producao;
    
    Cafeteria(String nome_produtor, int num_unidades, Armazem<Bolo> armazem) {
        this.dispensa= armazem;
        this.nome = nome_produtor;
        this.cota_de_producao = num_unidades;
    }
    
    String getNomeCafeteria() {
        return this.nome;
    }
    
    @Override
    public void run() {
        for (int i=0; i < this.cota_de_producao; i++)
            this.dispensa.recebe(new Bolo("Laranja")); // envia produto ao deposito
        this.dispensa.fecha();
    }
}

