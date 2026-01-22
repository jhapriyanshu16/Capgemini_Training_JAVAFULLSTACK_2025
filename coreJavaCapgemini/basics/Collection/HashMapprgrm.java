package Collection;

import java.util.HashMap;

public class HashMapprgrm {

	public static void main(String[] args) {
		HashMap map = new HashMap();
		map.put(1, "Shraddha");
		map.put(1, "Kavya");
		map.put(3, "Suraj");
		map.put(4, "Bharti");
		
		System.out.println(map);
	    
		System.out.println(map.entrySet());
		System.out.println(map.values());
		System.out.println(map.entrySet());
		
		for (Object o : map.entrySet()) {
			System.out.println(o);
		}
		
		for(Object o: map.keySet()) {
			System.out.println(o);
		}

	}

}
