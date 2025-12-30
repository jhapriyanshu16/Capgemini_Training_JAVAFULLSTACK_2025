package oops;

class Book{
	String title;
	int price;
	Book(String a, int b){
		title = a;
		price = b;
	}
}

public class OopsIntro {

	public static void main(String[] args) {
		Book b1 = new Book("Java",3000);
		Book b2 = new Book("Python",6000);
		Book b3 = new Book("SQL",500);
//	    b1.title = "Java";
//	    b1.price = 5999;
	    
	    System.out.println(b1.title);
	    System.out.println(b1.price);		

	}

}
