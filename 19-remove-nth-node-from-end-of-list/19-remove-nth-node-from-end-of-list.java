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
     public ListNode removeNthFromEnd(ListNode head, int n) {
         ListNode slow = head;
        ListNode fast = head;
        
        while(fast.next != null) {
            fast = fast.next;
            if(n == 0) slow = slow.next;
            else n--;
        }
        
        if(slow == head && n > 0) return head.next;
        slow.next = slow.next.next;
        
        return head;
    }
}