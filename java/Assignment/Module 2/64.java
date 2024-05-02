import java.util.HashSet;

public class HashSetToArray {
    public static void main(String[] args) {
        // Creating a HashSet
        HashSet<String> hashSet = new HashSet<>();
        
        // Adding elements to the HashSet
        hashSet.add("Apple");
        hashSet.add("Banana");
        hashSet.add("Orange");

        // Converting HashSet to an array
        String[] array = hashSet.toArray(new String[hashSet.size()]);

        // Displaying the elements of the array
        System.out.println("Elements of the array:");
        for (String element : array) {
            System.out.println(element);
        }
    }
}
