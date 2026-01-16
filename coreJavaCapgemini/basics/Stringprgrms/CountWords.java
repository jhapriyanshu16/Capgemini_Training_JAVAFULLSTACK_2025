package Stringprgrms;

public class CountWords {

	public static void main(String[] args) {
		String str = "Hello I am     Priyanshu";
		String[] str1 = str.trim().split(" ");
		int count = 0;
		for (String s : str1) {
			if (!s.equals("")) count++;
		}
		System.out.println(count);
	}

}
