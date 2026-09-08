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
    ListNode* mergeTwoLists(ListNode* list1, ListNode* list2) {
        ListNode dummy(0);      //temporary node    // object               

        ListNode* curr = &dummy;   // pointer // Answer list banayega
        while(list1 != NULL && list2 != NULL) {

            if (list1->val <= list2->val) {
                curr->next = list1;     // Smaller node choose
                list1 = list1->next;     // list1 aage
            }
            else {
                curr->next = list2;     // Smaller node choose
                list2 = list2->next;     // list2 aage
            }

            curr = curr->next;           // Answer mein aage
        }

        // Jo list bach gayi, usko directly attach
        if (list1 != NULL)
            curr->next = list1;
        else
            curr->next = list2;

        return dummy.next;               
        
    }
};