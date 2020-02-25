package ssafy.hw200220;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ProductMgrImpl implements IProductMgr {
	private ArrayList<Product> list = new ArrayList<Product>();
	private FileReader fr;

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
	public List<Product> searchNum(String num) throws CodeNotFoundException {
		System.out.println("==========상품번호 검색 기능==========");
		List<Product> returnNum = new ArrayList<>();
		int count = 0;
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getNum().equals(num)) {
				returnNum.add(list.get(i));
				count++;
			}
		}
		if (count == 0) {
			throw new CodeNotFoundException();
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
	public List<Product> searchLOfRef(int L) throws ProductNotFoundException {
		System.out.println(String.format("==========%dL이상의 냉장고==========", L));
		List<Product> returnL = new ArrayList<>();
		int count = 0;
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i) instanceof Refrigerator) {
				Refrigerator r = (Refrigerator) list.get(i);
				if (L <= r.getL()) {
					returnL.add(r);
					count++;
				}
			}
		}
		if (count == 0)
			throw new ProductNotFoundException();
		return returnL;
	}

	// 50inch 이상의 티비 검색
	public List<Product> searchInchOfTV(int inch) throws ProductNotFoundException {
		System.out.println(String.format("==========%dinch이상의 TV==========", inch));
		List<Product> returnInch = new ArrayList<>();
		int count = 0;
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i) instanceof TV) {
				TV t = (TV) list.get(i);
				if (inch <= t.getInch()) {
					returnInch.add(t);
					count++;
				}
			}
		}
		if (count == 0)
			throw new ProductNotFoundException();
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

	@Override
	public void open() throws DuplicateException {
		// 상품정보 읽어오기
		try {
			fr = new FileReader("product.dat");
			BufferedReader in = new BufferedReader(fr);
			String s;
			while ((s = in.readLine()) != null) {
				String[] temp = s.split("/");
				for (int i = 0; i < list.size(); i++) {
					if (list.get(i).getNum().equals(temp[0]))
						throw new DuplicateException();
				}
				int tempPrice = Integer.parseInt(temp[2]);
				int tempQuantity = Integer.parseInt(temp[3]);
				int LorInch = Integer.parseInt(temp[4]);
				if (temp[1].contains("냉장고"))
					inputData(new Refrigerator(temp[0], temp[1], tempPrice, tempQuantity, LorInch));
				else
					inputData(new TV(temp[0], temp[1], tempPrice, tempQuantity, LorInch));
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void close() {
		// 상품정보 저장하기
		try {
			StringBuilder sb = new StringBuilder();
			for (int i = 0; i < list.size(); i++) {
				sb.append(list.get(i).toString(1));
				sb.append("\n");
			}
			String s = sb.toString();
			FileWriter fw = new FileWriter("product.dat", false); // 기존 내용에 이어서
			fw.write(s);
			fw.flush();
			fw.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
