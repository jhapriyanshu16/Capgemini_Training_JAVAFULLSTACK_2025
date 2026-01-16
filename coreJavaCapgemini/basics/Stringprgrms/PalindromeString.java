package Stringprgrms;

public class PalindromeString {

	public static void main(String[] args) {
		String s  = "abccba";
		char str[] = s.toCharArray();
		boolean isPalindrome=true;
		if(str.length % 2 != 0) isPalindrome = false;
		for (int i = 0; i < str.length; i++) {
		    if (str[i] != str[str.length-1-i]) {
		    	isPalindrome = false;
		    	break;
		    }
		}
		if(isPalindrome) {
			System.out.println("The String is a Palindrome");
		}
		else {
			System.out.println("The String is not a Palindrome");
		}

	}

}
