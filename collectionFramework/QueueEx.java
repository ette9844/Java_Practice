package collectionFramework;

import java.util.*;

public class QueueEx {

	public static void main(String[] args) {
		// queue는 linkedlist로 만들어져있으므로 linkedlist의 생성자 호출
		Queue<Integer> queue = new LinkedList<>();
		
		queue.offer(10);
		queue.offer(20);
		queue.offer(30);
		
		// FIFO
		System.out.println(queue.poll());
		System.out.println(queue.poll());
		System.out.println(queue.poll());
	}

}
