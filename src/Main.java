import april.week3.climbingStairs.ClimbingStairs;
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
        ListNode listNode1 = new ListNode(1);
        ListNode listNode2 = new ListNode(2, listNode1);
        ListNode listNode3 = new ListNode(3, listNode2);
        ListNode listNode = ReverseLinkedList.differentAnswer(listNode3);
        while (listNode != null) {
            System.out.println("listNode = " + listNode.getVal());
            listNode = listNode.next;
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