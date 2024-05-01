import java.util.HashSet;
import java.util.Iterator;

public class IterateHashSet {
    public static void main(String[] args) {
        // Create a HashSet
        HashSet<String> hashSet = new HashSet<>();

        // Add some elements to the HashSet
        hashSet.add("Element1");
        hashSet.add("Element2");
        hashSet.add("Element3");

        // Iterate through all elements in the HashSet
        System.out.println("Iterating through all elements in the HashSet:");
        Iterator<String> iterator = hashSet.iterator();
        while (iterator.hasNext()) {
            String element = iterator.next();
            System.out.println(element);
        }
    }
}
