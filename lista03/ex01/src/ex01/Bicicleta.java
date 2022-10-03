package ex01;

public class Bicicleta extends Veiculo {
    private int numMarchas;
    private int aroRoda;
            
            
    Bicicleta (float precoBicicleta, String modeloBicicleta, String marcaBicicleta, String corBicicleta, int numMarchasBicicleta, int aroRodasBicicleta){
        super(precoBicicleta, modeloBicicleta, marcaBicicleta, corBicicleta);
        this.numMarchas = numMarchasBicicleta;
        this.aroRoda = aroRodasBicicleta;
    }
    
    void listarVerificacoes() {
        System.out.println("Verificacoes");;
    }
    
    void ajustar() {
        System.out.println("Ajustado");;
    }
    
    void limpar() {
        System.out.println("Limpo");;
    }
}
