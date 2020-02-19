package com.ssafy.java.day01_05WS;

import java.util.ArrayList;
import java.util.List;

public class BookMgrImpl implements IBookMgr {
	// 여기서 구체화하기
	private List<Book> book = new ArrayList<>();

	// 데이터 입력 기능
	public void inputData(Book b) {
		book.add(b);
	}

	// 데이터 전체 검색 기능
	public List<Book> totalSearch() {
		System.out.println("==========데이터 전체 검색 기능==========");
		return book;
	}

	// Isbn으로 정보를 검색하는 기능
	public List<Book> searchIsbn(String isbn) {
		List<Book> returnIsbn = new ArrayList<>();
		System.out.println("==========Isbn 검색 기능==========");
		for (int i = 0; i < book.size(); i++) {
			if (book.get(i).getIsbn().equals(isbn)) {
				returnIsbn.add(book.get(i));
			}
		}
		return returnIsbn;
	}

	// Title로만 정보를 검색하는 기능 (파라메터로 주어진 제목을 포함하는 모든 정보)
	public List<Book> searchTitle(String title) {
		List<Book> returnTitle = new ArrayList<>();
		System.out.println("==========Title 검색 기능==========");
		for (int i = 0; i < book.size(); i++) {
			if (book.get(i).getTitle().contains(title)) {
				returnTitle.add(book.get(i));
			}
		}
		return returnTitle;
	}

	// Book만 검색하는 기능
	public List<Book> searchBook() {
		List<Book> returnBook = new ArrayList<>();
		System.out.println("==========Book 전체 검색 기능==========");
		for (int i = 0; i < book.size(); i++) {
			if (book.get(i) instanceof Magazine)
				continue;
			returnBook.add(book.get(i));
		}
		return returnBook;
	}

	// Magazine만 검색하는 기능
	public List<Book> searchMagazine() {
		List<Book> returnMagazine = new ArrayList<>();
		System.out.println("==========Magazine 전체 검색 기능==========");
		for (int i = 0; i < book.size(); i++) {
			if (book.get(i) instanceof Magazine) {
				returnMagazine.add(book.get(i));
			}
		}
		return returnMagazine;
	}

	// 출판사로 검색하는 기능
	public List<Book> searchPub(String pub) {
		List<Book> returnPub = new ArrayList<>();
		System.out.println("==========출판사 검색 기능==========");
		for (int i = 0; i < book.size(); i++) {
			if (book.get(i).getPublisher().equals(pub)) {
				returnPub.add(book.get(i));
			}
		}
		return returnPub;
	}

	// 가격으로 검색하는 기능(파라메터로 주어진 가격보다 낮은 도서 검색
	public List<Book> searchUnderPrice(int price) {
		List<Book> returnPrice = new ArrayList<>();
		System.out.println("==========가격 검색 기능==========");
		for (int i = 0; i < book.size(); i++) {
			if (book.get(i).getPrice() <= price) {
				returnPrice.add(book.get(i));
			}
		}
		return returnPrice;
	}

	// 저장된 모든 도서의 금액을 구하는 기능
	public List<Book> totalPrice() {
		System.out.println("==========모든 도서 금액 검색 기능==========");
		List<Book> returnTotalPrice = new ArrayList<>();
		for (int i = 0; i < book.size(); i++) {
			returnTotalPrice.add(book.get(i));
		}
		return returnTotalPrice;
	}

	// 저장된 모든 도서의 평균을 구하는 기능
	public List<Book> avg() {
		System.out.println("==========평균 검색 기능==========");
		List<Book> returnAvg = new ArrayList<>();
		for (int i = 0; i < book.size(); i++) {
			returnAvg.add(book.get(i));
		}
		return returnAvg;
	}

	@Override
	public List<Book> searchThisYear(int year) {
		List<Book> returnThisYear = new ArrayList<>();
		System.out.println("==========올해의 잡지==========");
		for (int i = 0; i < book.size(); i++) {
			if (book.get(i) instanceof Magazine) {
				Magazine m = (Magazine) book.get(i);
				if (m.getYear() == year) {
					returnThisYear.add(book.get(i));
				}
			}
		}
		return returnThisYear;
	}
}
