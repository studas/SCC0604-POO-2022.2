package ex04;

public class Ex04 {

    public static void main(String[] args) {
        int n_elements = 4000000;
        BMWithArrayList bench_aryl = new BMWithArrayList(n_elements);
        
        BMWithLinkedList bench_lkdl = new BMWithLinkedList(n_elements);
        
        Temporizer benchmarker1 = new Temporizer();
        Temporizer benchmarker2 = new Temporizer();
        
        benchmarker1.setInternalEntity(bench_lkdl);
        benchmarker2.setInternalEntity(bench_aryl);
        
        benchmarker1.start();
        benchmarker2.start();
        
        
        synchronized(benchmarker1){
          try{
              benchmarker1.join();
          }catch(InterruptedException e){
          }
        }
        
        synchronized(benchmarker2){
          try{
              benchmarker2.join();
          }catch(InterruptedException e){
          }
        }
        
        System.out.println("Array List");
        System.out.println(bench_aryl);
        System.out.println("Linked List:");
        System.out.println(bench_lkdl);
    }
    
}
