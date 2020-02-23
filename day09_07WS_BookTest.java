package com.ssafy.java.day02_07WS;

import java.util.List;

public class BookTest {
	static IBookMgr mgr = new BookMgrImpl();

	public static void main(String[] args) {
		mgr.open();

		List<Book> lookTotal = mgr.totalSearch();
		for (int i = 0; i < lookTotal.size(); i++)
			System.out.println(lookTotal.get(i).toString());

		try {
			mgr.sell("1111", 2);
		} catch (QuantityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ISBNNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		lookTotal = mgr.totalSearch();
		for (int i = 0; i < lookTotal.size(); i++)
			System.out.println(lookTotal.get(i).toString());

		try {
			// 재고 없는거 확인 OK
			mgr.sell("66666", 1);
		} catch (QuantityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ISBNNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		lookTotal = mgr.totalSearch();
		for (int i = 0; i < lookTotal.size(); i++)
			System.out.println(lookTotal.get(i).toString());

		int totalPrice = mgr.getTotalAmount();
		System.out.println(String.format("\n재고들의 총 금액 : %,3d\n", totalPrice));

		try {
			// 물품 없는거 확인 OK
			mgr.buy("66666", 5);
		} catch (ISBNNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		lookTotal = mgr.totalSearch();
		for (int i = 0; i < lookTotal.size(); i++)
			System.out.println(lookTotal.get(i).toString());
		
		mgr.close();
	}
}
