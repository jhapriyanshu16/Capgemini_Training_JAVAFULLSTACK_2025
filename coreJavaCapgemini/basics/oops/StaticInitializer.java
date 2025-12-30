package oops;

public class StaticInitializer {
	
	static {
		System.out.println("Hii....i am from static-block");
	}

	public static void main(String[] args) {
		System.out.println("Hello from main method");
	}
	
	static {
		System.out.println("Hello from 2nd static-block");
	}
}
