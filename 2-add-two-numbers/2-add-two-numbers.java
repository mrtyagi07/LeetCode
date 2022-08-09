class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        
        boolean carry = false;
        int calculation = 0;
        ListNode result = new ListNode();
        ListNode resultPointer = result; 
        
        while (l1 != null || l2 != null || carry) {      
            if (carry) { calculation++; }
            
            if (l1 != null) {
                calculation += l1.val;
                l1 = l1.next;
            }
            if (l2 != null) {
                calculation += l2.val;
                l2 = l2.next;
            }
            
            if (calculation >= 10) {
                carry = true;
                calculation = calculation % 10;
            } else {
                carry = false;
            }
            resultPointer.next = new ListNode(calculation, null);
            resultPointer = resultPointer.next;
            calculation = 0;   
        }
        return result.next;
    }
}