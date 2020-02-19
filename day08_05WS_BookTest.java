package com.ssafy.java.day01_05WS;

import java.util.List;

public class BookTest {
	static Book book[] = new Book[10];
	static int pos = 0;

	static IBookMgr mgr = new BookMgrImpl();

	public static void main(String[] args) {
		Book b1 = new Book();
		b1.setIsbn("11111");
		b1.setTitle("자바 대장되기");
		b1.setAuthor("김상수");
		b1.setPublisher("동아출판사");
		b1.setPrice(18000);
		b1.setDesc("자바 멍미ㅠ");
		mgr.inputData(b1);
		mgr.inputData(new Book("33333", "자바 짱시룸", "정윤호", "동아출판사", 20000, "ha,,"));
		mgr.inputData(new Magazine("22222", "자바 뿌수기", "김석진", "성삼출판사", 13000, "ㅎㅎ", 2019, 12));
		mgr.inputData(new Magazine("44444", "엘르", "뿌요뿌요", "동동출판사", 15200, "ㅋㅋ", 2019, 03));
		mgr.inputData(new Magazine("55555", "오보이", "오보이마켓", "퀸마마마켓", 8000, "ㅇㅇ", 2020, 1));

		List<Book> lookTotal = mgr.totalSearch();
		for (int i = 0; i < lookTotal.size(); i++) {
			System.out.println(lookTotal.get(i).toString());
		}

		List<Book> lookIsbn = mgr.searchIsbn("11111");
		for (int i = 0; i < lookIsbn.size(); i++) {
			System.out.println(lookIsbn.get(i).toString());
		}

		List<Book> lookTitle = mgr.searchTitle("자바");
		for (int i = 0; i < lookTitle.size(); i++) {
			System.out.println(lookTitle.get(i).toString());
		}

		List<Book> lookBook = mgr.searchBook();
		for (int i = 0; i < lookBook.size(); i++) {
			System.out.println(lookBook.get(i).toString());
		}

		List<Book> lookMagazine = mgr.searchMagazine();
		for (int i = 0; i < lookMagazine.size(); i++) {
			System.out.println(lookMagazine.get(i).toString());
		}

		List<Book> lookPub = mgr.searchPub("동아출판사");
		for (int i = 0; i < lookPub.size(); i++) {
			System.out.println(lookPub.get(i).toString());
		}

		List<Book> lookThisYear = mgr.searchThisYear(2019);
		for (int i = 0; i < lookThisYear.size(); i++) {
			System.out.println(lookThisYear.get(i).toString());
		}

		List<Book> lookUnderPrice = mgr.searchUnderPrice(18000);
		for (int i = 0; i < lookUnderPrice.size(); i++) {
			System.out.println(lookUnderPrice.get(i).toString());
		}

		List<Book> lookTotalPrice = mgr.totalPrice();
		int sum = 0;
		for (int i = 0; i < lookTotalPrice.size(); i++) {
			sum += lookTotalPrice.get(i).getPrice();
		}
		System.out.println(sum);

		List<Book> lookAvg = mgr.avg();
		System.out.println(sum / lookAvg.size());
	}
}
