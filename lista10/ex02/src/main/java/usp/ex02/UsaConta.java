package usp.ex02;

/**
 *
 * @author Matheus Cirillo (matheuscirillo@usp.br) - 12547750
 * @version 1.0
 */
public class UsaConta implements Runnable {
    private Conta conta = new Conta(0);
    
    public int getSaldo() {
        return conta.getSaldo();
    }
    
    @Override
    public void run() {
        conta.fazAcao();
    }
    
}
