package may.week1.validAnagram;

import java.util.*;

public class ValidAnagram {
    public static boolean myAnswer(String s, String t) {
        HashMap<Character, Integer> countMap = new HashMap<>();
        char[] charArrayS = s.toCharArray();
        char[] charArrayT = t.toCharArray();
        for (int i = 0; i < charArrayS.length; i++) {
            Integer count = countMap.get(charArrayS[i]);
            if (count == null) {
                count = 0;
            }
            countMap.put(charArrayS[i], ++count);
        }
        for (int i = 0; i < charArrayT.length; i++) {
            Integer count = countMap.get(charArrayT[i]);
            if (count == null) {
                return false;
            }
            countMap.put(charArrayT[i], --count);
        }
        return countMap.values().stream().allMatch(value -> value.equals(0));
    }
}
