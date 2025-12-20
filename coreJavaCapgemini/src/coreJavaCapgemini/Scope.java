package coreJavaCapgemini;

public class Scope {
	public static void main(String[] args) {
		final int f = 20;
		//f = 52;    //final variable cannot be reinitialized
		int a = 10;
		System.out.println(a);
		a = 30;
		//int a = 32;
		System.out.println(a);
		
		
	}
}
