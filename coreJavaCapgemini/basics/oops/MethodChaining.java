package oops;

class Demo2{
	Demo2 m1(){
		return this;
	}
	Demo2 m2(){
		return this;
	}
	Demo2 m3(){
		return this;
	}
	Demo2 m4(){
		return this;
	}


	
}

public class MethodChaining {

	public static void main(String[] args) {
		Demo2 d1 = new Demo2();
		Demo2 obj = d1.m1().m2().m3().m4();
		System.out.println(obj);

	}

}
