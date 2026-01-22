package Collection;

import java.util.*;

public class ArrayList2 {

	public static void main(String[] args) {
		ArrayList<Integer> al1 = new ArrayList<>();
		al1.add(10);
		al1.add(20);
		al1.add(30);
		al1.add(40);
		al1.add(50);
		al1.add(6);
		
		System.out.println(al1);
		
		al1.remove(5);
		
		System.out.println(al1);
		
		ArrayList<Integer> al2 = new ArrayList<>(List.of(20,50,90,100));
		
		al1.removeAll(al2);
		System.out.println(al1);
		
		ArrayList<Integer> al3 = new ArrayList<>(List.of(10,20,30,40,50));
		al3.retainAll(al2);
		System.out.println(al3);
		
		al3.clear();
		System.out.println(al3);
		
		
		ArrayList<Integer> newList = new ArrayList<>();
		newList.add(10);
		newList.add(80);
		newList.add(20);
		newList.add(100);
		newList.add(5);
		newList.add(40);
		
		System.out.println("List before sorting: "+newList);
		
		Collections.sort(newList);
		
		System.out.println("List after sorting: "+newList);
		

	}

}
