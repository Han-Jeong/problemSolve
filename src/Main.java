import april.week3.climbingStairs.ClimbingStairs;
import april.week4.maximumDepthOfBinaryTree.MaxDepthOfBT;
import april.week4.reverseLinkedList.ReverseLinkedList;
import com.sun.source.tree.Tree;
import march.fifth.TwoSum;
import march.seventh.ContainsDuplicate;
import march.sixth.BestTimeToBuyAndSellStock;
import may.week1.linkedListCycle.LinkedListCycle;
import may.week1.linkedListCycle.ListNode;
import may.week1.validAnagram.ValidAnagram;
import may.week2.cloneGraph.CloneGraph;
import may.week2.cloneGraph.Node;
import may.week2.insertInterval.InsertInterval;
import may.week3.sameTree.SameTree;
import may.week3.sameTree.TreeNode;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        TreeNode treeNode1 = new TreeNode(1);
        TreeNode treeNode2 = new TreeNode(2);
        TreeNode treeNode = new TreeNode(1, treeNode1, treeNode2);

        TreeNode treeNode4 = new TreeNode(2);
        TreeNode treeNode5 = new TreeNode(1);
        TreeNode treeNode3 = new TreeNode(1, treeNode4, treeNode5);

        SameTree.isSameTree(treeNode, treeNode3);


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