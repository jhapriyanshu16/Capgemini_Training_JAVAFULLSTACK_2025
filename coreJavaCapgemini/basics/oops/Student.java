package oops;

public class Student {
	String pan;
	int adhar;
	String voting;
	
	Student(){
		
	}
	Student(String pan){
		this.pan = pan;
	}
	Student(String pan , int adhar){
		this.pan = pan;
		this.adhar = adhar;
	}
	Student(String pan , int adhar, String voting){
		this.pan = pan ;
		this.adhar = adhar;
		this.voting = voting;
	}

}
