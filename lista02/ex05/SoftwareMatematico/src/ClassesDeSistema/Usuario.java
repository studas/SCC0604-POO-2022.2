package ClassesDeSistema;

/**
 *
 * @author 12547187
 */
public class Usuario {
    private String nome;
    private int idade;
    private Foto foto;
    
    public Usuario(String nome, int idade, Foto foto) {
        this.nome = nome;
        this.idade = idade;
        this.foto = foto;
    }
    
    public String getNome() {
        return this.nome;
    }
    
    public int getIdade() {
        return this.idade;
    }
    
    public Foto getFoto() {
        return this.foto;
    }
}