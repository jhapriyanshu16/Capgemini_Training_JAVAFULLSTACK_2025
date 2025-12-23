package loops;

import java.util.Scanner;

public class doWhile {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char inp;
		do {
			System.out.println("Welcome");
			System.out.println("Do you want to print again. Type y/n");
			inp = sc.next().charAt(0);
			if (inp != 'y' && inp !='n') {
				System.out.println("Enter valid character");
				break;
			}
		}
		while(inp=='y');
	}

}
