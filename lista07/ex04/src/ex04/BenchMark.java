package ex04;
import java.util.concurrent.TimeUnit;
        
public abstract class BenchMark {
    private long insertion_acess_time;
    private long remotion_insertion_time;
    private int size;
    
    public BenchMark(int structure_size) {
        this.size = structure_size;
    }
    
    public int getSize() {
        return this.size;
    }
    
    public void setBenchTimes(long[] bench_times) {
        this.insertion_acess_time = bench_times[0]; // (60 * 1000);
        this.remotion_insertion_time = bench_times[1]; // (60 * 1000);
    }
    
    public int getRandomNumber(int min, int max) {
        return (int) ((Math.random() * (max - min)) + min);
    }
    
    public abstract void insertElements();
    public abstract void removeElements();
    public abstract void acessElements();
    
    @Override
    public String toString() {
        long ins_minutes = TimeUnit.MILLISECONDS.toMinutes(this.insertion_acess_time);
        long ins_seconds = TimeUnit.MILLISECONDS.toSeconds(this.insertion_acess_time) - ins_minutes * 60;
        long rem_minutes = TimeUnit.MILLISECONDS.toMinutes(this.remotion_insertion_time);
        long rem_seconds = TimeUnit.MILLISECONDS.toSeconds(this.remotion_insertion_time) - rem_minutes * 60;
        return "insertion + acess time: " + ins_minutes + "min " + ins_seconds + "s\n"
                + "remotion + insertion time: " + rem_minutes + "min " + rem_seconds + "s";
    }
}
