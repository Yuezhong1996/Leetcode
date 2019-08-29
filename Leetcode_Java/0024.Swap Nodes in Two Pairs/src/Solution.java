/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode swapPairs(ListNode head) {
        ListNode prev = new ListNode(0);
        prev.next = head;
        head = prev;
        
        while(head.next != null && head.next.next != null){
            ListNode p1 = head.next;
            ListNode p2 = head.next.next;
            
            head.next = p2;
            p1.next = p2.next;
            p2.next = p1;
            
            head = head.next.next;
        }
        
        return prev.next;
    }
}