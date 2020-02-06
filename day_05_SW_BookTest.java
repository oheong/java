package com.ssafy.java.day05.ws;

public class BookTest {
	static Book book[] = new Book[10];
	static int pos = 0;

	// 데이터 입력 기능
	static void inputData(Book b) {
		book[pos++] = b;
	}

	// 데이터 전체 검색 기능
	static void totalSearch() {
		System.out.println("==========데이터 전체 검색 기능==========");
		for (int i = 0; i < pos; i++) {
			System.out.println(book[i].toString());
		}
		System.out.println();
	}

	// Isbn으로 정보를 검색하는 기능
	static void searchIsbn(String isbn) {
		System.out.println("==========Isbn 검색 기능==========");
		for (int i = 0; i < pos; i++) {
			if (book[i].getIsbn().equals(isbn)) {
				System.out.println(book[i].toString());
			}
		}
		System.out.println();
	}

	// Title로만 정보를 검색하는 기능 (파라메터로 주어진 제목을 포함하는 모든 정보)
	static void searchTitle(String title) {
		System.out.println("==========Title 검색 기능==========");
		for (int i = 0; i < pos; i++) {
			if (book[i].getTitle().contains(title)) {
				System.out.println(book[i].toString());
			}
		}
		System.out.println();
	}

	// Book만 검색하는 기능
	static void searchBook() {
		System.out.println("==========Book 전체 검색 기능==========");
		for (int i = 0; i < pos; i++) {
			System.out.println(book[i].toString());
		}
		System.out.println();
	}

	// Magazine만 검색하는 기능
	static void searchMagazine() {
		System.out.println("==========Magazine 전체 검색 기능==========");
		for (int i = 0; i < pos; i++) {
			if (book[i] instanceof Magazine) {
				System.out.println(book[i].toString());
			}
		}
		System.out.println();
	}

	// 출판사로 검색하는 기능
	static void searchPub(String pub) {
		System.out.println("==========출판사 검색 기능==========");
		for (int i = 0; i < pos; i++) {
			if (book[i].getPublisher().equals(pub)) {
				System.out.println(book[i].toString());
			}
		}
		System.out.println();
	}

	// 가격으로 검색하는 기능(파라메터로 주어진 가격보다 낮은 도서 검색
	static void searchUnderPrice(int price) {
		System.out.println("==========가격 검색 기능==========");
		for (int i = 0; i < pos; i++) {
			if (book[i].getPrice() <= price) {
				System.out.println(book[i].toString());
			}
		}
		System.out.println();
	}

	// 저장된 모든 도서의 금액을 구하는 기능
	static int totalPrice() {
		int sum = 0;
		for (int i = 0; i < pos; i++) {
			sum += book[i].getPrice();
		}
		return sum;
	}

	// 저장된 모든 도서의 평균을 구하는 기능
	static void avg() {
		System.out.println(totalPrice() / pos);
	}

	public static void main(String[] args) {
		Book b1 = new Book();
		b1.setIsbn("11111");
		b1.setTitle("자바 대장되기");
		b1.setAuthor("김상수");
		b1.setPublisher("동아출판사");
		b1.setPrice(18000);
		b1.setDesc("자바 멍미ㅠ");
		inputData(b1);

		Book b2 = new Book("33333", "자바 짱시룸", "정윤호", "동아출판사", 20000, "ha,,");
		inputData(b2);
		Magazine m1 = new Magazine("22222", "자바 뿌수기", "김석진", "성삼출판사", 13000, "ㅎㅎ", 2019, 12);

		inputData(m1);
		totalSearch();
		searchIsbn("11111");
		searchTitle("자바");
		searchBook();
		searchMagazine();
		searchPub("동아출판사");
		System.out.println("==========모든 도서 금액 검색 기능==========");
		System.out.println(totalPrice());
		System.out.println("==========평균 검색 기능==========");
		avg();
	}
}
