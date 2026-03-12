package streamapi;

import java.util.List;
import java.util.Arrays;

class Person{
	private List<String> names;
	
	public void setName(List<String> names) {
		this.names = names;
	}
	
	public void getNamesWithA() {
		names.stream()
			.filter(name -> name.startsWith("A"))
		    .forEach(System.out::println);
	}
	
}

public class StreamInClass {

	public static void main(String[] args) {
		Person p1 = new Person();
	    List<String> names = Arrays.asList("Aditya","Priyanshu","Anuj","Devanshu");
		p1.setName(names);
		p1.getNamesWithA();
		

	}

}
