package may.week2.insertInterval;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class InsertInterval {
    public static int[][] insert(int[][] intervals, int[] newInterval) {
        int[] saveIntervals = newInterval;
        Set<int[]> resultList = new HashSet<>();
        for (int i = 0; i < intervals.length; i++) {
            if (validateCalculateSaveIntervals(intervals[i], saveIntervals)) {
                saveIntervals[0] = Math.min(intervals[i][0], saveIntervals[0]);
                saveIntervals[1] = Math.max(intervals[i][1], saveIntervals[1]);
            }
        }
        for (int i = 0; i < intervals.length; i++) {
            if (validateCalculateSaveIntervals(intervals[i], saveIntervals)) {
                resultList.add(saveIntervals);
            }else{
                resultList.add(intervals[i]);
            }
        }
        return (int[][]) resultList.toArray();
    }

    private static boolean validateCalculateSaveIntervals(int[] currentArray, int[] saveArray) {
        if (currentArray[0] >= saveArray[0] && currentArray[0] <= saveArray[1]) {
            return true;
        }
        if (currentArray[1] >= saveArray[0] && currentArray[1] <= saveArray[1]) {
            return true;
        }
        return false;
    }
}
