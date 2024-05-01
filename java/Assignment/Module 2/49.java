import java.util.ArrayList;

public class RemoveThirdElement {
    public static void main(String[] args) {
        // Create a new ArrayList
        ArrayList<String> colors = new ArrayList<>();

        // Add some colors to the ArrayList
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Yellow");
        colors.add("Purple");

        // Remove the third element from the ArrayList
        int indexToRemove = 2; // Index of the third element
        if (indexToRemove >= 0 && indexToRemove < colors.size()) {
            String removedColor = colors.remove(indexToRemove);
            System.out.println("Removed the third element: " + removedColor);
            System.out.println("Updated ArrayList: " + colors);
        } else {
            System.out.println("Index out of bounds!");
        }
    }
}
