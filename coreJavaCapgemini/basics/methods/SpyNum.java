package methods;

public class SpyNum {
	public static void main(String[] args) {
		int num = 1236;
		int sum = 0 ; 
		int prod = 1;
		while(num != 0) {
			int digit = num % 10;
			sum = sum + digit;
			prod = prod * digit;
			num = num/10;
		}
		if (sum == prod) {
			System.out.println("Spy num");
		}
		else {
			System.out.println("Not a spy num");
		}

	}

}
