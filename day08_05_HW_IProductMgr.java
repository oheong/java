package ssafy.hw200219;

import java.util.List;

public interface IProductMgr {

	// 상품정보를 객체 배열을 활용하여 저장
	void inputData(Product p);

	// 상품정보 전체를 검색하는 기능
	List<Product> totalSearch();

	// 상품번호로 상품을 검색하는 기능
	List<Product> searchNum(String num);

	// 상품명으로 상품을 검색하는 기능
	List<Product> searchName(String name);

	// TV정보만 검색
	List<Product> searchTV();

	// Refrigerator 정보만 검색
	List<Product> searchRefrigerator();

	// 상품번호로 상품을 삭제하는 기능
	List<Product> delete(String num);

	// 전체 재고 상품 금액을 구하는 기능
	List<Product> totalPrice();

	// 400L 이상의 냉장고 검색
	List<Product> searchLOfRef(int L);

	// 50inch 이상의 티비 검색
	List<Product> searchInchOfTV(int inch);

	// 상품번호와 가격을 입력받아 상품 가격을 변경할 수 있는 기능
	List<Product> inputNumPriceChangeToPrice(String num, int price);
}
