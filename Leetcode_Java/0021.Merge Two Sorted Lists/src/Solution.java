/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        
        /* start of the result list */
        ListNode result = new ListNode(0);
        
        /* points to the last result node */
        ListNode last = result;
        
        while(true){
            /* if either list runs out, use the other one */
            if(l1 == null){
                last.next = l2;
                break;
            }
            
            if(l2 == null){
                last.next = l1;
                break;
            }
            
            /* 
             * compare the data of the two lists, append the smaller data into "last", and 
             * advance the next node to "last"
             */
            if(l1.val <= l2.val){
                last.next = l1;
                l1 = l1.next;
            }else{
                last.next = l2;
                l2 = l2.next;
            }
            
            /* advance to "last" */
            last = last.next;
        }
        
        return result.next;
    }
}