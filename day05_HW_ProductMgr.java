package com.ssafy.java.day05.ws;

import java.util.ArrayList;
import java.util.Iterator;

public class ProductMgr {
	static ArrayList<Product> list = new ArrayList<Product>();

	// 상품정보를 객체 배열을 활용하여 저장
	void inputData(Product p) {
		list.add(p);
	}

	// 상품정보 전체를 검색하는 기능
	void totalSearch() {
		System.out.println("==========데이터 전체 검색 기능==========");
//		for (int i = 0; i < list.size(); i++) {
//			System.out.println(list.get(i).toString());
//		}
		Iterator<Product> ie = list.iterator();
		while(ie.hasNext()) {
			System.out.println(ie.next());
		}
		System.out.println();
	}

	// 상품번호로 상품을 검색하는 기능
	void searchNum(String num) {
		System.out.println("==========상품번호 검색 기능==========");
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getNum().equals(num)) {
				System.out.println(list.get(i).toString());
			}
		}
		System.out.println();
	}

	// 상품명으로 상품을 검색하는 기능
	void searchName(String name) {
		System.out.println("==========상품명 검색 기능==========");
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getName().contains(name)) {
				System.out.println(list.get(i).toString());
			}
		}
		System.out.println();
	}

	// TV정보만 검색
	void searchTV() {
		System.out.println("==========TV 전체 검색 기능==========");
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i) instanceof TV) {
				System.out.println(list.get(i).toString());
			}
		}
		System.out.println();
	}

	// Refrigerator
	void searchRefrigerator() {
		System.out.println("==========Refriderator 전체 검색 기능==========");
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i) instanceof Refrigerator) {
				System.out.println(list.get(i).toString());
			}
		}
		System.out.println();
	}
	
	// 상품번호로 상품을 삭제하는 기능
	void delete(String num) {
		//이거도 다시
		//list.remove(num);
		for(Product value : list) {
			if(value.getNum().equals(num)) {
				list.remove(value);
				break;
			}
		}
	}

	// 전체 재고 상품 금액을 구하는 기능
	int totalPrice() {
		int sum = 0;
		for (int i = 0; i < list.size(); i++) {
			int t = list.get(i).getJaego() * list.get(i).getPrice();
			sum += t;
		}
		return sum;
	}
}
