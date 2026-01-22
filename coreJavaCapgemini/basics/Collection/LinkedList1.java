package Collection;

import java.util.LinkedList;

public class LinkedList1 {

	public static void main(String[] args) {
		LinkedList ll = new LinkedList();
		
		ll.add(10);
		ll.add(20);
		ll.add(30);
		ll.add(50);
		ll.add(null);
		System.out.println(ll);
		
		System.out.println(ll.contains(20));
		System.out.println(ll.indexOf(30));
		
		for (Object o : ll) {
			System.out.println(o);
		}
		

	}
}
