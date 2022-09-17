package ClassesDeSistema;
public class Resultado {
    private float resultado;
    private Usuario requisitante;
    private Data data;
    private Horario horario;
    
    public Resultado(float resultado, Usuario requisitante, Data data, Horario horario) {
        this.resultado = resultado;
        this.requisitante = requisitante;
        this.data = data;
        this.horario = horario;
    }
    
    public float getResultado() {
        return this.resultado;
    }
    
    public Usuario getRequisitante() {
        return this.requisitante;
    }
    
    public Data getData() {
        return this.data;
    }
    
    public Horario getHorario() {
        return this.horario;
    }
}