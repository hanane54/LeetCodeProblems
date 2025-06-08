import java.util.*;

// can be found on https://leetcode.com/problems/remove-duplicates-from-sorted-list/
// Memory 43.84 MB Beats 94.44%
// Runtime 0 ms Beats 100.00%


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
class RemoveDuplicatesSortedList {
    public ListNode deleteDuplicates(ListNode head) {
            if (head == null || head.next == null) {
                return head;
            }
            
            ListNode current = head; 
            while (current.next != null) {
                if (current.val == current.next.val) {
                    current.next = current.next.next;  
                } else {
                    current = current.next;
                }
            }
            return head;  
    }
}