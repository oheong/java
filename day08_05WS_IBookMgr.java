package com.ssafy.java.day01_05WS;

import java.util.List;

public interface IBookMgr {
	// 여기에 메소드들 정의해주고

	// 데이터 입력 기능
	void inputData(Book b);

	// 데이터 전체 검색 기능
	List<Book> totalSearch();

	// Isbn으로 정보를 검색하는 기능
	List<Book> searchIsbn(String isbn);

	// Title로만 정보를 검색하는 기능 (파라메터로 주어진 제목을 포함하는 모든 정보)
	List<Book> searchTitle(String title);

	// Book만 검색하는 기능
	List<Book> searchBook();

	// Magazine만 검색하는 기능
	List<Book> searchMagazine();

	// 출판사로 검색하는 기능
	List<Book> searchPub(String pub);

	// 가격으로 검색하는 기능(파라메터로 주어진 가격보다 낮은 도서 검색
	List<Book> searchUnderPrice(int price);

	// 저장된 모든 도서의 금액을 구하는 기능
	List<Book> totalPrice();

	// 저장된 모든 도서의 평균을 구하는 기능
	List<Book> avg();

	// Magazine중 올해 잡지만 검색하는 기능
	List<Book> searchThisYear(int year);
}
