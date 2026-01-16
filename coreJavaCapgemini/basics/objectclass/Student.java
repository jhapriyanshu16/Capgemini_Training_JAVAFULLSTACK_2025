package objectclass;

public class Student {
	String name;
	int id;
	public Student(String name, int id) {
		this.name = name;
		this.id = id;
	}
	public boolean equals(Object o) {
		Student s = (Student)o;
		if(name == s.name && id == s.id) {
			return true;
		}
		return false;
	}

	public static void main(String[] args) {
		Student s1 = new Student("Priyanshu",43);
		Student s2 = new Student("Devanshu",19);
		Student s3 = new Student("Priyanshu",43);
		
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));
		
		

	}

}
