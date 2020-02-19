package ssafy.hw200219;

import java.util.ArrayList;
import java.util.List;

public class ProductMgrImpl implements IProductMgr {
	private ArrayList<Product> list = new ArrayList<Product>();

	// ��ǰ������ ��ü �迭�� Ȱ���Ͽ� ����
	public void inputData(Product p) {
		list.add(p);
	}

	// ��ǰ���� ��ü�� �˻��ϴ� ���
	public List<Product> totalSearch() {
		System.out.println("==========������ ��ü �˻� ���==========");
		return list;
	}

	// ��ǰ��ȣ�� ��ǰ�� �˻��ϴ� ���
	public List<Product> searchNum(String num) {
		System.out.println("==========��ǰ��ȣ �˻� ���==========");
		List<Product> returnNum = new ArrayList<>();
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getNum().equals(num)) {
				returnNum.add(list.get(i));
			}
		}
		return returnNum;
	}

	// ��ǰ������ ��ǰ�� �˻��ϴ� ���
	public List<Product> searchName(String name) {
		System.out.println("==========��ǰ�� �˻� ���==========");
		List<Product> returnName = new ArrayList<>();
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getName().contains(name)) {
				returnName.add(list.get(i));
			}
		}
		return returnName;
	}

	// TV������ �˻�
	public List<Product> searchTV() {
		System.out.println("==========TV ��ü �˻� ���==========");
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
		System.out.println("==========Refriderator ��ü �˻� ���==========");
		List<Product> returnRef = new ArrayList<>();
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i) instanceof Refrigerator) {
				returnRef.add(list.get(i));
			}
		}
		return returnRef;
	}

	// ��ǰ��ȣ�� ��ǰ�� �����ϴ� ���
	public List<Product> delete(String num) {
		System.out.println("==========���� �� list==========");
		// �̰ŵ� �ٽ�
		for (Product value : list) {
			if (value.getNum().equals(num)) {
				list.remove(value);
				break;
			}
		}
		return list;
	}

	// ��ü ��� ��ǰ �ݾ��� ���ϴ� ���
	public List<Product> totalPrice() {
		return list;
	}

	// 400L �̻��� ����� �˻�
	public List<Product> searchLOfRef(int L) {
		System.out.println(String.format("==========%dL�̻��� �����==========", L));
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

	// 50inch �̻��� Ƽ�� �˻�
	public List<Product> searchInchOfTV(int inch) {
		System.out.println(String.format("==========%dinch�̻��� TV==========", inch));
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

	// ��ǰ��ȣ�� ������ �Է¹޾� ��ǰ ������ ������ �� �ִ� ���
	public List<Product> inputNumPriceChangeToPrice(String num, int price) {
		System.out.println(String.format("==========�ٲ� ���� Ȯ��=========="));
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
