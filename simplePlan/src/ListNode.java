
public class ListNode {
	public String data;
	public ListNode next;

	
	public ListNode reverse(ListNode list) {
		ListNode previous = null;
		return reverseHelper(list, null);
	}
	
	private ListNode reverseHelper(ListNode list, ListNode previous) {
		if (list == null) return null;
		if (list.next == null) {
			list.next = previous;
			return list;
		}
		
		ListNode next = previous.next;
		previous.next = list;
		return null;
	}



	public void print() {
		System.out.print(data);
		if (next != null) {
			System.out.print(":");
			next.print();
		}
	}

	public static void main(String[] args) {
		ListNode r = new ListNode();
		r.data="a";
		r.next=new ListNode();
		r.next.data = "b";
		r.next.next = new ListNode();
		r.next.next.data= "c";
		
		r.print();
	}

}
