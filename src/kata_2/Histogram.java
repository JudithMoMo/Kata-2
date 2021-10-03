package kata_2;

import java.util.HashMap;
import java.util.Map;

public class Histogram {
    private final int [] data;

    public Histogram(int[] data) {
        this.data = data;
    }
    
    public int[] getData() {
        return data;
    }
    
    public Map getHistogram(){
        Map <Integer, Integer> histogram = new HashMap<Integer, Integer>();
        for (int i = 0; i < 15; i++) {
            data[i] = i;
        }
        for (int i : data) {
            histogram.put(i, histogram.containsKey(i) ? histogram.get(i) + 1 : 1);
        }
        return histogram;
    }
    
    
}
