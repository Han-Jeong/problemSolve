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

    public static ListNode differentAnswer(ListNode head) {
        ListNode prev = null;
        while (head != null) {
            ListNode next = head.next;
            head.next = prev;
            prev = head;
            head = next;
        }
        return prev;
    }


}

