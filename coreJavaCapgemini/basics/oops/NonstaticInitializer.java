package oops;

public class NonstaticInitializer {
	
	{
		System.out.println("Non-static initializer/anonymous block");
	}
	NonstaticInitializer(){
		System.out.println("Hii I am constructor");
	}
	public static void main(String[] args) {
		NonstaticInitializer ns = new NonstaticInitializer();
	}
}
