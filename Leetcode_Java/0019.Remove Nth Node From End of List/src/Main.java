public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution solution = new Solution();
		
		ListNode head = new ListNode(1);
		ListNode second = new ListNode(2);
		ListNode third = new ListNode(3);
		ListNode fourth = new ListNode(4);
		ListNode fifth = new ListNode(5);
		
		head.next = second;
		second.next = third;
		third.next = fourth;
		fourth.next = fifth;
		
		int n = 2; 
		
		ListNode result = solution.removeNthFromEnd(head, n);
		
		System.out.print(result.toString());
	}
	
}
