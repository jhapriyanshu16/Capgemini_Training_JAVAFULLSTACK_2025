package decisionmaking;
import java.util.Scanner;

public class switchCaseQ {
	public static void main(String[] args) {
		System.out.println("Enter a letter");
		Scanner sc = new Scanner(System.in);
		char c = sc.next().charAt(0);
		
		switch(c) {
		case 'a' : System.out.println("A for Apple");
		break;
		case 'b' : System.out.println("B for Ball");
		break;
		case 'c' : System.out.println("C for Cat");
		break;
		}
		sc.close();
		
	}

}
