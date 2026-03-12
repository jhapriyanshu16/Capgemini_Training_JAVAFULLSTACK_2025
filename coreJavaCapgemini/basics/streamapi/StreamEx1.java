package streamapi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StreamEx1 {

	public static void main(String[] args) {
		ArrayList<Integer> a1 = new ArrayList<>();
		a1.add(10);
		a1.add(20);
		a1.add(30);
		a1.add(40);
		a1.add(50);
		a1.add(60);
		System.out.println(a1);
		
		a1.stream()
			.forEach(System.out::println);
		
		List<String> names = Arrays.asList("Shraddha","Kavya","Rohit");
		names.stream()
			.forEach(System.out::println);
		
		long count = names.stream().count();
		System.out.println(count);

	}

}
