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
       public ListNode reverseBetween(ListNode head, int m, int n) {
        if(head == null) return null;
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode pre = dummy, cur = head;
        int k = 1;
        while(cur.next != null && k != m){
            cur = cur.next;
            pre = pre.next;
            k++;
        }

        while(cur.next != null && k != n){
            ListNode preNext = pre.next;
            pre.next = cur.next;
            ListNode next = cur.next;
            cur.next = next.next;
            next.next = preNext;
            k++;
        }

        return dummy.next;
    }

}