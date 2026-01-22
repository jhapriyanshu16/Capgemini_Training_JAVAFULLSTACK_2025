package Collection;

import java.util.HashSet;

public class SetPrgrm {

	public static void main(String[] args) {
		HashSet set = new HashSet();
		set.add(16);
		set.add(18);
		set.add(32);
		set.add(null);
		System.out.println(set);
		
		System.out.println(set.contains(16));
		
		for (Object o : set) {
			System.out.println(o);
		}
		
		HashSet set2 = new HashSet();
		set2.add(new Student("Piyanshu",134));
		set2.add(new Student("Tanmoy",555));
		set2.add(new Student("Devanshu",815));
		set2.add(new Student("Devanshu",815));
		
		System.out.println(set2);

	}

}
