package usp.ex02;

/**
 *
 * @author cillor
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
