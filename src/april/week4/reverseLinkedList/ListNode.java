package april.week4.reverseLinkedList;


public class ListNode {
    int val;
    public ListNode next;

    ListNode(){}

    public ListNode(int val) {
        this.val = val;
    }

    public ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

    public int getVal() {
        return this.val;
    }
}
