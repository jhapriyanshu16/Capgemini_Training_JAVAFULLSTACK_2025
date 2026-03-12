package questions;

import java.util.*;
import java.util.stream.Collectors;

public class streamquest {

	public static void main(String[] args) {
		List<Integer> al = Arrays.asList(1,2,3,4,5,6,6,7,8,9,9,10);
		
		
		
//		List<Integer> res1 = al.stream().filter(num -> num % 2 != 0).toList();
//		
//		List<Integer> res2 = al.stream().filter(num -> num % 2 != 0).collect(Collectors.toList());	
//		System.out.println(res1);
		
		Map<Boolean, List<Integer>> m = al.
				stream().
				collect(Collectors.partitioningBy(n -> n % 2 == 0));
		
		System.out.println("Even elems : "+ m.get(true));
		System.out.println("Odd elems : "+ m.get(false));
		
		List<Integer> resl = al.stream().distinct().collect(Collectors.toList());
		System.out.println("Distinct elems : "+ resl);
		
		
		

	}

}
