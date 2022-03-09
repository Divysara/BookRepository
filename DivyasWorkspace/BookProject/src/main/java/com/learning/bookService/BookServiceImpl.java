package com.learning.bookService;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.learning.model.BookModel;

@Service
public class BookServiceImpl implements BookService{

	
	
	private List<BookModel> getList(){
		
		return Arrays.asList(new BookModel("Joshua Bloch ","Effective Java",1,"IT"),
				new BookModel("Lauren Beukes","Broken Monsters",2,"Horror"),
				new BookModel("Kathy","Spring",3,"IT"),
				new BookModel("Dr.Seuss","Cat in the hat",4,"kids"),
				new BookModel("Craig Walls","Spring Boot in Action",5,"IT"),
				new BookModel("Jory John","The Couch Potato",6,"kids"));
	}

	@Override
	public BookModel getById(int id) {
		return getList()
				.stream()
				.filter((book)->book.getBookid()==id)
				.findAny()
				.orElse(new BookModel());
	}

	@Override
	public List<BookModel> getBookByAuthor(String author) {
		return getList()
				.stream()
				.filter((book)->book.getAuthor().equals(author)).collect(Collectors.toList());
	}
	
	
	@Override
	public List<BookModel> getBookByCategory(String category) {
		return getList()
				.stream()
				.filter((book)->book.getCategory().equals(category)).collect(Collectors.toList());
	
	}

}

/*
 * @Override
	public BookModel getById(int id) {
		// TODO Auto-generated method stub
		return getList()
				.stream()
				.filter((book)->book.getBookid()==id)
				.findAny()
				.orElse(new BookModel());
	}

	@Override
	public List<BookModel> getBookByAuthor(String author) {
		return getList()
				.stream()
				.filter((book)->book.getAuthorname().equals(author)).collect(Collectors.toList());
	}

	@Override
	public List<BookModel> getBookByCategory(String category) {
		return getList()
				.stream()
				.filter((book)->book.getCategory().equals(category)).collect(Collectors.toList());
	
	}*/
