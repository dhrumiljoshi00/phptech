public class EndsWithCheck {
    public static void main(String[] args) {
        String str1 = "Java Exercises";
        String str2 = "se";
        
        boolean endsWith = endsWith(str1, str2);
        
        System.out.println("\"" + str1 + "\" ends with \"" + str2 + "\"? " + endsWith);
    }
    
    public static boolean endsWith(String str1, String str2) {
        if (str1.length() < str2.length())
            return false;
        
        String endOfStr1 = str1.substring(str1.length() - str2.length());
        
        return endOfStr1.equals(str2);
    }
}
