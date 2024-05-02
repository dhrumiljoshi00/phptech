import java.util.ArrayList;
import java.util.List;

public class JoinArrayLists {
    public static void main(String[] args) {
        // Creating the first ArrayList
        List<String> list1 = new ArrayList<>();
        list1.add("Apple");
        list1.add("Banana");
        list1.add("Orange");

        // Creating the second ArrayList
        List<String> list2 = new ArrayList<>();
        list2.add("Grapes");
        list2.add("Pineapple");
        list2.add("Mango");

        // Joining the ArrayLists
        List<String> joinedList = new ArrayList<>(list1);
        joinedList.addAll(list2);

        // Displaying the joined ArrayList
        System.out.println("Joined ArrayList: " + joinedList);
    }
}
