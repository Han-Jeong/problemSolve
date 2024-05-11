import april.week3.climbingStairs.ClimbingStairs;
import april.week4.maximumDepthOfBinaryTree.MaxDepthOfBT;
import april.week4.maximumDepthOfBinaryTree.TreeNode;
import april.week4.reverseLinkedList.ReverseLinkedList;
import march.fifth.TwoSum;
import march.seventh.ContainsDuplicate;
import march.sixth.BestTimeToBuyAndSellStock;
import may.week1.linkedListCycle.LinkedListCycle;
import may.week1.linkedListCycle.ListNode;
import may.week1.validAnagram.ValidAnagram;
import may.week2.insertInterval.InsertInterval;

public class Main {
    public static void main(String[] args) {

//        twoSum();
//        bestTimeToBuyAndSellStock();
//        containsDuplicate();
//        ClimbingStairs.differentAnswer(44);
//        boolean result = ValidAnagram.myAnswer("aacc", "ccac");
//        System.out.println("result = " + result);
        int[][] array = {{1, 2}, {3, 5}, {6, 7}, {8, 10}, {12, 16}};
        int[] insert = {4, 8};
        int[][] result = InsertInterval.insert(array, insert);
        for (int i = 0; i < result.length; i++) {
            System.out.println("i = " + i);
            for (int j = 0; j < result[i].length; j++) {
                System.out.println("result = " + result[i][j]);
            }
        }


    }

    private static void twoSum() {
        int[] arr = {3,3};
        TwoSum twoSum = new TwoSum();
        int[] result = twoSum.myAnswer(arr, 6);
        System.out.println("["+ result[0] + "," + result[1] +"]");
    }

    private static void bestTimeToBuyAndSellStock() {
        int[] arr = {7,6,4,3,1};
        BestTimeToBuyAndSellStock sellStock = new BestTimeToBuyAndSellStock();
        System.out.println("Output : " + sellStock.myAnswer(arr));
    }

    private static void containsDuplicate() {
        int[] arr = {1,1,1,3,3,4,3,2,4,2};
        ContainsDuplicate containsDuplicate = new ContainsDuplicate();
        System.out.println("Output : " + containsDuplicate.myAnswer(arr));
    }
}