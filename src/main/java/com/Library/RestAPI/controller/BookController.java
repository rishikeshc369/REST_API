package com.Library.RestAPI.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.Library.RestAPI.entity.Book;
import com.Library.RestAPI.repository.BookRepository;

@RestController
public class BookController {
	
	@Autowired
	BookRepository repo;
	
	
	
	//get all the books
	
	//localhost:8080/books
	
	@GetMapping("/books")
	public List<Book> getAllBooks() {
		List<Book> read = repo.findAll();
		return read;
	}
	//localhost:8080/books/1
	@GetMapping("/books/{id}")
	public Book getStudent(@PathVariable int id) {
		Book bookname = repo.findById(id).get();
		return bookname; 
	}
	
	@PostMapping("/book/add")
	@ResponseStatus(code=HttpStatus.CREATED)
	public void addBook(@RequestBody Book book) {
		repo.save(book);
	}
	
	@PutMapping("/book/update/{id}")
	public Book updateBook(@PathVariable int id) {
		Book book=repo.findById(id).get();
		book.setBookName("2 states");
		book.setISBN("192-166-000-111");
		book.setAuthor("chetan");
		repo.save(book);
		return book;
	}
	@DeleteMapping("/book/delete/{id}")
	public void removeBook(@PathVariable int id) {
		Book book = repo.findById(id).get();
		repo.delete(book);
	}

}
