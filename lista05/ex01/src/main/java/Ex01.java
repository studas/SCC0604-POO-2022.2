public class Ex01 {

    public static void main(String[] args) {
        MeuVetorDinamico vetor = new MeuVetorDinamico(10);
        vetor.Preencher();
        vetor.Inserir(50, 0);
        vetor.Imprimir();
    }
}
