package Collection;

import java.util.ArrayDeque;

public class Dequeueprgrm {

	public static void main(String[] args) {
		ArrayDeque dq = new ArrayDeque();
		dq.offer(10);
		dq.offer(20);
		dq.offer(30);
		dq.offer(40);
		
		dq.offer("Hello");
		System.out.println(dq);
		
		dq.offerFirst(5);
		System.out.println(dq);
		
		dq.offerLast(6);
		System.out.println(dq);
		
		dq.poll();
		System.out.println(dq);
		
		dq.pollFirst();
		System.out.println(dq);
		
		dq.pollLast();
		System.out.println(dq);
		

	}

}
