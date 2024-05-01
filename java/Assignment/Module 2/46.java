import java.util.ArrayList;

public class InsertFirstPosition {
    public static void main(String[] args) {
        // Create a new ArrayList
        ArrayList<String> colors = new ArrayList<>();

        // Add some colors to the ArrayList
        colors.add("Green");
        colors.add("Blue");
        colors.add("Yellow");
        colors.add("Purple");

        // Insert an element at the first position
        colors.add(0, "Red");

        // Print out the modified ArrayList
        System.out.println("Colors after inserting at the first position:");
        System.out.println(colors);
    }
}
