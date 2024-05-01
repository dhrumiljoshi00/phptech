import java.util.ArrayList;
import java.util.Collections;

public class SwapArrayListElements {
    public static void main(String[] args) {
        // Create a new ArrayList
        ArrayList<String> colors = new ArrayList<>();
        
        // Add some colors to the ArrayList
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Yellow");
        colors.add("Purple");

        // Print the ArrayList before swapping
        System.out.println("ArrayList before swapping:");
        System.out.println(colors);

        // Swap the elements at positions 1 and 3 (0-based indexing)
        int index1 = 1;
        int index2 = 3;
        if (index1 >= 0 && index1 < colors.size() && index2 >= 0 && index2 < colors.size()) {
            Collections.swap(colors, index1, index2);
            System.out.println("ArrayList after swapping:");
            System.out.println(colors);
        } else {
            System.out.println("Invalid indices for swapping.");
        }
    }
}
