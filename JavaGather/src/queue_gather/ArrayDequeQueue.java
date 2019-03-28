package queue_gather;

import java.util.ArrayDeque;

public class ArrayDequeQueue {

	public static void main(String[] args) {

		ArrayDeque<Object> queue = new ArrayDeque<Object>();
		queue.offer("疯狂Java讲义");
		queue.offer("轻量级JavaEE企业应用实战");
		queue.offer("疯狂Android讲义");
		System.out.println(queue);
		System.out.println(queue.peek());
		System.out.println(queue);
		System.out.println(queue.poll());
		System.out.println(queue);

	}

}
