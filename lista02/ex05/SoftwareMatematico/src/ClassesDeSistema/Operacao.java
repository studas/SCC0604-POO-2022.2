package ClassesDeSistema;

/**
 *
 * @author 12547187
 */
public abstract class Operacao {
    protected abstract float operacao(float a, float b);
    
    public Resultado realizarCalculo(float a, float b, Usuario requisitante) {
        RelogioSistema relogio = new RelogioSistema();
        float resultado = operacao(a, b);
        Data data = relogio.getData();
        Horario horario = relogio.getHorario();
        return new Resultado(resultado, requisitante, data, horario);
    }
}
