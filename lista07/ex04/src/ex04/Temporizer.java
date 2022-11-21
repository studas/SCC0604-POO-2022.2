package ex04;

public class Temporizer extends Thread {
    private long t0;
    private long tf;
    
    private BenchMark internal_entity;
    
    public Temporizer() {
        this.t0 = 0;
        this.tf = 0;
    }
    
    public void setInternalEntity(BenchMark internal_entity) {
        this.internal_entity = internal_entity;
    }
    
    private long calculateDeltaT() {
        return this.tf - this.t0;
    }
    
    /**
     * 
     * @param entity entity to be "benchmarked"
     * @return array with [insertion_time, acess_time, remotion_time]
     */
    public void temporize(BenchMark entity) {
        this.t0 = System.currentTimeMillis();
        
        entity.insertElements();
        entity.acessElements();
        
        this.tf = System.currentTimeMillis();
        long insertion_acess_time = this.calculateDeltaT();
        
        this.t0 = System.currentTimeMillis();
        
        entity.removeElements();
        entity.insertElements();
        
        this.tf = System.currentTimeMillis();
        long remotion_insertion_time = this.calculateDeltaT();
        
        long bench_times[] = {
            insertion_acess_time, 
            remotion_insertion_time
        };
        
        entity.setBenchTimes(bench_times);
    }
    
    @Override
    public void run() {
        this.temporize(this.internal_entity);
    }
}
