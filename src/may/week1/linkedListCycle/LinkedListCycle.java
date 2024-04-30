package may.week1.linkedListCycle;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class LinkedListCycle {
    public static boolean myAnswer(ListNode head) {
        Set<ListNode> set = new HashSet<>();
        boolean result = false;
        while (head != null) {
            if (set.contains(head)) {
                result = true;
                break;
            }
            set.add(head);
            head = head.next;
        }
        return result;
    }
}
