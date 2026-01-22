package Collection;
import java.util.*;

public class LinkedHashSetPrgrm {

	public static void main(String[] args) {
		//Insertion order is maintained in LinkedHashSet unlike HashSet. (Doubly ll +  hashtable)
		LinkedHashSet lset = new LinkedHashSet();
		lset.add(10);
		lset.add(20);
		lset.add(30);
		lset.add(40);
		lset.add(null);
	    
		System.out.println(lset);

	}

}
