package oops;

class Box{
	static double length;
	static double breadth;
	
	Box(double length, double breadth){
		this.length = length;
		this.breadth = breadth;
	}
	
	public static double getArea(double length,double breadth) {
		return length * breadth;
		
	}
}

public class StaticDemo {
	

	public static void main(String[] args) {
//		Box b1 = new Box(3,4);
		System.out.println(Box.getArea(5.3,56.3));

	}

}

