package decisionmaking;

import java.util.Scanner;

public class dmQ5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		if (num < 0) {
			System.out.println("Negative");
			if (num > 0) {
				System.out.println("Positive");
				if (num ==0 ) {
					System.out.println("Zero");
				}
			}
            
		}
		}

}
