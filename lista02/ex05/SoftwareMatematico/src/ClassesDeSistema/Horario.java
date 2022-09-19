package ClassesDeSistema;

public class Horario {
    private int hora;
    private int minuto;
    private int segundo;
    
    public Horario(int hora, int minuto, int segundo) {
        this.hora = hora;
        this.minuto = minuto;
        this.segundo = segundo;
    }
    
    public int getHora() {
        return this.hora;
    }
    
    public int getMinuto() {
        return this.minuto;
    }
    public int getSegundo() {
        return this.segundo;
    }
    
}
