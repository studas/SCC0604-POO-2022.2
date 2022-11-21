package ex01;

/**
 *
 * @author arturbrennerweber
 */
public class EX01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ParNumerico<Integer> par1 = new ParNumerico<Integer>(10, 20);

        int maior = par1.getMax(); 
        System.out.println(maior);

        int menor = par1.getMin();
        System.out.println(menor);

        String concatenacao = par1.toString();
        System.out.println(concatenacao);
    }
    
}
