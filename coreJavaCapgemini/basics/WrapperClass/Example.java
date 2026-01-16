package WrapperClass;

public class Example {

	public static void main(String[] args) {
		//Boxing 
		int a = 10;
		Integer i1 = new Integer(a);
		System.out.println(i1);
		
		Integer i2 = Integer.valueOf(a);
		System.out.println(a);
		
		//AutoBoxing
		int x = 30;
		Integer y = x;
		System.out.println(y);
		
		Integer z = 10;
		System.out.println(z);
		
		//Unboxing
		int a1 = 10 ;
		Integer a2 = Integer.valueOf(a); //Boxing : Converting to non-primitive type
		int a3 = a2.intValue(); //Unboxing : Converting to primitive type
		

	}

}
