package Inheritance;

import java.util.Scanner;

class Cab{
	
}

class Mini extends Cab{
	
}

class Sedan extends Cab{
	
}

class Luxary extends Cab{
	
}

public class Ola {

	public static void main(String[] args) {
	     System.out.println("Press 1 to book mini");
	     System.out.println("Press 2 to book sedan");
	     System.out.println("Press 3 to book Luxary");
	     
	     Scanner sc = new Scanner(System.in);
	     int choice = sc.nextInt();
	     
	     Cab c = null;
	     
	     switch(choice) {
	     case 1: {
	    	 c = new Mini();
	     }
	     break;
	     case 2: {
	    	 c = new Sedan();
	     }
	     break;
	     case 3:{
	    	 c = new Luxary();
	     }
	     break;
	     }
	     
	     System.out.println(c);

	}

}
