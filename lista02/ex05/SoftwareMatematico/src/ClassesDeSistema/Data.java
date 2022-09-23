package ClassesDeSistema;

public class Data {
    private int dia;
    private Mes mes;
    private int ano;
    
    public Data(int dia, Mes mes, int ano) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }
    public int getDia() {
        return this.dia;
    }
    
    public Mes getMes() {
        return this.mes;
    }
    public int getAno() {
        return this.ano;
    }
}
