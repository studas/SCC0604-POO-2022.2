package usp.ex02;

/**
 *
 * @author cillor
 */
public class Ex02 {

    public static void main(String[] args) {
        Conta conta = new Conta(0);
        conta.fazAcao();
        conta.fazAcao();
        System.out.println("Resultado das operações seriais: " + conta.getSaldo());
        
        UsaConta uConta = new UsaConta();
        Thread t1 = new Thread(uConta);
        Thread t2 = new Thread(uConta);
        
        t1.start();
        t2.start();
        
        try {
            t1.join();
            t2.join();
        } catch(InterruptedException e) {
            System.out.println("Erro: " + e.getMessage());
        }
        
        System.out.println("Resultado das operações em paralelo: " + uConta.getSaldo());
    }
}
