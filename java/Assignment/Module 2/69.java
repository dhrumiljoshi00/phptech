import java.util.ArrayList;

public class ArrayListPrinter {
    public static void main(String[] args) {
        // Create an ArrayList
        ArrayList<String> arrayList = new ArrayList<>();

        // Add elements to the ArrayList
        arrayList.add("Apple");
        arrayList.add("Banana");
        arrayList.add("Orange");
        arrayList.add("Grapes");
        arrayList.add("Mango");

        // Print elements along with their positions
        System.out.println("Elements of the ArrayList along with their positions:");
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println("Position " + (i + 1) + ": " + arrayList.get(i));
        }
    }
}
