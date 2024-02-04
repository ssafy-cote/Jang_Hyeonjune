package com.ssafy.ws.step3;

public class BookTest {

	public static void main(String[] args) {

		IBookManager bm = BookManagerImpl.getInstance();
//		bm.add(new Book("21424", "Java Pro", "김하나", "jaen.kr", 15000, "Java 기본 문법", 10));
//		bm.add(new Book("21425", "Java Pro2", "김하나", "jaen.kr", 25000, "Java 기본 문법", 20));
//		bm.add(new Book("35355", "분석설계", "소나무", "jaen.kr", 30000, "SW 모델링", 30));
//		bm.add(new Magazine("45678", "월간 알고리즘", "홍길동", "jaen.kr", 10000, "1월 알고리즘", 40, 2021, 1));
//
//		System.out.println("도서 전체 목록");
//		for (Book b : bm.getList()) {
//			System.out.println(b.toString());
//		}
//		System.out.println("일반 도서 목록");
//		for (Book b : bm.getBooks()) {
//			System.out.println(b.toString());
//		}
//		System.out.println("잡지 목록");
//		for (Book b : bm.getMagazines()) {
//			System.out.println(b.toString());
//		}
//
//		System.out.println("도서 제목 포함검색");
//		for (Book b : bm.searchByTitle("Java")) {
//			System.out.println(b.toString());
//		}
//
//		System.out.println("도서 가격 총합 & 평균");
//		System.out.println("도서 가격 총합 : " + bm.getTotalPrice());
//		System.out.println("도서 가격 평균 : " + bm.getPriceAvg());
//
//		String isbn = "21424";
//		int cnt = 11;
//		System.out.println("도서판매 : " + isbn + "," + cnt + "개");
//
//		try {
//			bm.sell(isbn, cnt);
//		} catch (ISBNNotFoundException e) {
//			System.out.println(e.getIsbn() + " : 없는 도서입니다.");
//		} catch (QuantityException e) {
//			System.out.println("수량이 부족합니다.");
//		}
//		
//		try {
//			bm.buy(isbn, 10);
//		} catch (ISBNNotFoundException e) {
//			System.out.println(e.getIsbn() + " : 없는 도서입니다.");
//		} catch (QuantityException e) {
//			System.out.println("수량이 부족합니다.");
//		}
//		
//		try {
//			bm.sell(isbn, cnt);
//		} catch (ISBNNotFoundException e) {
//			System.out.println(e.getIsbn() + " : 없는 도서입니다.");
//		} catch (QuantityException e) {
//			System.out.println("수량이 부족합니다.");
//		}
//		bm.saveData();
	}

}
