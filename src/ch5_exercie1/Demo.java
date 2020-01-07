package ch5_exercie1;

import java.util.ArrayList;
import java.util.List;

public class Demo {

	public static void main(String[] args) {
		Student student = new Student("Channak","WEB2019");
		//book 1
		Book book1 = new Book("Don't Make Me Think","Steve Krung",2000);
		book1.borrow();
		//book2
		Book book2 = new Book("Pro Java Programming","Terrill",2005);
		book2.returnBack();
		//book 3
		Book book3 = new Book("Programming in Python 3","Mark Summerfield",2005);
		book3.borrow();
		//book 4
		Book book4 = new Book("The Clean Coder","Robert",2011);
		book4.borrow();
		//book5
		Book book5 = new Book("The Art of Agile Development","James Shore",2007);
		book5.returnBack();
		//book6
		Book book6 = new Book("Head First Design Patterns","Eric Freeman",2004);
		book6.returnBack();
		//book 7
		Book book7 = new Book("The Linux Command Line","Willian",2009);
		book7.borrow();
		//book 8
		Book book8 = new Book("Code Complete","Steve",1993);
		book8.returnBack();
		//book 9
		Book book9 = new Book("Unit Test Patterns","Gerard Meszaros",2003);
		book9.returnBack();
		// book 10
		Book book10 = new Book("The C++ Programming Language","Bjame Stroustup",2013);
		book10.borrow();

		List<Book> books = new ArrayList<Book>();
		System.out.println("---------------------------------------------------------------------------------------------");
		System.out.format("%1$-30s %2$-20s %3$-20s %4$-20s", "TITLE", "AUTHOR", "YEAR", "STATUS");
		System.out.println();
		System.out.println("---------------------------------------------------------------------------------------------");
		books.add(book1);
		books.add(book2);
		books.add(book3);
		books.add(book4);
		books.add(book5);
		books.add(book6);
		books.add(book7);
		books.add(book8);
		books.add(book9);
		books.add(book10);
		for(Book book: books){
			System.out.format("%1$-30s %2$-20s %3$-20s %4$-20s",
					book.getTitle(), book.getAuthor(), book.publishYear(), book.isBorrowed());
			System.out.println();
		}
		System.out.println("---------------------------------------------------------------------------------------------");

		student.borrowedBook(book5);
		student.returnBook(book2);
		student.borrowedBook(book6);
		student.borrowedBook(book7);
		System.out.println(student);
		System.out.println(book2.getTitle());
		System.out.println(book5.getTitle());
		System.out.println(book6.getTitle());
		book2.borrow();
		book5.borrow();
		book6.borrow();

		System.out.println("---------------------------------------------------------------------------------------------");
		System.out.format("%1$-30s %2$-20s %3$-20s %4$-20s", "TITLE", "AUTHOR", "YEAR", "STATUS");
		System.out.println();
		System.out.println("---------------------------------------------------------------------------------------------");
		for(Book book: books){
			System.out.format("%1$-30s %2$-20s %3$-20s %4$-20s",
					book.getTitle(), book.getAuthor(), book.publishYear(), book.isBorrowed());
			System.out.println();
		}
		System.out.println("---------------------------------------------------------------------------------------------");
	}

}
