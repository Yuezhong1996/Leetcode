
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution solution = new Solution();
		
		ListNode l1 = new ListNode(1);
		ListNode second = new ListNode(2);
		ListNode third = new ListNode(4);
		
		l1.next = second;
		second.next = third;
		
		ListNode l2 = new ListNode(1);
		ListNode second2 = new ListNode(3);
		ListNode third2 = new ListNode(4);
		
		l2.next = second2;
		second2.next = third2;
		
		ListNode result = solution.mergeTwoLists(l1, l2);
		System.out.println(result.toString());
	}

}
