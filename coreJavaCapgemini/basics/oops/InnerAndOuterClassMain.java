package oops;

class Outer{
	static class Inner{
		static void display() {
			System.out.println("Static-method");
		}
		void test() {
			System.out.println("Non-static Method");
		}
	}
}

public class InnerAndOuterClassMain {

	public static void main(String[] args) {
		Outer.Inner.display();
		
		Outer.Inner e1 = new Outer.Inner();
		e1.test();
	}

}
