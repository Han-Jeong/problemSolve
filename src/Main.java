import march.fifth.TwoSum;

public class Main {
    public static void main(String[] args) {

        twoSum();
    }

    private static void twoSum() {
        int[] arr = {3,3};
        TwoSum twoSum = new TwoSum();
        int[] result = twoSum.myAnswer(arr, 6);
        System.out.println("["+ result[0] + "," + result[1] +"]");
    }
}