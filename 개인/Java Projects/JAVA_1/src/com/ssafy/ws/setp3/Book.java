package com.ssafy.ws.setp3;

import java.io.Serializable;

public class Book implements Serializable {
	private String isbn;
	private String title;
	private String author;
	private String publisher;
	private int price;
	String desc;
	
	public Book(String isbn, String title, String author, String publisher, int price, String desc) {
		this.isbn = isbn;
		this.title = title;
		this.author = author;
		this.publisher = publisher;
		this.price = price;
		this.desc = desc;
	}
	public Book() {
		// TODO Auto-generated constructor stub
	}
	public String GetIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	public String GetTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String GetAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String GetPublisher() {
		return publisher;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	
	public String toString() {
		String str = isbn + "\t |  " + title + "\t |  " + author + "\t |  " + publisher + "\t |  " + price + "\t |  " + desc;  
		return str;
	}
	
}
