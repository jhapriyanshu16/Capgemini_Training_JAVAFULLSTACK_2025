package Inheritance;

class Dog{
	public void walk() {
		System.out.println("The dog is walking");
	}
	public void sound() {
		System.out.println("The dog is making sound");
	}
}

public class Overriding {

	public static void main(String[] args) {
		Dog d1 = new Dog();
		d1.walk();
		d1.sound();

	}

}
