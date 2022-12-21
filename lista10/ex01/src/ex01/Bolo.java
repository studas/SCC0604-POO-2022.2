package ex01;

public class Bolo {
    private final String tipo;
    
    Bolo(String tipo) {
        this.tipo = tipo;
    }
    
    @Override
    public String toString() {
        return "Bolo de " + this.tipo;
    }
}
