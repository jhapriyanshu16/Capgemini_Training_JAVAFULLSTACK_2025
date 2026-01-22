package lamdaExpressions;

public class Example1 {
	
	interface A {
		void test();
	}
	
	interface B {
		int add(int a, int b);
	}

	public static void main(String[] args) {
		//Java 8
		//Used in Functional Interface (Interface with only one abstract method)
		
		A a = () -> {
			System.out.println("Hii");
			System.out.println("Hello");
		};
		a.test();
		
		B b = (x,y) -> {
			return x+y;
		};
		System.out.println(b.add(10,20));
		
		
	}

}
