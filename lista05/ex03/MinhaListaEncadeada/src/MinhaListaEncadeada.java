public class MinhaListaEncadeada {

    private Elemento inicio;    
    private Elemento fim;

    MinhaListaEncadeada () {
        this.inicio = null;
        this.fim = null;
    }

    public class Elemento {    
        private int valor;    
        private Elemento proximo;  

        Elemento(int adicionado){    
            this.valor = adicionado;    
            this.proximo = null;    
        }  
    }

    public void insereFinal (int dadoInserir) {
        Elemento novoElemento = new Elemento(dadoInserir);

        if (inicio == null){
            inicio = novoElemento;
            fim = novoElemento;
        }
        else {
            fim.proximo = novoElemento;
            fim = novoElemento;
        }
    }

    public void removeEspecificado (int dadoRemover) {
        Elemento aux = inicio;
        Elemento anterior = inicio;

        while (aux.valor != dadoRemover) {
            anterior = aux;
            if (aux.proximo == null) {
                System.out.println("Valor nao encontrado");
                return; 
            }
            aux = aux.proximo;
        }

        anterior.proximo = aux.proximo;
    }

    public void insereNumElemFim (int numero) {
        for(int i = 1; i <= numero; i++) {
            insereFinal(i);
        }
    }

    public void imprimeLista () {
        Elemento aux = inicio;

        do {
            System.out.println(aux.valor);
            aux = aux.proximo;
        }while (aux != null);
    }
}