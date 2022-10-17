public class Main {
    
    public static void main(String[] args) {
        MinhaListaEncadeada lista = new MinhaListaEncadeada();
        lista.insereNumElemFim(5);
        lista.insereFinal(38);
        lista.imprimeLista();
        System.out.println("");
        lista.removeEspecificado(38);
        lista.imprimeLista();
    }
}
