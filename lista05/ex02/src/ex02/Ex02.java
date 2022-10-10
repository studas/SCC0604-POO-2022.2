package ex02;

public class Ex02 {

    public static void main(String[] args) {
        // Cria classe MinhaMatrizDinamica
        MinhaMatrizDinamica ma = new MinhaMatrizDinamica(5, 5);
        
        // Imprime na tela matriz
        System.out.println("Matriz inicializada com zeros:");
        System.out.print(ma);
        
        // Preenche a diagonal principal com o valor 42
        for(int i = 0; i < 5; i++) {
            ma.preenchePosicao(i, i, 42);
        }
        
        // Imprime na tela matriz
        System.out.println("Matriz com a diagonal principal preenchida:");
        System.out.print(ma);
        
        // Preenche cada elemento da matriz com a soma dos indexes
        ma.preencheComSomaDeIndexes();
        
        // Imprime a matriz
        System.out.println("Matriz com elementos = i + j");
        System.out.print(ma);
    }
    
}
