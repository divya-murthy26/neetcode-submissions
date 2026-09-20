/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

 class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        // Create a dummy node to start the merged list
        ListNode dummy = new ListNode(-1);
        ListNode current = dummy;
        
        // Pointer for list1 and list2
        ListNode p1 = list1;
        ListNode p2 = list2;
        
        // Traverse both lists and attach the smaller value
        while (p1 != null && p2 != null) {
            if (p1.val <= p2.val) {
                current.next = p1;
                p1 = p1.next;
            } else {
                current.next = p2;
                p2 = p2.next;
            }
            current = current.next;
        }
        
        // Attach the remaining elements
        if (p1 != null) {
            current.next = p1;
        } else {
            current.next = p2;
        }
        
        return dummy.next;
    }
}
