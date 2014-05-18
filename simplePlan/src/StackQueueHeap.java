import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Stack;


public class StackQueueHeap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<String> s=new Stack<String>();
		s.push("a");
		s.push("b");
		System.out.println(s.toString() + " " + s.pop() + ":" + s.pop() + ">" + s.toString());
		
		
		Queue<String> q = new PriorityQueue<String>();
		q.add("a");
		q.add("b");
		System.out.println(q.remove());
		System.out.println(q.remove());
		
	}

}
