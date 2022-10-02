package ex01;

public class Automovel extends Veiculo {
    protected String placa;
    
    Automovel (float precoAutomovel, String modeloAutomovel, String marcaAutomovel, String corAutomovel, String placaAutomovel) {
        super(precoAutomovel, modeloAutomovel, marcaAutomovel, corAutomovel);
        placa = placaAutomovel;
    }
    
    void listarVerificacoes() {
        System.out.println("Verificacoes");
    }
    
    void ajustar() {
        System.out.println("Ajustado");
    }
    
    void limpar() {
        System.out.println("Limpado");
    }
    
    void trocarOleo() {
        System.out.println("oleo trocado");
    }
}
