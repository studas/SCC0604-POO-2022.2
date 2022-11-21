package ex04;
import java.lang.Math;
import java.util.LinkedList;


public class BMWithLinkedList extends BenchMark {
    private LinkedList<Double> list;
    
    public BMWithLinkedList(int n_elements) {
        super(n_elements);
        this.list = new LinkedList<>();
    }
    
    @Override
    public void insertElements() {
        for(int i = 0; i < this.getSize(); i++) {
            double rand = Math.random();
            list.add(rand);
        }
    }
    
    @Override
    public void acessElements() {
        for(int i = 0; i < (this.getSize() / 10); i++) {
            int rand_index = this.getRandomNumber(0, (this.getSize() / 10 - 1));
            this.list.get(rand_index);
        }
    }
    
    @Override
    public void removeElements() {
        for(int i = 0; i < (this.getSize() / 10); i++) {
            int rand_index = this.getRandomNumber(0, (this.getSize() / 10 - 1) - i);
            list.remove(rand_index);
        }
    }
}
