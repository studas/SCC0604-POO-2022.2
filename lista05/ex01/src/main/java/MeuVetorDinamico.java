public class MeuVetorDinamico {
    int[] vetorDinamico;
    int tamanho; 
    
    public MeuVetorDinamico(int tamanho){
        this.tamanho = tamanho;
        vetorDinamico = new int[this.tamanho];
        
        for(int i = 0; i < this.tamanho; i++){
            vetorDinamico[i] = 0;
        }
    }
    
    public void Inserir(int valor, int i){
        vetorDinamico[i] = valor;
    }
    
    public void Preencher(){
        for(int i = 0; i < tamanho; i++){
            vetorDinamico[i] = 100 * i;
        }
    }
    
    public void Imprimir(){
        for(int i = 0; i < tamanho; i++){
            System.out.print(vetorDinamico[i] + ", ");
        }
        System.out.println(" ");
    }
}
