class Solution {
public:
bool isPalindrome(ListNode* head) {
	ListNode *slow = head, *fast = head, *prev = NULL, *tmp;
	while(fast && fast -> next) // finding mid point
		fast = fast -> next -> next,
		tmp = slow -> next, slow -> next = prev, prev = slow, slow = tmp;        
	slow = (fast ? slow -> next : slow); // for odd length case as mentioned above
	while(slow) // check if linked lists starting at prev and slow are equal
		if(slow -> val != prev -> val) return false;
		else slow = slow -> next, prev = prev -> next;
	return true;
}
};