package kata_2;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class Kata_2 {

    /**
     * @param args the command line arguments
     */

    public static void main(String[] args) {
        Integer[] data = {0,1,2,3,4,5,6,7,8,9,10,11,12,13,14};
 
        Histogram histo = new Histogram(data);
        Map <Integer, Integer> histogr = histo.getHistogram();
        for (Map.Entry<Integer, Integer> entry : histogr.entrySet()) {
            System.out.println(entry.getKey() + "-->" + entry.getValue());
        }
    }

}
