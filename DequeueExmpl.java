package stacks;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeueExmpl {

	public static void main(String[] args) {
		Deque<Integer> deque=new ArrayDeque<>();
		deque.addFirst(11);
		deque.add(12);
		deque.addLast(18);
		deque.addFirst(9);
		
		System.out.println(deque);

	}

}
