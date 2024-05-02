import java.util.*;

public class MapCheckEmpty {
    public static void main(String[] args) {
        // Create a HashMap
        Map<String, Integer> map = new HashMap<>();

        // Add key-value mappings to the map
        map.put("A", 1);
        map.put("B", 2);
        map.put("C", 3);

        // Check if the map is empty
        if (map.isEmpty()) {
            System.out.println("Map is empty");
        } else {
            System.out.println("Map is not empty");

            // Print key-value mappings
            System.out.println("Key-Value mappings:");
            for (Map.Entry<String, Integer> entry : map.entrySet()) {
                System.out.println(entry.getKey() + " : " + entry.getValue());
            }
        }
    }
}
