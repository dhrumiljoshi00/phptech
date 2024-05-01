import java.util.ArrayList;
import java.util.Collections;

public class ReverseArrayList {
    public static void main(String[] args) {
        // Create a new ArrayList
        ArrayList<String> colors = new ArrayList<>();

        // Add some colors to the ArrayList
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Yellow");
        colors.add("Purple");

        // Print the ArrayList before reversing
        System.out.println("ArrayList before reversing:");
        System.out.println(colors);

        // Reverse the elements in the ArrayList
        Collections.reverse(colors);

        // Print the ArrayList after reversing
        System.out.println("ArrayList after reversing:");
        System.out.println(colors);
    }
}
