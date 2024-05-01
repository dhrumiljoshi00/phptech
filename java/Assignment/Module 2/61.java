import java.util.ArrayList;
import java.util.Arrays;

public class CompareArrayLists {
    public static void main(String[] args) {
        // Create two ArrayLists
        ArrayList<Integer> list1 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));

        // Check if the two ArrayLists are equal
        boolean isEqual = true;
        if (list1.size() != list2.size()) {
            isEqual = false;
        } else {
            for (int i = 0; i < list1.size(); i++) {
                if (!list1.get(i).equals(list2.get(i))) {
                    isEqual = false;
                    break;
                }
            }
        }

        // Print the result
        if (isEqual) {
            System.out.println("The two ArrayLists are equal.");
        } else {
            System.out.println("The two ArrayLists are not equal.");
        }
    }
}
