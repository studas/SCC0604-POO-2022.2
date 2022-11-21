package exemplo18.arvore;

public class ABB <T extends Comparable> {
    private No<T> raiz;
    
    ABB() {
        raiz = null;
    }
    
    ABB(T valor) {
        raiz = new No<T>(valor, null, null);
    }
    
    private No<T> acharNoFundo(No<T> atual){
        if(atual.getDir() == null){
            if(atual.getEsq() == null){
                return atual;
            }
            return acharNoFundo(atual.getEsq());
        }
        return acharNoFundo(atual.getDir());
    }
   
    private No<T> acharNoRec(No<T> atual, T valor){
        if (atual == null)
            return null; // nao encontrou
        else
            if (atual.getValor().compareTo(valor) == 0)
                return atual; // encontrou
            else // continua a busca
                if (atual.getValor().compareTo(valor) > 0)
                    return acharNoRec(atual.getEsq(), valor); // busca a esquerda
                else
                    return acharNoRec(atual.getDir(), valor); // busca a direita   
    }
    
    private void removerNoFundo(No<T> atual){
        No<T> father = atual;
        while(true){
            if(atual.getDir() != null){
                father = atual;
                atual = atual.getDir();
                continue;
            }
            if(atual.getEsq() != null){
                father = atual;
                atual = atual.getEsq();
                continue;
            }
            break;
        }
        if(father.getDir() != null){
            father.setDir(null);
            return;
        }
        father.setEsq(null);
    }
    
    public boolean remover(T valor){
        No<T> no = acharNoRec(raiz, valor);
        if(no == null){
            return false;
        }
        No<T> fundo = acharNoFundo(raiz);
        no.setValor(fundo.getValor());
        removerNoFundo(raiz);
        return true;
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
