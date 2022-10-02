package ex01;

public abstract class Veiculo {
    
    private float preco;
    private String modelo;
    private String marca;
    private String cor;
    
    
    Veiculo (float precoVeiculo, String modeloVeiculo, String marcaVeiculo, String corVeiculo) {
        this.preco = precoVeiculo;
        this.modelo = modeloVeiculo;
        this.marca = marcaVeiculo; 
        this.cor = corVeiculo;
    }
            
            
    abstract void listarVerificacoes();
    abstract void ajustar();
    abstract void limpar();
}
