package com.ssafy.ws.step3;

@SuppressWarnings("serial")
public class ISBNNotFoundException extends RuntimeException   {
	private String isbn;

	public ISBNNotFoundException(String isbn) {
		super();
		this.isbn = isbn;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
}
