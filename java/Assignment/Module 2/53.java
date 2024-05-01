import java.util.ArrayList;
import java.util.Collections;

public class ShuffleArrayList {
    public static void main(String[] args) {
        // Create a new ArrayList
        ArrayList<String> colors = new ArrayList<>();

        // Add some colors to the ArrayList
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Yellow");
        colors.add("Purple");

        // Print the ArrayList before shuffling
        System.out.println("ArrayList before shuffling:");
        System.out.println(colors);

        // Shuffle the ArrayList
        Collections.shuffle(colors);

        // Print the ArrayList after shuffling
        System.out.println("ArrayList after shuffling:");
        System.out.println(colors);
    }
}
