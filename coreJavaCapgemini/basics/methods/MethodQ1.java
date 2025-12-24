package methods;

public class MethodQ1 {
	
	public static void areaOfSquare() {
		int s = 4;
		System.out.println(s*s);
	}
	public static void areaOfRectangle() {
		int l = 4;
		int b = 2;
		System.out.println(l*b);
	}
	public static void areaOfTriangle() {
		float b = 54.0f;
		float h = 32.0f;
		System.out.println((float)(0.5*b*h));
	}

	public static void main(String[] args) {
		areaOfSquare();
		areaOfTriangle();
		areaOfRectangle();

	}

	
}
