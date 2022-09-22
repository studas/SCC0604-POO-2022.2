package Classes;

public class Produto {
    private String nomeloja;
    private float preco;
    protected String descricao;
    
    public void setPreco(float preco) {
        this.preco = preco;
    }
    
    public void setNomeLoja(String nomeloja) {
        this.nomeloja = nomeloja;
    }
    
    public float getPreco() {
        return this.preco;
    }
    
    public String getNomeLoja() {
        return this.nomeloja;
    }
    
    public String getDescricao() {
        return "Produto de informática";
    }
    
    public Produto(float preco, String nomeloja) {
        this.preco = preco;
        this.nomeloja = nomeloja;
    }
    
    @Override
    public String toString() {
        return "Preço: R$" + this.getPreco() + "\nNome da Loja: " + this.getNomeLoja();
    }
}
