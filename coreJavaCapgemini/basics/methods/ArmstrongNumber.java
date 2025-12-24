package methods;

public class ArmstrongNumber {
	public static int cube(int num) {
		return num*num*num;
	}

	public static void main(String[] args) {
		int n = 153;
		int num = 153;
		int sum = 0 ; 
		while(num != 0) {
			int digit = num % 10;
			sum += cube(digit);
			num = num/10;
		}
		System.out.println(sum);
		if (sum == n) {
			System.out.println("It is an Armstrong Number");
		}
		else {
			System.out.println("Not an Armstrong Number");
		}
	}

}
