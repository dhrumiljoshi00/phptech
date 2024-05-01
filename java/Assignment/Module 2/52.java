import java.util.ArrayList;

public class CopyArrayList {
    public static void main(String[] args) {
        // Create the source ArrayList
        ArrayList<String> sourceList = new ArrayList<>();

        // Add elements to the source ArrayList
        sourceList.add("Apple");
        sourceList.add("Banana");
        sourceList.add("Orange");
        sourceList.add("Grapes");

        // Create the destination ArrayList
        ArrayList<String> destinationList = new ArrayList<>();

        // Copy elements from source to destination ArrayList
        destinationList.addAll(sourceList);

        // Print the destination ArrayList
        System.out.println("Destination ArrayList after copying:");
        for (String element : destinationList) {
            System.out.println(element);
        }
    }
}
