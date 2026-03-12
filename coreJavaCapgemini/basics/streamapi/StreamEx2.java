package streamapi;

import java.util.*;
import java.util.stream.Collectors;

public class StreamEx2 {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1,2,3,4,5,6);
		
		list.stream()
			.forEach(System.out::print);
		
		System.out.println();
		
		list.stream()
			.filter(num -> num % 2 == 0)
			.forEach(System.out::print);
		
		List<Integer> numbers = Arrays.asList(2,3,4,5,6);
		
		List<Integer> doubled = numbers.stream()
				.map(n -> n*2)
				.collect(Collectors.toList());
		System.out.println(doubled);
		
		List<String> names = Arrays.asList("a","b","c","dog");
		
	    List<String> upperNames = names.stream()
	    								.map(name -> name.toUpperCase())
	    								.collect(Collectors.toList());
	    System.out.println(upperNames);

	}

}
