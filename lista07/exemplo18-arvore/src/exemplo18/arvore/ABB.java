package exemplo18.arvore;

public class ABB <T extends Comparable> {
    private No<T> raiz;
    
    ABB() {
        raiz = null;
    }
    
    ABB(T valor) {
        raiz = new No<T>(valor, null, null);
    }
    
    private No<T> removeRec(No<T> atual, T valor){
        if(atual == null){
            return atual;
        }
        
        if(atual.getValor().compareTo(valor) > 0){
            atual.setEsq(removeRec(atual.getEsq(), valor));
        }else if(atual.getValor().compareTo(valor) < 0){
            atual.setDir(removeRec(atual.getDir(), valor));
        }else{
            if(atual.getEsq() == null)
                return atual.getDir();
            else if(atual.getDir() == null)
                return atual.getEsq();
            
            atual.setValor(minValue(atual.getDir()));
            atual.setDir(removeRec(atual.getDir(), valor));
        }
        
        return atual;
    }
    
    T minValue(No<T> atual){
        T minv = atual.getValor();
        while(atual.getEsq() != null){
            minv = atual.getEsq().getValor();
            atual = atual.getEsq();
        }
        return minv;
    }
    
    public void remover(T valor){
        raiz = removeRec(raiz, valor);
    }
    
    private No<T> inserirRec(No<T> atual, T valor) {
        if (atual == null)
            atual = new No<T>(valor, null, null); // novo no
        else
            if (atual.getValor().compareTo(valor) > 0)
                atual.setEsq(inserirRec(atual.getEsq(), valor)); // insere a esquerda
            else
                atual.setDir(inserirRec(atual.getDir(), valor)); // insere a direita
        return atual;
    }
    
    public void inserir(T valor) {
        raiz = inserirRec(raiz, valor); // inicia recursividade
    }
    
    private boolean buscarRec(No<T> atual, T valor) {
        if (atual == null)
            return false; // nao encontrou
        else
            if (atual.getValor().compareTo(valor) == 0)
                return true; // encontrou
            else // continua a busca
                if (atual.getValor().compareTo(valor) > 0)
                    return buscarRec(atual.getEsq(), valor); // busca a esquerda
                else
                    return buscarRec(atual.getDir(), valor); // busca a direita
    }
    
    public boolean buscar(T valor) {
        return buscarRec(raiz, valor); // inicia recursividade
    }
    
    private void imprimirEmOrdemRec(No<T> atual) {
        if (atual != null) {
            imprimirEmOrdemRec(atual.getEsq()); // imprime lado esquerdo primeiro
            System.out.print(atual.getValor() + ", "); // imprime no atual
            imprimirEmOrdemRec(atual.getDir()); // imprime lado direito por ultimo
        }
    }
    
    public void imprimirEmOrdem() {
        System.out.print("Elementos em ordem: ");
        imprimirEmOrdemRec(raiz);
        System.out.println();
    }
    
}
