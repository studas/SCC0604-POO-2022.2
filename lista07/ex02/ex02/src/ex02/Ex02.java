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
        //Integer
        System.out.println("Trabalhando com Integers");
        //monta vetor
        Integer [] vi = new Integer[5];
        vi[0] = 10;
        vi[1] = 5;
        vi[2] = 20;
        vi[3] = 15;
        vi[4] = 1;
        
        //imprime vetor
        System.out.print("[");
        for(int i = 0;i<4;i++){
            System.out.print(vi[i]+ ",");
        }
        System.out.println(vi[4]+ "]");
        
        //ordena vetor
        insertionSort(vi);
        
        //imprime vetor ordenado
        System.out.print("[");
        for(int i = 0;i<4;i++){
            System.out.print(vi[i]+ ",");
        }
        System.out.println(vi[4]+ "]");
        
        
        //String
        System.out.println("Trabalhando com Strings");
        //monta vetor
        String[] vs = new String[5];
        vs[0] = "Guilherme";
        vs[1] = "Gustavo";
        vs[2] = "Matheus";
        vs[3] = "Pedro";
        vs[4] = "Artur";
        
        //imprime vetor
        System.out.print("[");
        for(int i = 0;i<4;i++){
            System.out.print(vs[i]+ ",");
        }
        System.out.println(vs[4]+ "]");
        
        //ordena vetor
        insertionSort(vs);
        
        //imprime vetor ordenado
        System.out.print("[");
        for(int i = 0;i<4;i++){
            System.out.print(vs[i]+ ",");
        }
        System.out.println(vs[4]+ "]");
        
    }
    
}
