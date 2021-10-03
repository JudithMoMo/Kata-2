package kata_2;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class Kata_2 {

    /**
     * @param args the command line arguments
     */

    public static void main(String[] args) {
        int[] data = new int[15];
 
        Histogram histo = new Histogram(data);
        Map <Integer, Integer> histogr = histo.getHistogram();
        for (Map.Entry<Integer, Integer> entry : histogr.entrySet()) {
            System.out.println(entry.getKey() + "-->" + entry.getValue());
        }
    }

}
