package kata_2;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Random;

public class Kata_2 {

    /**
     * @param args the command line arguments
     */

    public static void main(String[] args) {
        String[] data = {"Rosa","Pepe","Maria","Pepe", "Pepe","Rosa"};
 
        Histogram histo = new Histogram(data);
        Map histogr = histo.getHistogram();
        
        Iterator<Map.Entry<String, Integer>> entries1 = histogr.entrySet().iterator();
        while (entries1.hasNext()) {
            Map.Entry<String, Integer> entry = entries1.next();
            System.out.println("M3a: Key = " + entry.getKey() + ", Value = " + entry.getValue());
        }
    }

}
