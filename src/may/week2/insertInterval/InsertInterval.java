package may.week2.insertInterval;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class InsertInterval {
    public static int[][] insert(int[][] intervals, int[] newInterval) {
        int[] saveIntervals = newInterval;
        int forArrayLength = 0;
        for (int i = 0; i < intervals.length; i++) {
            if (validateCalculateSaveIntervals(intervals[i], saveIntervals)) {
                saveIntervals[0] = Math.min(intervals[i][0], saveIntervals[0]);
                saveIntervals[1] = Math.max(intervals[i][1], saveIntervals[1]);
                forArrayLength++;
            }
        }
        int resultIndex = intervals.length - forArrayLength;
        int[][] result = new int[resultIndex + 1][2];
        for (int i = intervals.length - 1; i >= 0; i--) {
            if (validateCalculateSaveIntervals(intervals[i], saveIntervals)) {
                if (--forArrayLength == 0) {
                    result[resultIndex] = saveIntervals;
                    resultIndex--;
                }
            }else{
                result[resultIndex] = intervals[i];
                resultIndex--;
            }
        }
        return result;
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

    private static boolean validateSameValueInArray(int[] array1, int[] array2) {
        if (Math.subtractExact(array1[0], array2[0]) == 0 && Math.subtractExact(array1[1], array2[1]) == 0) {
            return true;
        }
        return false;
    }
}
