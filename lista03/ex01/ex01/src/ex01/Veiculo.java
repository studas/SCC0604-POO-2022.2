package ex01;

public abstract class Veiculo {
    
    protected float preco;
    protected String modelo;
    protected String marca;
    protected String cor;
    
    
    Veiculo (float precoVeiculo, String modeloVeiculo, String marcaVeiculo, String corVeiculo) {
        preco = precoVeiculo;
        modelo = modeloVeiculo;
        marca = marcaVeiculo; 
        cor = corVeiculo;
    }
            
            
    abstract void listarVerificacoes();
    abstract void ajustar();
    abstract void limpar();
}
