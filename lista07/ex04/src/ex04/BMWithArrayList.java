package ex04;

import java.util.ArrayList;

public class BMWithArrayList extends BenchMark {
    private ArrayList<Double> array;
    
    public BMWithArrayList(int n_elements) {
        super(n_elements);
        this.array = new ArrayList<>();
    }
    
    @Override
    public void insertElements() {
        for(int i = 0; i < this.getSize(); i++) {
            double rand = Math.random();
            this.array.add(rand);
        }
    }
    
    @Override
    public void acessElements() {
        for(int i = 0; i < (this.getSize() / 10); i++) {
            int rand_index = this.getRandomNumber(0, (this.getSize() / 10 - 1));
            this.array.get(rand_index);
        }
    }
    
    @Override
    public void removeElements() {
        for(int i = 0; i < (this.getSize() / 10); i++) {
            int rand_index = this.getRandomNumber(0, (this.getSize() / 10 - 1) - i);
            this.array.remove(rand_index);
        }
    }
}
