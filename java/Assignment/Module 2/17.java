import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class SecondMostFrequentChar {
    public static void main(String[] args) {
        String str = "successes";
        char secondMostFreqChar = findSecondMostFrequentChar(str);
        
        System.out.println("The given string is: " + str);
        System.out.println("The second most frequent char in the string is: " + secondMostFreqChar);
    }

    public static char findSecondMostFrequentChar(String str) {
        Map<Character, Integer> charFrequencyMap = new HashMap<>();
        
        // Count the frequency of each character
        for (char c : str.toCharArray()) {
            charFrequencyMap.put(c, charFrequencyMap.getOrDefault(c, 0) + 1);
        }

        int maxFreq = Integer.MIN_VALUE;
        int secondMaxFreq = Integer.MIN_VALUE;
        char secondMostFreqChar = 0;

        // Find the second most frequent character
        for (Entry<Character, Integer> entry : charFrequencyMap.entrySet()) {
            int freq = entry.getValue();
            if (freq > maxFreq) {
                secondMaxFreq = maxFreq;
                maxFreq = freq;
                secondMostFreqChar = entry.getKey();
            } else if (freq > secondMaxFreq && freq != maxFreq) {
                secondMaxFreq = freq;
                secondMostFreqChar = entry.getKey();
            }
        }

        return secondMostFreqChar;
    }
}
