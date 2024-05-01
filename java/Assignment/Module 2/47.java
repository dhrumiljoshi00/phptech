import java.util.ArrayList;

public class RetrieveElementAtIndex {
    public static void main(String[] args) {
        // Create a new ArrayList
        ArrayList<String> colors = new ArrayList<>();

        // Add some colors to the ArrayList
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Yellow");
        colors.add("Purple");

        // Retrieve an element at a specified index
        int index = 2;
        if (index >= 0 && index < colors.size()) {
            String element = colors.get(index);
            System.out.println("Element at index " + index + ": " + element);
        } else {
            System.out.println("Index out of bounds!");
        }
    }
}
