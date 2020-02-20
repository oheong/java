package com.ssafy.java.day02_07WS;

import java.util.List;

public class BookTest {
	static Book book[] = new Book[10];
	static int pos = 0;

	static IBookMgr mgr = new BookMgrImpl();

	public static void main(String[] args) {
		mgr.open();
		
		List<Book> lookTotal = mgr.totalSearch();
		for (int i = 0; i < lookTotal.size(); i++) {
			System.out.println(lookTotal.get(i).toString());
		}

		
		
		
		
		mgr.close();
	}
}
