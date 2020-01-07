package ch5_exercie1;

public class Book {
	private String title;
	private String author;
	private int publishYear;
	private boolean isBorrowed = false;
	
	//contructor
	public Book(String title, String author, int publishYear) {
		this.title = title;
		this.author = author;
		this.publishYear = publishYear;
	}
	// method
	void borrow() {
		isBorrowed = true;
	}
	void returnBack() {
		isBorrowed = false;
	}
	String getTitle() {
		return title;
	}
	String getAuthor() {
		return author;
	}
	int publishYear() {
		return publishYear;
	}
	public String isBorrowed() {
		String status;
		if(isBorrowed) {
			status= "Not available";
		}else {
			status= "Available";
		}
		return status;
	}
	public String toString() {
		return "Title: " + title + "\n\t by " + author + "--published " + publishYear + "\n\t Status: " + isBorrowed() + " to Borrowed";
	}
}
