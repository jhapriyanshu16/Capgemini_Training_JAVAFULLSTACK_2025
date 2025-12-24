package arrays;

import java.util.Scanner;

public class ArrayQ7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] arr = new int[5];
		
		for (int i = 0 ; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		System.out.println("First Element : " + arr[0]);
		System.out.println("First Element : " + arr[arr.length-1]);
	

	}

}
