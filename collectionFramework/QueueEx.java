package collectionFramework;

import java.util.*;

public class QueueEx {

	public static void main(String[] args) {
		// queue�� linkedlist�� ������������Ƿ� linkedlist�� ������ ȣ��
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
