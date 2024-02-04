package com.ssafy.ws.step3;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class BookManagerImpl implements IBookManager {

	private static List<Book> books = new ArrayList<>();
	private static IBookManager instance = new BookManagerImpl();

	private BookManagerImpl() {
		loadData();
	}

	public static IBookManager getInstance() {
		return instance;
	}

	@Override
	public void add(Book book) {
		books.add(book);
	}

	@Override
	public void remove(String isbn) {
		for (Book b : books) {
			if (b.getIsbn().equals(isbn)) {
				books.remove(b);
				return;
			}
		}
	}

	@Override
	public Book[] getList() {
		return (Book[]) books.toArray(new Book[books.size()]);
	}

	@Override
	public Book searchByIsbn(String isbn) {
		for (Book b : books) {
			if (b.getIsbn().equals(isbn)) {
				return b;
			}
		}
		return null;
	}

	@Override
	public Book[] searchByTitle(String title) {
		List<Book> result = new ArrayList<>();
		for (Book b : books) {
			if (b.getTitle().contains(title)) {
				result.add(b);
			}
		}
		return (Book[]) result.toArray(new Book[result.size()]);
	}

	@Override
	public Magazine[] getMagazines() {
		List<Book> result = new ArrayList<>();
		for (Book b : books) {
			if (b instanceof Magazine) {
				result.add(b);
			}
		}
		return (Magazine[]) result.toArray(new Magazine[result.size()]);
	}

	@Override
	public Book[] getBooks() {
		List<Book> result = new ArrayList<>();
		for (Book b : books) {
			if (!(b instanceof Magazine)) {
				result.add(b);
			}
		}
		return (Book[]) result.toArray(new Book[result.size()]);
	}

	@Override
	public int getTotalPrice() {
		int totalPrice = 0;
		for (Book b : books) {
			totalPrice += b.getPrice();
		}
		return totalPrice;
	}

	@Override
	public double getPriceAvg() {
		return (double) getTotalPrice() / books.size();
	}

	@Override
	public void sell(String isbn, int quantity) throws ISBNNotFoundException, QuantityException {
		Book tmp = searchByIsbn(isbn);
		if (tmp == null)
			throw new ISBNNotFoundException(isbn);
		if (tmp.getQuantity() - quantity < 0)
			throw new QuantityException();
		tmp.setQuantity(tmp.getQuantity() - quantity);
		System.out.println(tmp.toString());
	}

	@Override
	public void buy(String isbn, int quantity) {
		Book tmp = searchByIsbn(isbn);
		if (tmp == null)
			throw new ISBNNotFoundException(isbn);
		if (tmp.getQuantity() - quantity < 0)
			throw new QuantityException();
		tmp.setQuantity(tmp.getQuantity() + quantity);
		System.out.println(tmp.toString());
	}

	@Override
	public void saveData() {
		File f = new File("book.dat");
		try  {
			ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(f));
			out.writeObject(books);
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	private void loadData() {
		File f = new File("book.dat");
		try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(f))) {
			Object obj = in.readObject();
			books = (List<Book>) obj;
		} catch (IOException e) {
			System.out.println("등록된 도서가 없습니다.");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}
