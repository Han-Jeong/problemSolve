package may.week3.longestSubstringWithoutRepeatingCharacters;


import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;


public class LongestSubstringWithoutRepeatingCharacters {
    public static int solution(String s) {
        char[] charArray = s.toCharArray();
        HashSet<Character> validateExist = new HashSet<>();
        Queue<Character> queue = new LinkedList<>();
        int max = 0;

        for (int i = 0; i < charArray.length; i++) {
            if (!validateExist.contains(charArray[i])) {
                validateExist.add(charArray[i]);
                queue.add(charArray[i]);
            }
            else{
                max = Math.max(max, queue.size());
                char popChar = queue.remove();
                while (popChar != charArray[i]) {
                    validateExist.remove(popChar);
                    popChar = queue.remove();
                }
                queue.add(charArray[i]);
            }
        }
        return Math.max(max, queue.size());
    }

    public static int bestSolution(String s) {
        if (s.isEmpty())
            return 0;

        int[] charIndex = new int[128];

        int maxLength = 0;
        int start = 0;

        for (int end = 0; end < s.length(); end++) {
            char currentChar = s.charAt(end);
            if (charIndex[currentChar] > start) {
                start = charIndex[currentChar];
            }
            charIndex[currentChar] = end + 1;
            int length = end - start + 1;
            if (length > maxLength) {
                maxLength = length;
            }
        }

        return maxLength;
    }
}
