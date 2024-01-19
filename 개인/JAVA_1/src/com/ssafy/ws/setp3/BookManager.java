package com.ssafy.ws.setp3;

import java.util.Arrays;

public class BookManager {
	private final int MAX_SIZE = 100;
	private Book[] books = new Book[MAX_SIZE];
	private int size;

	// 도서 추가
	public void add(Book book) {
		if (size == MAX_SIZE) {
			System.out.println("책이 가득 찼습니다.");
			return;
		} else {
			books[size] = book;
			size++;
		}
	}

	// 도서삭제
	public void remove(String isbn) {
		System.out.println("*********************도서삭제" + isbn + "*********************");
		for (int i = 0; i < size; i++) {
			// 순회하며 해당 고유 번호 찾기
			if (books[i].GetIsbn().equals(isbn)) {
//				System.out.println(books[i].GetTitle() + " 책을 삭제했습니다.");
				books[i] = books[size - 1];
				size--;
				return;
			}
		}

		System.out.println("해당 책은 없습니다.");
		return;
	}

	// 도서목록
	public Book[] getList() {
		System.out.println("*********************도서 전체 목록*********************");
		return Arrays.copyOf(books, size);
	}

	// 도서조회
	public Book[] searchByIsbn(String isbn) {
		System.out.println("*********************도서조회:" + isbn + "*********************");
		Book[] seach_book = new Book[size];
		int count = 0;
		for (int i = 0; i < size; i++) {
			// 순회하며 해당 고유 번호 찾기
			if (books[i].GetIsbn().equals(isbn)) {
//				System.out.println(books[i].toString());
				seach_book[count] = books[i];
				count++;
			}
		}
		return Arrays.copyOf(seach_book, count);

	}

	// 도서조회
	public Book[] searchByTitle(String title) {
		System.out.println("*********************도서 제목 포함검색:" + title + "*********************");
		Book[] seach_book = new Book[size];
		int count = 0;
		for (int i = 0; i < size; i++) {
			// 순회하며 해당 고유 번호 찾기
			if (books[i].GetTitle().contains(title)) {
				seach_book[count] = books[i];
				count++;
			}
		}
		return Arrays.copyOf(seach_book, count);
	}

	// 잡지가 아닌 일반도서 리스트를 반환
	// 도서목록
	public Book[] getBook() {
		System.out.println("*********************일반 도서 목록*********************");
		Book[] book_list = new Book[size];
		int count = 0;
		for (int i = 0; i < size; i++) {
			if (books[i] instanceof Magazine) {
				continue;
			} else {
				book_list[count] = books[i];
				count++;
			}
		}
		return Arrays.copyOf(book_list, count);
	}

	// 잡지가 아닌 일반도서 리스트를 반환
	// 도서목록
	public Book[] getMagazine() {
		System.out.println("*********************잡지 목록*********************");
		Magazine[] magazine_list = new Magazine[size];
		int count = 0;
		for (int i = 0; i < size; i++) {
			if (books[i] instanceof Magazine) {
				magazine_list[count] = (Magazine) books[i];
				count++;
			}
		}
		return Arrays.copyOf(magazine_list, count);
	}

	// 도서 가격 총합
	public int getTotalPrice() {
		int sum = 0;
		for (int i = 0; i < size; i++) {
			Book b = books[i];
			sum += b.getPrice();
		}
		return sum;
	}

	// 도서 가격 평균
	public double getPriceAvg() {
		return (double) getTotalPrice() / size;
	}
}
