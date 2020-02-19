package ssafy.hw200219;

import java.util.ArrayList;
import java.util.List;

public class ProductMgrImpl implements IProductMgr {
	private ArrayList<Product> list = new ArrayList<Product>();

	// 상품정보를 객체 배열을 활용하여 저장
	public void inputData(Product p) {
		list.add(p);
	}

	// 상품정보 전체를 검색하는 기능
	public List<Product> totalSearch() {
		System.out.println("==========데이터 전체 검색 기능==========");
		return list;
	}

	// 상품번호로 상품을 검색하는 기능
	public List<Product> searchNum(String num) {
		System.out.println("==========상품번호 검색 기능==========");
		List<Product> returnNum = new ArrayList<>();
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getNum().equals(num)) {
				returnNum.add(list.get(i));
			}
		}
		return returnNum;
	}

	// 상품명으로 상품을 검색하는 기능
	public List<Product> searchName(String name) {
		System.out.println("==========상품명 검색 기능==========");
		List<Product> returnName = new ArrayList<>();
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getName().contains(name)) {
				returnName.add(list.get(i));
			}
		}
		return returnName;
	}

	// TV정보만 검색
	public List<Product> searchTV() {
		System.out.println("==========TV 전체 검색 기능==========");
		List<Product> returnTV = new ArrayList<>();
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i) instanceof TV) {
				returnTV.add(list.get(i));
			}
		}
		return returnTV;
	}

	// Refrigerator
	public List<Product> searchRefrigerator() {
		System.out.println("==========Refriderator 전체 검색 기능==========");
		List<Product> returnRef = new ArrayList<>();
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i) instanceof Refrigerator) {
				returnRef.add(list.get(i));
			}
		}
		return returnRef;
	}

	// 상품번호로 상품을 삭제하는 기능
	public List<Product> delete(String num) {
		System.out.println("==========삭제 후 list==========");
		// 이거도 다시
		for (Product value : list) {
			if (value.getNum().equals(num)) {
				list.remove(value);
				break;
			}
		}
		return list;
	}

	// 전체 재고 상품 금액을 구하는 기능
	public List<Product> totalPrice() {
		return list;
	}

	// 400L 이상의 냉장고 검색
	public List<Product> searchLOfRef(int L) {
		System.out.println(String.format("==========%dL이상의 냉장고==========", L));
		List<Product> returnL = new ArrayList<>();
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i) instanceof Refrigerator) {
				Refrigerator r = (Refrigerator) list.get(i);
				if (400 <= r.getL())
					returnL.add(r);
			}
		}
		return returnL;
	}

	// 50inch 이상의 티비 검색
	public List<Product> searchInchOfTV(int inch) {
		System.out.println(String.format("==========%dinch이상의 TV==========", inch));
		List<Product> returnInch = new ArrayList<>();
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i) instanceof TV) {
				TV t = (TV) list.get(i);
				if (50 <= t.getInch())
					returnInch.add(t);
			}
		}
		return returnInch;
	}

	// 상품번호와 가격을 입력받아 상품 가격을 변경할 수 있는 기능
	public List<Product> inputNumPriceChangeToPrice(String num, int price) {
		System.out.println(String.format("==========바뀐 가격 확인=========="));
		List<Product> returnChangePrice = new ArrayList<>();
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getNum().equals(num)) {
				list.get(i).setPrice(price);
				returnChangePrice.add(list.get(i));
			}
		}
		return returnChangePrice;
	}
}
