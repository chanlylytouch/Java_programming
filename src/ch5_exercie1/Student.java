package ch5_exercie1;

import java.util.ArrayList;
import java.util.List;

public class Student{

	private String firstName;
	private String batch;
	private  ArrayList<Book> bookCart ;
	public Student(String firstName,String batch) {
		this.firstName = firstName;
		this.batch = batch;
		bookCart = new ArrayList<Book>();
	}
	public void borrowedBook(Book isBorrow) {
		bookCart.add(isBorrow);
		if(bookCart.add(isBorrow)) {
			System.out.println("This book isn't Avaible");
		}
		if(bookCart.size() > 3) {
			System.out.println("You could borrow only maximum 3 books");
		}
	}
	public void returnBook(Book borrowed) {
		bookCart.add(borrowed);
		if(bookCart.add(borrowed)) {
			System.out.println("You didn't borrow this books");
		}
	}
	@Override
	public String toString() {
		return firstName + " of class " + batch + " has borrowed: ";
	}


}
