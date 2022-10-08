package lista4ex04;

public class PagarLimiteInvalidoException extends Exception{
    
    public String getMessage(){
        return("Pagamento de limite inválido!");
    }
    
}
