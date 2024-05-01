import java.util.ArrayList;
import java.util.Collections;

public class SortArrayList {
    public static void main(String[] args) {
        // Create a new ArrayList
        ArrayList<Integer> numbers = new ArrayList<>();

        // Add some numbers to the ArrayList
        numbers.add(5);
        numbers.add(2);
        numbers.add(8);
        numbers.add(1);
        numbers.add(9);

        // Print the ArrayList before sorting
        System.out.println("ArrayList before sorting:");
        System.out.println(numbers);

        // Sort the ArrayList
        Collections.sort(numbers);

        // Print the ArrayList after sorting
        System.out.println("ArrayList after sorting:");
        System.out.println(numbers);
    }
}
