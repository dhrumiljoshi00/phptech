import java.util.ArrayList;

public class UpdateElement {
    public static void main(String[] args) {
        // Create a new ArrayList
        ArrayList<String> colors = new ArrayList<>();

        // Add some colors to the ArrayList
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Yellow");
        colors.add("Purple");

        // Update a specific element with a given element
        int index = 2; // Index of the element to update
        String newColor = "Orange"; // New element value
        if (index >= 0 && index < colors.size()) {
            colors.set(index, newColor);
            System.out.println("Element at index " + index + " updated to: " + newColor);
            System.out.println("Updated ArrayList: " + colors);
        } else {
            System.out.println("Index out of bounds!");
        }
    }
}
