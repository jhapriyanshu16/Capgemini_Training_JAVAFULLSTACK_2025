package oops;

class StudentNew{
	String pan;
	int adhar;
	String voting;
	
	StudentNew(){
		
	}
	StudentNew(String pan){
		this();
		this.pan = pan;
	}
	StudentNew(String pan , int adhar){
		this(pan);
		this.adhar = adhar;
	}
	StudentNew(String pan , int adhar, String voting){
		this(pan,adhar);
		this.voting = voting;
	}
	
}

public class ConstructorChaining {

	public static void main(String[] args) {
		
		StudentNew s1 = new StudentNew();
		StudentNew s2 = new StudentNew("AUTPJ");
		StudentNew s3 = new StudentNew("XXYIKFNW",9339);
		StudentNew s4 = new StudentNew("UHIUVE",989538,"CNYPkdkd3245");
		
		System.out.println(s1.adhar);
		
		System.out.println(s2.pan);
		System.out.println(s3.adhar);
		System.out.println(s3.pan);
		System.out.println(s4.adhar);
		System.out.println(s4.pan);
		System.out.println(s4.voting);
		
		
	}

}
