import java.util.HashSet;

public class CountHashSetElements {
    public static void main(String[] args) {
        // Create a HashSet
        HashSet<String> hashSet = new HashSet<>();

        // Add some elements to the HashSet
        hashSet.add("Element1");
        hashSet.add("Element2");
        hashSet.add("Element3");

        // Get the number of elements in the HashSet
        int size = hashSet.size();

        // Print the number of elements
        System.out.println("Number of elements in the HashSet: " + size);
    }
}
