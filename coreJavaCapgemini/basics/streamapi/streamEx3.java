package streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.Map;

public class streamEx3 {
	public static void main(String[] args) {
		String[] arr = {"hello","no","tree","hat","branch","dsa","horse"};
	    Stream<String> stream = Stream.of(arr);
//		stream
//			.map(s -> new Employee(s))
//			.forEach(System.out::println);
//		
//		Stream<Integer> stream2 = Stream.of(1,2,3,4,5,6,7,8,9,10);
//		Map<Boolean,List<Integer>> m = stream2
//										.collect(Collectors.partitioningBy(x-> x%2 == 0));
//		System.out.println(m.get(true));
		
		stream
			  .filter(str -> str.startsWith("h"))
			  .map(String::toUpperCase)
			  .forEach(System.out::println);
		
	}

}
