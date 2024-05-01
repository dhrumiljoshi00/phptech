import java.util.HashSet;

public class AppendToHashSet {
    public static void main(String[] args) {
        // Create a HashSet
        HashSet<String> hashSet = new HashSet<>();

        // Add elements to the HashSet
        hashSet.add("Element1");
        hashSet.add("Element2");
        hashSet.add("Element3");

        // Append the specified element to the end of the HashSet
        String elementToAdd = "NewElement";
        hashSet.add(elementToAdd); // Adding the element to the HashSet

        // Print the updated HashSet
        System.out.println("HashSet after appending the element:");
        System.out.println(hashSet);
    }
}
