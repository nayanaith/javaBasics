package foo;

import java.util.EnumSet;

public class BootTest {
	public static void main(String args[]){
		System.out.println("All books:\n");
		
	//print all books in enumBook
		for (Book book:Book.values())
			System.out.printf("%-10s%-45s%s\n",book,book.getTitle(),book.getCopyrightYear());
		
		System.out.println("\nDisplay a range of enum constants:\n");
		
		//print first four books
		for(Book book:EnumSet.range(Book.JHTP, Book.CPPHTP))
			System.out.printf("%-10s%-45s%s\n",book,book.getTitle(),book.getCopyrightYear());
	}
	
}
