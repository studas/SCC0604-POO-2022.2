package ex02;
 
class Carro implements Comparable<Carro> {
    String nome;
    float peso;
    float tamanho;
 
    public Carro(String x, float y,float z)
    {
        this.nome = x;
        this.peso = y;
        this.tamanho = z;
    }
 
    public String toString()
    {
        return "(" + nome + ", Peso: " + peso + ",Tamanho: " +  tamanho + ")";
    }
 
    //Compara qual carro é maior que o outro baseado no peso
    @Override public int compareTo(Carro a)
    {
        if(this.peso > a.peso){
            return 1;
        }else if(this.peso == a.peso){
            return 0;
        }else{
            return -1;
        }
    }
}