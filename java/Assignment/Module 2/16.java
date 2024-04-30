import java.util.ArrayList;
import java.util.List;

public class InterleavingStrings {
    public static void main(String[] args) {
        String str1 = "WX";
        String str2 = "YZ";

        List<String> interleavings = findInterleavings(str1, str2);
        
        System.out.println("The given strings are: " + str1 + " " + str2);
        System.out.println("The interleaving strings are: " + interleavings);
    }

    public static List<String> findInterleavings(String str1, String str2) {
        List<String> result = new ArrayList<>();
        interleaveStrings(str1, str2, "", result);
        return result;
    }

    public static void interleaveStrings(String str1, String str2, String interleaved, List<String> result) {
        if (str1.isEmpty() && str2.isEmpty()) {
            result.add(interleaved);
        }

        if (!str1.isEmpty()) {
            interleaveStrings(str1.substring(1), str2, interleaved + str1.charAt(0), result);
        }

        if (!str2.isEmpty()) {
            interleaveStrings(str1, str2.substring(1), interleaved + str2.charAt(0), result);
        }
    }
}
