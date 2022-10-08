package lista4ex04;

import java.util.Scanner;

public class Lista4ex04 {

    public static void main(String[] args) {
        ContaCorrente conta =  new ContaCorrente();
        
        Scanner input =  new Scanner(System.in);
        
        System.out.println("Qual será o limite máximo da conta?");
        
        float valorOperado = input.nextInt();
        
        conta.SetValorLimite(valorOperado);
        
        //DEPOSITO
        
        System.out.println("Quanto deseja depositar na conta?");
        
        valorOperado = input.nextInt();
        
        try{
            conta.Depositar(valorOperado);
        }catch(DepositoInvalidoException exc){
            System.out.println(exc.getMessage()); 
        }
        
        //SAQUE
        
        System.out.println("Quanto deseja sacar?");
        
        valorOperado = input.nextInt();
        
        try{
            conta.Sacar(valorOperado);
        }catch(SaqueInvalidoException exc){
            System.out.println(exc.getMessage());
        }
        
        //PAGAR LIMITE
        
        System.out.println("Quanto deseja pagar do seu limite usado?");
        
        valorOperado = input.nextInt();
        
        try{
            conta.PagarLimite(valorOperado);
        }catch(PagarLimiteInvalidoException exc){
             System.out.println(exc.getMessage());
        }
                    
    }
}
