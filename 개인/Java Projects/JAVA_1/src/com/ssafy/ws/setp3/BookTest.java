package com.ssafy.ws.setp3;

public class BookTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BookManager bm = new BookManager();
		Book b1 = new Book("21424", "Java Pro", "김하나", "jaen.kr", 15000, "Java 기본 문법");
		Book b2 = new Book("21425", "Java Pro2", "김하나", "jaen.kr", 25000, "Java 기본 문법");
		Book b3 = new Book("35355", "븐석설계", "소나무", "jaen.kr", 30000, "SW 모델링");
		Book b4 = new Magazine("45678", "월간 알고리즘", "홍길동", "jaen.kr", 10000, "1월 알고리즘", 2021, 1);
		
		// 도서추가
		bm.add(b1);
		bm.add(b2);
		bm.add(b3);
		bm.add(b4);
		
		bm.saveData();

		// 도서전체목록
		Book[] books = bm.getList();
		for (Book b : books) {
			System.out.println(b.toString());
		}

		// 일반 도서 목록
		books = bm.getBook();
		for (Book b : books) {
			System.out.println(b.toString());
		}

		// 잡지 목록
		books = bm.getMagazine();
		for (Book b : books) {
			System.out.println(b.toString());
		}

		// 도서 제목 포함검색
		books = bm.searchByTitle("Java");
		for (Book b : books) {
			System.out.println(b.toString());
		}
		
		// 도서 isbn 검색
		Book search_isbn_book = bm.searchByIsbn("21424");
		if(search_isbn_book == null)
			System.out.println("없는 책입니다.");
		else
			System.out.println(search_isbn_book);
		
		// 도서 삭제
		bm.remove("21424");
		
		// 도서 isbn 검색
		search_isbn_book = bm.searchByIsbn("21424");
		if(search_isbn_book == null)
			System.out.println("없는 책입니다.");
		else
			System.out.println(search_isbn_book);
		

		// 도서 가격 총합
		System.out.println("도서 가격 총합 : " + bm.getTotalPrice());

		// 도서 가격 평균
		System.out.printf("도서 가격 평균 : %.2f%n", bm.getPriceAvg());

	}
	
	

}
