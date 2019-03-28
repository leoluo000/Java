package queue_gather;

import java.util.ArrayDeque;

public class ArrayDequeStack {

	public static void main(String[] args) {

		ArrayDeque<Object> stack = new ArrayDeque<Object>();
		stack.push("疯狂Java讲义");
		stack.push("轻量级JavaEE企业应用实战");
		stack.push("疯狂Android讲义");
		System.out.println(stack);
		System.out.println(stack.peek());
		System.out.println(stack);
		System.out.println(stack.pop());
		System.out.println(stack);

	}

}
