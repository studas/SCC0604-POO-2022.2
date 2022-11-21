package exemplo18.arvore;

public class Exemplo18Arvore {

    public static void main(String[] args) {
        // TODO code application logic here
        ABB<String> strings = new ABB();
        strings.inserir("Carlos");
        strings.inserir("Ana");
        strings.inserir("Jose");
        strings.inserir("Robson");
        strings.inserir("Pedro");
        strings.inserir("Antonio");
        
        if (strings.buscar("Robson"))
            System.out.println("Robson esta na arvore");
        else
            System.out.println("Robson NAO esta na arvore");
        
        strings.imprimirEmOrdem();
        
        strings.remover("Pedro");
        
        strings.imprimirEmOrdem();
    }
    
}
