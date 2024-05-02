import java.util.*;

public class MapValueCollection {
    public static void main(String[] args) {
        // Create a map
        Map<String, Integer> map = new HashMap<>();
        map.put("apple", 10);
        map.put("banana", 20);
        map.put("orange", 15);
        
        // Get collection view of values
        Collection<Integer> values = map.values();
        
        // Print the values
        System.out.println("Values in the map:");
        for (Integer value : values) {
            System.out.println(value);
        }
    }
}
