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
    public ListNode rotateRight(ListNode head, int k) {
        ListNode dummy = head;     
        if(head == null || head.next == null)
            return head;
        int n = 1;
        while(dummy.next!=null){
            dummy = dummy.next;
            n++;
        }
        dummy.next = head;
        dummy = head;
        k = k%n;     
        for(int i = 0;i<n-k-1;i++){
            dummy = dummy.next;
        }
        head = dummy.next;
        dummy.next = null;
        return head;
    }
}