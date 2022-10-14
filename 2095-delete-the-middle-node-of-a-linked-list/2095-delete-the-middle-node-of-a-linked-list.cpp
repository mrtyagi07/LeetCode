/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     ListNode *next;
 *     ListNode() : val(0), next(nullptr) {}
 *     ListNode(int x) : val(x), next(nullptr) {}
 *     ListNode(int x, ListNode *next) : val(x), next(next) {}
 * };
 */
class Solution {
public:
   ListNode* deleteMiddle(ListNode *head)
        {
            if (head == NULL || head->next == NULL) return NULL;

            ListNode *first = head, *second = head->next->next;
            while (second != NULL and second->next != NULL)
            {
                first = first->next;
                second = second->next->next;
            }
            first->next = first->next->next;

            return head;
        }
};