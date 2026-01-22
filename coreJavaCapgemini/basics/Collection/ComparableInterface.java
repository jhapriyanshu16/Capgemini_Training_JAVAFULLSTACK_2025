//sorting collection
package Collection;

import java.util.ArrayList;
import java.util.Collections;

class Book implements Comparable<Book>{
	int price;
	Book(){
		
	}
	Book(int price){
		this.price = price;
	}
	
	@Override
	public String toString() {
		return "Book [price=" + price + "]";
	}
	
	@Override
	public int compareTo(Book o) {
		return this.price - o.price;
	}
	
}

public class ComparableInterface{

	public static void main(String[] args) {
		ArrayList books = new ArrayList();
		books.add(new Book(1000));
		books.add(new Book(100));
		books.add(new Book(150));
		books.add(new Book(20));
		books.add(new Book(500));
		
		System.out.println(books);
		
		Collections.sort(books);
		
		System.out.println(books);
		

	}

}
