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
}
