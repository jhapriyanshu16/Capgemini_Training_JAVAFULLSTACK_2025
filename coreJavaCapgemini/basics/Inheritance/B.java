package Inheritance;

public class B extends A{
	public void display() {
		System.out.println(a);
	}

	public static void main(String[] args) {
		B b = new B();
		b.display();

	}
}
