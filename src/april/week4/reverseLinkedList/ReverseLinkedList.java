package april.week4.reverseLinkedList;

public class ReverseLinkedList {
    public ListNode reverseList(ListNode head) {
        ListNode newListNode = new ListNode(head.val);
        while (head.next != null) {
            ListNode prev = newListNode;
            head = head.next;
            newListNode = new ListNode(head.val, prev);
        }
        return newListNode;
    }


}

