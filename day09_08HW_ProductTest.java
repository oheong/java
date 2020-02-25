package ssafy.hw200220;

import java.util.List;

public class ProductTest {
	public static void main(String[] args) {
		ProductMgrImpl pm = new ProductMgrImpl();

		pm.open();

		// 상품정보 전체를 검색하는 기능
		List<Product> lookTotal = pm.totalSearch();
		for (int i = 0; i < lookTotal.size(); i++) {
			System.out.println(lookTotal.get(i).toString());
		}

		List<Product> lookNum;
		try {
			lookNum = pm.searchNum("11111");
			for (int i = 0; i < lookNum.size(); i++) {
				System.out.println(lookNum.get(i).toString());
			}
		} catch (CodeNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
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

		List<Product> lookDel;
		lookDel = pm.delete("11111");
		for (int i = 0; i < lookDel.size(); i++) {
			System.out.println(lookDel.get(i).toString());
		}

		List<Product> lookLiter;
		try {
			lookLiter = pm.searchLOfRef(400);
			for (int i = 0; i < lookLiter.size(); i++) {
				System.out.println(lookLiter.get(i).toString());
			}
		} catch (ProductNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		List<Product> lookInch;
		try {
			lookInch = pm.searchInchOfTV(50);
			for (int i = 0; i < lookInch.size(); i++) {
				System.out.println(lookInch.get(i).toString());
			}
		} catch (ProductNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		List<Product> lookTotalPrice = pm.totalSearch();
		int sum = 0;
		for (int i = 0; i < lookTotalPrice.size(); i++) {
			sum += lookTotalPrice.get(i).getPrice();
		}

		System.out.println(String.format("재고들의 총 합 : %d", sum));

		pm.close();
	}
}
