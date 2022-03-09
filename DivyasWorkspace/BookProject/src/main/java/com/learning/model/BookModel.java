package com.learning.model;

public class BookModel {
	
	private String author;
	private String bookname;
	private int bookid;
	private String category;
	
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getBookname() {
		return bookname;
	}
	public void setBookname(String bookname) {
		this.bookname = bookname;
	}
	public int getBookid() {
		return bookid;
	}
	public void setBookid(int bookid) {
		this.bookid = bookid;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	@Override
	public String toString() {
		return "BookModel [authorname=" + author + ", bookname=" + bookname + ", bookid=" + bookid + ", category="
				+ category + "]";
	}
	public BookModel(String author,String bookname, int bookid, String category) {
		
		this.author = author;
		this.bookname = bookname;
		this.bookid = bookid;
		this.category = category;
	}
	public BookModel()
	{

}
}
