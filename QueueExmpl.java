package stacks;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExmpl {

	public static void main(String[] args) {
		Queue<Integer> queue=new LinkedList<>();
		
		queue.add(11);
		queue.add(12);
		queue.add(13);
		queue.add(14);
		queue.add(15);
		
		System.out.println(queue.remove());
	}

}
