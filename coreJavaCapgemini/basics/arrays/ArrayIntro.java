package arrays;

public class ArrayIntro {

	public static void main(String[] args) {
		int[] arr = new int[5];
		arr[0]= 53;
		arr[1]= 23;
		arr[2] = 55;
		arr[3] = 56;
		arr[4] = 76;
		
		System.out.println(arr[0]);
		
		for (int i = 0 ; i < arr.length; i++) {
			System.out.println(arr[i]);
		}

	}

}
