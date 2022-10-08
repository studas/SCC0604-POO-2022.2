package lista4ex04;

public class ContaCorrente {

    float saldo = 0f;
    float creditoLimite = 0f;
    float creditoRestante = 0f;

    public void Sacar(float valor) throws SaqueInvalidoException{
        
        if(valor <= 0 || valor > (saldo + creditoRestante)){
            throw new SaqueInvalidoException();
        }else{
            if(valor>saldo){
                valor -= saldo;
                saldo = 0;
                creditoRestante -= valor;
            }else{
                saldo -= valor;
            }
            System.out.println("Saldo após saque:\n Saldo:" + saldo + 
                               "\n Credito Restante:" + creditoRestante  + " de " + creditoLimite); 
            
        }
    }
    
    public void Depositar(float valor)  throws DepositoInvalidoException{
        if(valor <= 0){
            throw new DepositoInvalidoException();
        }else{
            saldo += valor;
            
            System.out.println("Saldo após depósito:\n Saldo:" + saldo + 
                               "\n Credito Restante:" + creditoRestante  + " de " + creditoLimite); 
        }
    }

    public void SetValorLimite(float valor){
        creditoLimite = valor;
        creditoRestante = creditoLimite;
    }
    
    public void PagarLimite(float valor) throws PagarLimiteInvalidoException{
        if(valor + creditoRestante > creditoLimite){
            throw new PagarLimiteInvalidoException();
        }else{
            creditoRestante += valor;
            
            System.out.println("Saldo após depósito:\n Saldo:" + saldo + 
                               "\n Credito Restante:" + creditoRestante + " de " + creditoLimite); 
        }
    }

}


