package coreJavaCapgemini;

public class DivisiblePrgrm {
	public static void main(String[] args) {
		int num = 8;
		String res = num%5==0 && num%3==0 ? "Divisible by both":(num%5 == 0? "Divisible by 5 only": (num%3==0 ? "Divisible by 3 only":"Not divisible by both"));
		System.out.println(res);
	}
}
