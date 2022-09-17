package ClassesDeSistema;

/**
 *
 * @author 12547187
 */
public class Foto {
    private String caminho;
    private Data data;
    
    public Foto(String caminho, Data data) {
        this.caminho = caminho;
        this.data = data;
    }
    
    
    public Data getData() {
        return this.data;
    }
    public String getCaminho() {
        return this.caminho;
    }
}
