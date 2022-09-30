package Classes;

public class Livro extends Produto {
    private String autor;
    
    public Livro(float preco, String nomeloja, String descricao, String autor) {
        super(preco, nomeloja);
        this.descricao = descricao;
        this.autor = autor;
    }
    
    @Override
    public String getDescricao() {
        String descricao_completa = "Sinopse:\n";
        descricao_completa += this.descricao + "\nAutor do livro: ";
        descricao_completa += this.autor;
        return descricao_completa;
    }
}
