package ex02;

public class Ex02 {

    public static void main(String[] args) {
        // TODO code application logic here
        MinhaMatrizDinamica ma = new MinhaMatrizDinamica(5, 5);
        System.out.print(ma);
        ma.preencheComSomaDeIndexes();
        System.out.print(ma);
    }
    
}
