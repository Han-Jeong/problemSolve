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
import may.week2.cloneGraph.CloneGraph;
import may.week2.cloneGraph.Node;
import may.week2.insertInterval.InsertInterval;

import java.util.List;

public class Main {
    public static void main(String[] args) {

//        twoSum();
//        bestTimeToBuyAndSellStock();
//        containsDuplicate();
//        ClimbingStairs.differentAnswer(44);
//        boolean result = ValidAnagram.myAnswer("aacc", "ccac");
//        System.out.println("result = " + result);
        Node node1 = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);
        Node node4 = new Node(4);
        Node node5 = new Node(5);
        node1.neighbors.addAll(List.of(node2, node5));
        node2.neighbors.addAll(List.of(node1, node3, node5));
        node3.neighbors.addAll(List.of(node2, node4, node5));
        node4.neighbors.add(node3);
        node5.neighbors.addAll(List.of(node1, node2, node3));

        Node node = CloneGraph.cloneGraph(node1);


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