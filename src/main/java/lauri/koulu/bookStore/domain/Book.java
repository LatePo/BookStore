package lauri.koulu.bookStore.domain;

public class Book {

	/*
	 * title
	 * author
	 * publicationYear
	 * isbn
	 * price
	 */
	
	String title;
	String author;
	String publicationYear;
	String isbn;
	
	//laitettu merkkijonona, toimisi varmaan myös numerona
	String price;
	
	//get
	public String getTitle() {
		return title;
	}
	public String getAuthor() {
		return author;
	}
	public String getPublicationYear() {
		return publicationYear;
	}
	public String getIsbn() {
		return isbn;
	}
	public String getPrice() {
		return price;
	}
	//set
	public void setTitle(String title) {
		this.title = title;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public void setPublicationYear(String publicationYear) {
		this.publicationYear = publicationYear;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	//construct
	public Book(String title, String author, String publicationYear, String isbn, String price) {
		super();
		this.title = title;
		this.author = author;
		this.publicationYear = publicationYear;
		this.isbn = isbn;
		this.price = price;
	}
	//toString
	@Override
	public String toString() {
		return "Book [title=" + title + ", author=" + author + ", publicationYear=" + publicationYear + ", isbn=" + isbn
				+ ", price=" + price + "]";
	}
	
	
}
