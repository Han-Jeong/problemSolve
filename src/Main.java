import april.week3.climbingStairs.ClimbingStairs;
import april.week4.maximumDepthOfBinaryTree.MaxDepthOfBT;
import april.week4.maximumDepthOfBinaryTree.TreeNode;
import april.week4.reverseLinkedList.ListNode;
import april.week4.reverseLinkedList.ReverseLinkedList;
import march.fifth.TwoSum;
import march.seventh.ContainsDuplicate;
import march.sixth.BestTimeToBuyAndSellStock;

public class Main {
    public static void main(String[] args) {

//        twoSum();
//        bestTimeToBuyAndSellStock();
//        containsDuplicate();
//        ClimbingStairs.differentAnswer(44);
        TreeNode treeNode = new TreeNode(5);
        treeNode.addNode(3);
        treeNode.addNode(10);
        treeNode.addNode(7);
        MaxDepthOfBT maxDepthOfBT = new MaxDepthOfBT();
        int depth = maxDepthOfBT.maxDepth(treeNode);
        System.out.println("depth = " + depth);

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