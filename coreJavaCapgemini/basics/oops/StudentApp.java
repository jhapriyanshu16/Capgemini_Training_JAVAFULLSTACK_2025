package oops;

public class StudentApp {

	public static void main(String[] args) {
		Student s1 = new Student();
		Student s2 = new Student("AUTPJ");
		Student s3 = new Student("XXYIKFNW",9339);
		Student s4 = new Student("UHIUVE",989538,"CNYPkdkd3245");
		
		System.out.println(s1.adhar);
		
		System.out.println(s2.pan);
		System.out.println(s3.adhar);
		System.out.println(s3.pan);
		System.out.println(s4.adhar);
		System.out.println(s4.pan);
		System.out.println(s4.voting);
		
		

	}

}

