package com.ssafy.java.day05.ws;

public class ProductTest {
	public static void main(String[] args) {
		ProductMgr pm = new ProductMgr();
		TV tv1 = new TV();
		tv1.setNum("11111");
		tv1.setName("고급 티비");
		tv1.setPrice(5800000);
		tv1.setJaego(5);
		tv1.setInch(75);

		TV tv2 = new TV("22222", "중급 티비", 3200000, 2, 45);

		Refrigerator re1 = new Refrigerator("33333", "4도어 냉장고", 7800000, 2, 800);
		Refrigerator re2 = new Refrigerator("44444", "2도어 냉장고", 3200000, 1, 700);
		
		pm.inputData(tv1);
		pm.inputData(tv2);
		pm.inputData(re1);
		pm.inputData(re2);
		
		pm.totalSearch();
		
		pm.searchNum("11111");
		pm.searchNum("33333");
		
		pm.searchName("도어");
		
		pm.searchTV();
		pm.searchRefrigerator();
		
		pm.delete("11111");
		
		pm.totalSearch();
		
		System.out.println(String.format("재고들의 총 합 : %d", pm.totalPrice()));
	}
}
