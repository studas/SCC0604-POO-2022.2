package ex01;

public class Consumidor implements Runnable {
    private final Armazem<Bolo> deposito;
    private String nome;
    private int consumido;
    private Bolo ultimo_consumido;
    
    Consumidor(String nome, Armazem<Bolo> deposito) {
        this.deposito = deposito;
        this.nome = nome;
        consumido = 0;
    }
    
    public int getConsumido() {
        return consumido;
    }
    
    public Bolo getUltimoConsumido() {
        return this.ultimo_consumido;
    }
    
    public String getNome() {
        return this.nome;
    }
    
    @Override
    public void run() {
        Bolo produto;
        while (!deposito.estaFechado()) {
            produto = deposito.envia(); // retira produto do deposito
            if (produto != null) {
                this.ultimo_consumido = produto;
                this.consumido++;
            }
        }
    }
}