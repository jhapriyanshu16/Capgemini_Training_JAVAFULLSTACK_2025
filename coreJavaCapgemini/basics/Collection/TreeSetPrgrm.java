package Collection;

import java.util.Objects;
import java.util.TreeSet;
import java.util.Comparator;

class Students{
	String name;
	int roll;
	Students(){
		
	}
	Students(String name, int roll){
		this.name = name;
		this.roll = roll;
	}
	@Override
	public String toString() {
		return "Student [name ="+name+", roll=" + roll + "]";
	}
}

class StudentsComparator implements Comparator<Students> {
	@Override
	public int compare(Students o1, Students o2) {
		return o1.roll - o2.roll;
	}
}

public class TreeSetPrgrm {

	public static void main(String[] args) {
		//null cannot be inserted in a TreeSet
		//Heterogenous data cannot be inserted in a treeset
		//insertion order is not maintained
		TreeSet tset = new TreeSet();
		tset.add(10);
		tset.add(20);
		tset.add(30);
		tset.add(40);
		
		//tset.add(null); //NullPointerException
		//tset.add("Hello") ;//ClassCastException
	    
		System.out.println(tset);
		
		TreeSet<Students> tset2 = new TreeSet<>(new StudentsComparator());
		tset2.add(new Students("Vaibhav",1));
		tset2.add(new Students("Vishal",2));
		tset2.add(new Students("Dipsss",3));
		tset2.add(new Students("Vaibhav",1));
		
		System.out.println(tset2);
		


	}

}
