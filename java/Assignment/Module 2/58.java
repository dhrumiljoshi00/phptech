import java.util.HashMap;
import java.util.Map;

public class MapSizeExample {
    public static void main(String[] args) {
        // Create a new HashMap
        Map<Integer, String> map = new HashMap<>();

        // Associate values with keys in the HashMap
        map.put(1, "Value1");
        map.put(2, "Value2");
        map.put(3, "Value3");
        map.put(4, "Value4");
        map.put(5, "Value5");

        // Count the number of key-value mappings in the map
        int size = map.size();

        // Print the number of key-value mappings
        System.out.println("Number of key-value mappings in the map: " + size);
    }
}
