package Collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayList1 {

	public static void main(String[] args) {
		ArrayList a1 = new ArrayList();
		a1.add(10);
		a1.add(20);
		a1.add(30);
		a1.add(null); //As array takes non primitive (Integer here, so null can be added to an arraylist);
		a1.add("Hello"); //We can store heterogenous data in ArrayList
		
		ArrayList a2 = new ArrayList();
		a2.add(50);
		a2.add(60);
		
		//a2.add(a1);    //Output : [50, 60, [10, 20, 30, null, Hello]]
		a2.addAll(a1);   //Output: [50, 60, 10, 20, 30, null, Hello]
		
		System.out.println(a2);
		
		//Inserting at a perticular index:
		a2.add(3,50);  //stores 50 at the third index
		
		ArrayList students = new ArrayList();
		students.add(new Student("Shraddha",111));
		students.add(new Student("Vaibhav",112));
		students.add(new Student("Priyanka",113));
		
		Object keyElement = new Student("Shraddha",111);
		
		System.out.println(students);
		System.out.println(students.contains(keyElement)); //override the equals method in student class 
		
		
		ArrayList list = new ArrayList();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		
		System.out.println(list);
		
		//get(index)
		for (int i = 0 ; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		//Using for-each
		for(Object o : list) {
			System.out.println(o);
		}
		
		//Using iterator
		Iterator i = list.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		
		//Using list iterator - can only be used with list hierarchy. Have extra methods - previous() and hasPrevious()
		ListIterator li = list.listIterator();
		System.out.println("------------------");
		while(li.hasNext()) {
			System.out.println(li.next());
		}
		while(li.hasPrevious()) {
			System.out.println(li.previous());
		}
		
		
		//generic collection = type safety
		ArrayList<Integer> list2 = new ArrayList<>();
		
		list2.add(50);
		list2.add(40);
		list2.add(20);
		
		int sum = 0;
		
		for(Integer num : list2) {
			sum += num;
		}
		
		System.out.println("The sum is : "+ sum);
	   
		
		

	}

}
