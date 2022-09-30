package Classes;

public class Mouse extends Produto {
    private String tipo;
    
    public Mouse(float preco, String nomeloja, String descricao, String tipo) {
        super(preco, nomeloja);
        this.descricao = descricao;
        this.tipo = tipo;
    }
    
    @Override
    public String getDescricao() {
        String descricao_completa = "Especificações técnicas:\n";
        descricao_completa += this.descricao + "\nTipo do Mouse: ";
        descricao_completa += this.tipo;
        return descricao_completa;
    }
}
