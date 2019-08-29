
public class ListNode {
	int val;
	ListNode next;
	ListNode(int x){
		val = x;
	}
	
	/**
	 * Print all nodes, just for test
	 */
	@Override
	public String toString() {
	    String result = val + " ";
	    if (next != null) {
	        result += next.toString();
	    }
	    return result;
	}
}
