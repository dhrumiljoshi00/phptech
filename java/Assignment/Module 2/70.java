import java.util.HashSet;
import java.util.Set;

public class SetComparator {
    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();

        // Adding elements to the first set
        set1.add(1);
        set1.add(2);
        set1.add(3);

        // Adding elements to the second set
        set2.add(2);
        set2.add(3);
        set2.add(4);

        // Retain elements which are same on both sets
        set1.retainAll(set2);

        // Printing the retained elements
        System.out.println("Common elements in both sets: " + set1);
    }
}
