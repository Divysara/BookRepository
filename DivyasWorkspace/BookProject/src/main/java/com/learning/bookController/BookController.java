package com.learning.bookController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.learning.bookService.BookService;
import com.learning.model.BookModel;

@RestController
@RequestMapping("/book")
public class BookController {
	
	@Autowired
	BookService bookservice;
	
	//https:/localhost:8080/book/index
	@GetMapping("/index")
	public String greet() {
		return "Welcome to Book rest Api";
	}
	
	//https:/localhost:8080/book/book-by-id/4
@GetMapping("/book-by-id/{id}")
public BookModel getBookById(@PathVariable ("id") int bookid) {
	return bookservice.getById(bookid);
}

//https:/localhost:8080/book/book-by-author/john
@GetMapping("/book-by-author")
public List<BookModel> getBookByAuthor(@RequestParam ("author")  String author) {
	return bookservice.getBookByAuthor(author);
}

//https:/localhost:8080/book/book-by-category/?category=fiction&category = IT
@GetMapping("/book-by-category")
public List<BookModel> getBookByCategory(@RequestParam ("category")  String category) {
	return bookservice.getBookByCategory(category);
}
}
