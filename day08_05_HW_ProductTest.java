package ssafy.hw200219;

import java.util.List;

public class ProductTest {
	public static void main(String[] args) {
		ProductMgrImpl pm = new ProductMgrImpl();
		TV tv1 = new TV();
		tv1.setNum("11111");
		tv1.setName("고급 티비");
		tv1.setPrice(5800000);
		tv1.setJaego(5);
		tv1.setInch(75);

		// 상품정보 저장
		pm.inputData(tv1);
		pm.inputData(new TV("22222", "중급 티비", 3200000, 2, 45));
		pm.inputData(new Refrigerator("33333", "4도어 냉장고", 7800000, 2, 800));
		pm.inputData(new Refrigerator("44444", "2도어 냉장고", 3200000, 1, 700));

		// 상품정보 전체를 검색하는 기능
		List<Product> lookTotal = pm.totalSearch();
		for (int i = 0; i < lookTotal.size(); i++) {
			System.out.println(lookTotal.get(i).toString());
		}

		List<Product> lookNum = pm.searchNum("11111");
		for (int i = 0; i < lookNum.size(); i++) {
			System.out.println(lookNum.get(i).toString());
		}

		List<Product> lookName = pm.searchName("도어");
		for (int i = 0; i < lookName.size(); i++) {
			System.out.println(lookName.get(i).toString());
		}

		List<Product> lookTV = pm.searchTV();
		for (int i = 0; i < lookTV.size(); i++) {
			System.out.println(lookTV.get(i).toString());
		}

		List<Product> lookRef = pm.searchRefrigerator();
		for (int i = 0; i < lookRef.size(); i++) {
			System.out.println(lookRef.get(i).toString());
		}

		List<Product> lookDel = pm.delete("11111");
		for (int i = 0; i < lookDel.size(); i++) {
			System.out.println(lookDel.get(i).toString());
		}

		List<Product> lookTotalPrice = pm.totalSearch();
		int sum = 0;
		for (int i = 0; i < lookTotalPrice.size(); i++) {
			sum += lookTotalPrice.get(i).getPrice();
		}

		System.out.println(String.format("재고들의 총 합 : %d", sum));
	}
}
