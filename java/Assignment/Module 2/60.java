import java.util.ArrayList;
import java.util.List;

public class ExtractPortionArrayList {
    public static void main(String[] args) {
        // Create a new ArrayList
        ArrayList<String> colors = new ArrayList<>();

        // Add some colors to the ArrayList
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Yellow");
        colors.add("Purple");

        // Extract a portion of the ArrayList
        int fromIndex = 1; // Start index (inclusive)
        int toIndex = 4; // End index (exclusive)
        List<String> extractedPortion = colors.subList(fromIndex, toIndex);

        // Print the extracted portion
        System.out.println("Extracted portion of the ArrayList:");
        System.out.println(extractedPortion);
    }
}
