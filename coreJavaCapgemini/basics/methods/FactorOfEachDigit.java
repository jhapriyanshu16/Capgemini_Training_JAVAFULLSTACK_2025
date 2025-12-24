package methods;

public class FactorOfEachDigit {
	public static void Factor(int num){
		for (int i = 1 ; i <= num ; i++) {
			if (num % i == 0) {
				System.out.print(i+" ");
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 146;
		while(num != 0) {
			int digit = num % 10;
			System.out.print("Factor of "+ digit+ " : ");
			Factor(digit);
			System.out.println();
			num = num/10;
		}
	}

}
