class Solution {
public:
bool isPalindrome(ListNode* head) 
{
    ListNode *node=head,*pt1,*pt2,*pt3;
    if(!node) return true;
    int num=0,iter;
    while(node) {num++;node=node->next;}
    if(num<2) return true;
    pt1=head;
    pt2=pt1->next;
    pt1->next=NULL;
    iter=num%2? (num-1)/2 :num/2-1;
    for(int i=0;i<iter;i++)
    {
        pt3=pt2->next;
        pt2->next=pt1;
        pt1=pt2;
        pt2=pt3;
    }
    if(num%2) pt1=pt1->next;
    while(pt1&&pt2)
      if(pt1->val!=pt2->val)
        return false;
      else
      {
          pt1=pt1->next;
          pt2=pt2->next;
      }
    return true;
}
};