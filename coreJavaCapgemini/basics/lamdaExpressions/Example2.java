package lamdaExpressions;

public class Example2 {

	public static void main(String[] args) {
		Student s1 = new Student("Priyanshu",523) {
			public void display() {
				System.out.println("Hii");
			}
		};
		s1.display();
		
	}

}
