package Inheritance;

public class Son extends Father {
	
	String name = "Son";
	
	public void display() {
		System.out.println("My father Name :"+ super.name);
		System.out.println("My name is :"+this.name);
	}

	public static void main(String[] args) {
		Son s1 = new Son();
		s1.display();

	}

}
