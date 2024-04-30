public class StringComparison {
    public static void main(String[] args) {
        String str1 = "topsint.com";
        String str2 = "topsint.com";
        String str3 = "Topsint.com";

        boolean result1 = str1.contentEquals(str2);
        System.out.println("Comparing " + str1 + " and " + str2 + ": " + result1);

        
        boolean result2 = str1.contentEquals(str3);
        System.out.println("Comparing " + str1 + " and " + str3 + ": " + result2);
    }
}
