package ex02;

public class Ex02 {

    public static <TIPO extends Comparable> void insertionSort(TIPO [] A){
        int i, j;
        TIPO temp;
        for(j = 1; j < A.length; j++){
            temp = A[j];
            i = j -1;
            while(i > -1 && A[i].compareTo(temp)> 0){
                A[i+1] = A[i];
                i -= 1;
            }
            A[i+1] =  temp;
        }
    }
    
    public static void main(String[] args) {
        
        System.out.println("Trabalhando com Carros");
        //monta vetor
        Carro [] ca = new Carro[5];
        ca[0] =  new Carro("Celta 2012", 860,3.7f);
        ca[1] = new Carro("BMW X5 2020", 2110,5.1f);
        ca[2] = new Carro("Audi A3 1998", 1230,4.1f);
        ca[3] = new Carro("Virtus 2018", 1192,4.4f);
        ca[4] = new Carro("Honda CRV 2013", 1516,4.5f);
        ca[5] =  new Carro("McLaren P1",1490,4.5f);
        ca[6] =  new Carro("Ferrari Enzo")
        
        //imprime vetor
        System.out.print("[");
        for(int i = 0;i<4;i++){
            System.out.print(ca[i].toString());
        }
        System.out.println(ca[4].toString() + "]");
        
        //ordena vetor
        insertionSort(ca);
        
        //imprime vetor ordenado
        System.out.print("[");
        for(int i = 0;i<4;i++){
            System.out.print(ca[i].toString());
        }
        System.out.println(ca[4].toString() + "]");
        
    }
    
}
