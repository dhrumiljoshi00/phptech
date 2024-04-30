public class StartsWithExample {
    public static void main(String[] args) {
        String mainString1 = "Red is favorite color.";
        String subString1 = "Red";
        String mainString2 = "Orange is also my favorite color.";
        String subString2 = "Red";

        boolean startsWith1 = checkStartsWith(mainString1, subString1);
        boolean startsWith2 = checkStartsWith(mainString2, subString2);

        System.out.println(mainString1 + " Starts with " + subString1 + "? " + startsWith1);
        System.out.println(mainString2 + " Starts with " + subString2 + "? " + startsWith2);
    }

    public static boolean checkStartsWith(String mainString, String subString) {
        return mainString.startsWith(subString);
    }
}
