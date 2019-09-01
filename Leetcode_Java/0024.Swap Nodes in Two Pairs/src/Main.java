
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Solution solution = new Solution();
		
		ListNode head = new ListNode(1);
		ListNode second = new ListNode(2);
		ListNode third = new ListNode(3);
		ListNode fourth = new ListNode(4);
		
		head.next = second;
		second.next = third;
		third.next = fourth;
		
		ListNode result = solution.swapPairs(head);
		
		System.out.print(result.toString());
	}

}
