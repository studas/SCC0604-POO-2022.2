package ClassesDeSistema;
import java.time.LocalDateTime;    

/**
 *
 * @author 12547187
 */
public class RelogioSistema {
    Data data;
    Horario horario;
    
    public RelogioSistema() {}
    
    void atualizaDataEHora() {
           LocalDateTime agora = LocalDateTime.now();
           
           int horas = agora.getHour();
           int minutos = agora.getMinute();
           int segundos = agora.getSecond();
           
           Mes meses[] = {  Mes.JANEIRO, Mes.FEVEREIRO, 
                            Mes.MARCO, Mes.ABRIL,
                            Mes.MAIO, Mes.JUNHO,
                            Mes.JULHO, Mes.AGOSTO,
                            Mes.SETEMBRO, Mes.OUTUBRO,
                            Mes.NOVEMBRO, Mes.DEZEMBRO};
           
           int dia = agora.getDayOfMonth();
           Mes mes = meses[agora.getMonthValue()];
           int ano = agora.getYear();
           
           Horario atual = new Horario(horas, minutos, segundos);
           Data de_hoje = new Data(dia, mes, ano);
           
           this.data = de_hoje;
           this.horario = atual;
    }
    
    public Data getData() {
        atualizaDataEHora();
        return this.data;
    }
    
    public Horario getHorario() {
        atualizaDataEHora();
        return this.horario;
    }
}