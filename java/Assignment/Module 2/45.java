import java.util.ArrayList;

public class ArrayListIteration {
    public static void main(String[] args) {
        // Create a new ArrayList
        ArrayList<String> colors = new ArrayList<>();

        // Add some colors to the ArrayList
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Yellow");
        colors.add("Purple");

        // Iterate through all elements in the ArrayList
        System.out.println("Iterating through all elements in the ArrayList:");
        for (String color : colors) {
            System.out.println(color);
        }
    }
}
