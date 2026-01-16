package Exception;

import java.util.Scanner;

public class CustomException {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the age");
		int age = sc.nextInt();
		
		if(age<18) {
			throw new UnderAgeException("Age below 18 exception occured");
		}
		else {
			System.out.println("You are eligible to vote");
		}

	}

}
