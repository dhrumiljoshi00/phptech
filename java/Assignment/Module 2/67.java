import java.util.ArrayList;

public class IncreaseArrayListSize {
    public static void main(String[] args) {
        // Create an ArrayList
        ArrayList<Integer> arrayList = new ArrayList<>();

        // Add some elements to the ArrayList
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        
        // Print original ArrayList
        System.out.println("Original ArrayList: " + arrayList);

        // Add more elements to increase size
        arrayList.add(4);
        arrayList.add(5);

        // Print updated ArrayList
        System.out.println("Updated ArrayList with increased size: " + arrayList);
    }
}
