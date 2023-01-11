import javax.swing.*;
import java.util.*;

public class Frequency {
    public static void main(String[] args) {
        Map<String, Integer> map = new LinkedHashMap<>();
        for (String arg : args) {
            Integer freq = map.get(arg);
            map.put(arg, (freq == null) ? 1 : freq +1);
        }
        Set<String> keys = map.keySet();
        for (String key : keys) {
            System.out.println(key + " : " + map.get(key));
        }
        Iterator<String> itr = keys.iterator();
        while (itr.hasNext()) {
            String key = itr.next();
            System.out.println(key + " : " + map.get(key));
        }
        Collection<Integer> values = map.values();
        for (Integer i : values) {
            System.out.println(i + " ");
        }
        Set<Map.Entry<String, Integer>> entries = map.entrySet();
        for (Map.Entry<String, Integer> entry : entries) {
            System.out.println("key: " + entry.getKey() + " value: " + entry.getValue());

        }
    }

}
