package com.ssafy.ws.setp3;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class BookManager {
	private List<Book> books = new ArrayList<>();

	public BookManager() {
		loadData();
	}

	// 도서 추가
	public void add(Book book) {
		books.add(book);
	}

	// 도서삭제
	public void remove(String isbn) {
		System.out.println("*********************도서삭제 : " + isbn + "*********************");
		for (Book b : books) {
			if (b.GetIsbn().equals(isbn)) {
				books.remove(b);
				System.out.println(isbn + " 책을 삭제했습니다.");
				return;
			}
			System.out.println("해당 책은 없습니다.");
			return;
		}
	}

	// 도서목록
	public Book[] getList() {
		System.out.println("*********************도서 전체 목록*********************");
		Book[] result = books.toArray(new Book[books.size()]);
		return result;
	}

	// 도서조회 isbn
	public Book searchByIsbn(String isbn) {
		System.out.println("*********************도서 조회 : " + isbn + "*********************");
		// Book[] seach_book = new Book[size];
		// int count = 0;
		// for (int i = 0; i < size; i++) {
		// // 순회하며 해당 고유 번호 찾기
		// if (books[i].GetIsbn().equals(isbn)) {
		//// System.out.println(books[i].toString());
		// seach_book[count] = books[i];
		// count++;
		// }
		// }
		// return Arrays.copyOf(seach_book, count);

		// List활용
		for (Book b : books) {
			if (b.GetIsbn().equals(isbn))
				return b;
		}
		return null;

	}

	// 도서조회 title
	public Book[] searchByTitle(String title) {
		System.out.println("*********************도서 제목 포함검색:" + title + "*********************");
		// Book[] seach_book = new Book[size];
		// int count = 0;
		// for (int i = 0; i < size; i++) {
		// // 순회하며 해당 고유 번호 찾기
		// if (books[i].GetTitle().contains(title)) {
		// seach_book[count] = books[i];
		// count++;
		// }
		// }
		// return Arrays.copyOf(seach_book, count);

		// List활용
		List<Book> result = new ArrayList<>();
		int i = 0;
		for (Book b : books) {
			if (b.GetTitle().contains(title))
				result.add(b);
		}
		return result.toArray(new Book[result.size()]);
	}

	// 잡지가 아닌 일반도서 리스트를 반환
	// 도서목록
	public Book[] getBook() {
		System.out.println("*********************일반 도서 목록*********************");
		// Book[] book_list = new Book[size];
		// int count = 0;
		// for (int i = 0; i < size; i++) {
		// if (books[i] instanceof Magazine) {
		// continue;
		// } else {
		// book_list[count] = books[i];
		// count++;
		// }
		// }
		// return Arrays.copyOf(book_list, count);

		// List활용
		List<Book> result = new ArrayList<>();
		int i = 0;
		for (Book b : books) {
			if (!(b instanceof Magazine)) {
				result.add(b);
			}
		}
		return result.toArray(new Book[result.size()]);
	}

	// 잡지가 아닌 일반도서 리스트를 반환
	// 도서목록
	public Book[] getMagazine() {
		System.out.println("*********************잡지 목록*********************");
		// Magazine[] magazine_list = new Magazine[size];
		// int count = 0;
		// for (int i = 0; i < size; i++) {
		// if (books[i] instanceof Magazine) {
		// magazine_list[count] = (Magazine) books[i];
		// count++;
		// }
		// }
		// return Arrays.copyOf(magazine_list, count);

		List<Book> result = new ArrayList<>();
		int i = 0;
		for (Book b : books) {
			if (b instanceof Magazine) {
				result.add((Magazine) b);
			}
		}
		return result.toArray(new Book[result.size()]);
	}

	// 도서 가격 총합
	public int getTotalPrice() {
		// int sum = 0;
		// for (int i = 0; i < size; i++) {
		// Book b = books[i];
		// sum += b.getPrice();
		// }
		// return sum;

		// list
		int sum = 0;
		for (Book b : books) {
			sum += b.getPrice();
		}
		return sum;
	}

	// 도서 가격 평균
	public double getPriceAvg() {
		return (double) getTotalPrice() / books.size();
	}

	private void loadData() {
		System.out.println("*********************불러온 도서 전체 목록*********************");
		try (ObjectInputStream input = new ObjectInputStream(
				new FileInputStream(new File("./book.dat"))
				)) {
			Object obj = input.readObject();
//			System.out.println(obj);
			books = (List<Book>)obj;
		} catch (IOException e) {
			System.out.println("등록된 도서가 없습니다.");
//			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
//			e.printStackTrace();
		}
	}

	public void saveData() {
		try(ObjectOutputStream output = new ObjectOutputStream(
				new FileOutputStream(new File("./book.dat"))
				)) {
			output.writeObject(books);
			System.out.println("도서리스트 저장");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("파일 낫 파운드");
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
