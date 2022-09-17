package softwarematematico;
import ClassesDeSistema.*;

/**
 *
 * @author 12547187
 */
public class SoftwareMatematico {
    

    public static void main(String[] args) {
        // Cria entidade RelogioSistema
        RelogioSistema relogio = new RelogioSistema();
        
        // Cria Usuario
        Foto de_perfil = new Foto("/home/coveiro/Images/foto_de_perfil", relogio.getData());
        Usuario carlos = new Usuario("Carlos", 19, de_perfil);
        
        Soma soma = new Soma();
        Subtracao subtracao = new Subtracao();
        Multiplicacao multiplicacao = new Multiplicacao();
        Divisao divisao = new Divisao();
        
        Resultado resultado = soma.realizarCalculo(3, 4, carlos);
        System.out.printf("Usuário: %s - ", resultado.getRequisitante().getNome());
        System.out.printf("%dh%d\n", resultado.getHorario().getHora(), resultado.getHorario().getMinuto());
        System.out.printf("3.00 + 4.00 = %.2f\n", resultado.getResultado());
        resultado = multiplicacao.realizarCalculo(3, 4, carlos);
        System.out.printf("3.00 * 4.00 = %.2f\n", resultado.getResultado());
        resultado = subtracao.realizarCalculo(3, 4, carlos);
        System.out.printf("3.00 - 4.00 = %.2f\n", resultado.getResultado());
        resultado = divisao.realizarCalculo(3, 4, carlos);
        System.out.printf("3.00 / 4.00 = %.2f\n", resultado.getResultado());
    }
    
}
