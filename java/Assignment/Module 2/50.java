import java.util.ArrayList;

public class SearchElement {
    public static void main(String[] args) {
        // Create a new ArrayList
        ArrayList<String> colors = new ArrayList<>();

        // Add some colors to the ArrayList
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Yellow");
        colors.add("Purple");

        // Element to search
        String searchElement = "Blue";

        // Check if the element exists in the ArrayList
        if (colors.contains(searchElement)) {
            System.out.println(searchElement + " found in the ArrayList.");
        } else {
            System.out.println(searchElement + " not found in the ArrayList.");
        }
    }
}
