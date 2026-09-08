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
    ListNode* reverseList(ListNode* head) {
     ListNode* prev = NULL;
     ListNode* current =head;
     while( current!=NULL){
        ListNode* next = current->next;  // Current ke next node ko save kar liya

        current->next = prev;  // Current ka link ulta karke previous node se jod diya

        prev = current;  // Previous ko current bana diya
        current = next;  // Current ko saved next node par move kar diya
        }

        return prev;  // Prev ab new head hai, isliye reversed list return
    } 

        
    
};