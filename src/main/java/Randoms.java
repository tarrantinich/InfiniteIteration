import java.util.*;

public class Randoms implements Iterable<Integer> {
    protected Random random;
    private int min;
    private int max;

    public Randoms(int min, int max) {
        this.min = min;
        this.max = max;
    }

    @Override
    public Iterator<Integer> iterator() {
        return new Iterator<Integer>() {
            @Override
            public boolean hasNext() {
                return true;
            }

            @Override
            public Integer next() {
                int diff = max - min;
                Random tempRandom = new Random();
                int intTemp = tempRandom.nextInt(diff + 1) + min;
                return intTemp;
            }
        };
    }

    @Override
    public String toString() {
        return random.toString();
    }
}
