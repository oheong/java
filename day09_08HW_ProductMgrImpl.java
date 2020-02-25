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
	public List<Product> searchNum(String num) throws CodeNotFoundException {
		System.out.println("==========��ǰ��ȣ �˻� ���==========");
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
	public List<Product> searchLOfRef(int L) throws ProductNotFoundException {
		System.out.println(String.format("==========%dL�̻��� �����==========", L));
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

	// 50inch �̻��� Ƽ�� �˻�
	public List<Product> searchInchOfTV(int inch) throws ProductNotFoundException {
		System.out.println(String.format("==========%dinch�̻��� TV==========", inch));
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

	@Override
	public void open() throws DuplicateException {
		// ��ǰ���� �о����
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
				if (temp[1].contains("�����"))
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
		// ��ǰ���� �����ϱ�
		try {
			StringBuilder sb = new StringBuilder();
			for (int i = 0; i < list.size(); i++) {
				sb.append(list.get(i).toString(1));
				sb.append("\n");
			}
			String s = sb.toString();
			FileWriter fw = new FileWriter("product.dat", false); // ���� ���뿡 �̾
			fw.write(s);
			fw.flush();
			fw.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
