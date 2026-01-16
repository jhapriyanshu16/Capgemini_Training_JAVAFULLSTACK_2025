package oops;

class Bottle {
	int size;
}

class Box2{
	String boxName;
}

public class ObjRef {
	
	public static void printRef(Box2 b) {
		System.out.println(b);
	}
	
	public static void printRef(Bottle b) {
		System.out.println(b);
	}

	public static void main(String[] args) {
		Bottle b1 = new Bottle();
		printRef(b1);
		Box2 b2 = new Box2();
		printRef(b2);

	}

}
