package usp.ex02;

/**
 *
 * @author cillor
 */
public class Conta {
    private int saldo;
    
    public Conta(int saldo){
        this.saldo = saldo;
    }
    
    void deposita(int valor){
        int saldo = this.saldo;
        saldo += valor;
        this.saldo = saldo;
    }
    
    void saca(int valor){
        int saldo = this.saldo;
        saldo -= valor;
        this.saldo = saldo;
    }
    
    public int getSaldo(){
        return this.saldo;
    }
    
    synchronized public void fazAcao(){
        for (int i = 0; i < 5000; i++) {
            deposita(10);
            saca(9);
        }
    }
}
