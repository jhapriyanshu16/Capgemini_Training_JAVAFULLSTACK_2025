package Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class BookComparator implements Comparator<Book>{
	@Override
	public int compare(Book o1, Book o2) {
		return o1.price - o2.price;
	}
	
}

public class ComparatorInterface {

	public static void main(String[] args) {
		ArrayList books = new ArrayList();
		books.add(new Book(1000));
		books.add(new Book(100));
		books.add(new Book(150));
		books.add(new Book(20));
		books.add(new Book(500));
		
		System.out.println(books);
		
		Collections.sort(books, new BookComparator());
		
		System.out.println(books);

	}

}
