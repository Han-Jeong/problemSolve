package july.week1.topKFrequentElements;

import java.util.*;
import java.util.stream.Collectors;

public class TopKFrequentElements {
    public static int[] topKFrequent(int[] nums, int k) {
        int[] result = new int[k];
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int value = 0;
            if (map.containsKey(nums[i])) {
                value = map.get(nums[i]);
            }
            map.put(nums[i], ++value);
        }
        List<Integer> collect = map.values().stream()
                .sorted(Comparator.reverseOrder())
                .limit(k)
                .collect(Collectors.toList());

        ArrayList<Integer> resultList = new ArrayList<>();
        map.keySet().forEach(index -> {
            Integer currentCount = map.get(index);
            if (collect.contains(currentCount)) {
                resultList.add(index);
            }
        });
        for (int i = 0; i < k; i++) {
            result[i] = resultList.get(i);
        }
        return result;
    }
}
