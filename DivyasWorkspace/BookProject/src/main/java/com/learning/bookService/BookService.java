package com.learning.bookService;

import java.util.List;

import com.learning.model.BookModel;

public interface BookService {
	
	BookModel getById(int id);
	List<BookModel> getBookByAuthor(String author);
	List<BookModel> getBookByCategory(String category);
	
	
	
	
	

}
