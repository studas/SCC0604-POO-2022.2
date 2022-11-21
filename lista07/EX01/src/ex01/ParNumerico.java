package ex01;

/**
 *
 * @author arturbrennerweber
 */
public class ParNumerico<T extends Number & Comparable> {
    private T value1;
    private T value2; 

    public ParNumerico(T value1, T value2) {
        this.value1 = value1;
        this.value2 = value2;
    }

    public T getMax() {
        if (0 < value1.compareTo(value2)){
            return value2;
        } else {
            return value1;
        }
    }

    public T getMin() {
        if (0 >= value1.compareTo(value2)) {
            return value2;
        } else{
            return value1;
        }
    }

    public String toString() {
        return (value1.toString() + value2.toString());
    }
    
}
