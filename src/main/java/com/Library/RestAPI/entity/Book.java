package com.Library.RestAPI.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity 
@Table(name = "Book")
public class Book {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int bookId;
	@Column 
	private String bookName;
	@Column
	private String Author;
	@Column
	private String ISBN;
	@Column
	private boolean Availability;
	
	public Book() {
		
	}
	public Book(int bookId, String bookname, String author, String iSBN, boolean availability) {
		super();
		this.bookId = bookId;
		bookName = bookname;
		Author = author;
		ISBN = iSBN;
		Availability = availability;
	}
	
	
	public int getBookId() {
		return bookId;
	}
	public void setBookId(int bookId) {
		this.bookId = bookId;
	}
	
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public String getAuthor() {
		return Author;
	}
	public void setAuthor(String author) {
		Author = author;
	}
	public String getISBN() {
		return ISBN;
	}
	public void setISBN(String iSBN) {
		ISBN = iSBN;
	}
	public boolean isAvailability() {
		return Availability;
	}
	public void setAvailability(boolean availability) {
		Availability = availability;
	}
	
	
	
	
	@Override
	public String toString() {
		return "Book [book_id=" + bookId + ", bookName=" + bookName + ", Author=" + Author + ", ISBN=" + ISBN
				+ ", Availability=" + Availability + "]";
	}
	
}
