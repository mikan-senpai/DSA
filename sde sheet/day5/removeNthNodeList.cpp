/*
Given the head of a linked list, remove the nth node from the end of the list and return its head.

 

Example 1:


Input: head = [1,2,3,4,5], n = 2
Output: [1,2,3,5]
Example 2:

Input: head = [1], n = 1
Output: []
Example 3:

Input: head = [1,2], n = 1
Output: [1]
 

Constraints:

The number of nodes in the list is sz.
1 <= sz <= 30
0 <= Node.val <= 100
1 <= n <= sz
*/

//------------------------------------------------------------------------------------------------------------
//---------------------------------------------CODE-----------------------------------------------------------
//------------------------------------------------------------------------------------------------------------
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
        ListNode* removeNthFromEnd(ListNode* head, int n) {
            ListNode* dummy=new ListNode;
            dummy->next=NULL;
            ListNode* fast=head;
            ListNode* slow=head;
            // int i = 1;
            // do
            // {
            //     fast=fast->next;
            //     i++;
            // }


            for (int i = 1; i < n; i++)
            {
                /* code */
                fast=fast->next;
            }



            while(i<n);

            while(fast->next!=NULL)
            {
                slow=slow->next;
                fast=fast->next;
            }

            ListNode* freeing_node=slow->next;
            slow->next=slow->next->next;
            delete(freeing_node);


            return dummy->next;
            
        }
    };