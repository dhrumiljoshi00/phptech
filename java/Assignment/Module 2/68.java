import java.util.ArrayList;

public class ReplaceSecondElement {
    public static void main(String[] args) {
        // Create an ArrayList
        ArrayList<String> arrayList = new ArrayList<>();

        // Add elements to the ArrayList
        arrayList.add("Apple");
        arrayList.add("Banana");
        arrayList.add("Orange");
        arrayList.add("Grapes");

        // Print the original ArrayList
        System.out.println("Original ArrayList: " + arrayList);

        // Specify the element to replace the second element
        String replacement = "Mango";

        // Replace the second element with the specified element
        if (arrayList.size() >= 2) {
            arrayList.set(1, replacement);
            System.out.println("ArrayList after replacing the second element: " + arrayList);
        } else {
            System.out.println("ArrayList doesn't have enough elements to replace the second element.");
        }
    }
}
