import java.util.*;

public class HashSetToList {
    public static void main(String[] args) {
        // Create a HashSet
        HashSet<String> hashSet = new HashSet<>();

        // Add elements to the HashSet
        hashSet.add("Apple");
        hashSet.add("Banana");
        hashSet.add("Orange");
        hashSet.add("Grapes");

        // Convert HashSet to ArrayList
        ArrayList<String> arrayList = new ArrayList<>(hashSet);

        // Print the ArrayList
        System.out.println("HashSet converted to ArrayList:");
        for (String item : arrayList) {
            System.out.println(item);
        }
    }
}
