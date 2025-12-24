package methods;

public class Factor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 21;
		for (int i = 1 ; i < num ; i++) {
			if (num % i == 0) {
				System.out.print(i+" ");
			}
		}

	}

}
