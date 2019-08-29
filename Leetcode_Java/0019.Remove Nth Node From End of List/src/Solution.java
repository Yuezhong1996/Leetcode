/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
    	ListNode fast = head;
        ListNode slow = new ListNode(0);
        slow.next = head;
        
        for(int i = 0; i < n; i++){
            fast = fast.next;
        }
        
        ListNode temp = slow;
        
        while(fast != null){
            fast = fast.next;
            slow = slow.next;
        }
        
        slow.next = slow.next.next;
        
        return temp.next;
    }
}