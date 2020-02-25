package ssafy.hw200220;

import java.util.List;

public interface IProductMgr {

	// ��ǰ������ ��ü �迭�� Ȱ���Ͽ� ����
	void inputData(Product p);

	// ��ǰ���� ��ü�� �˻��ϴ� ���
	List<Product> totalSearch();

	// ��ǰ��ȣ�� ��ǰ�� �˻��ϴ� ���
	List<Product> searchNum(String num) throws CodeNotFoundException;

	// ��ǰ������ ��ǰ�� �˻��ϴ� ���
	List<Product> searchName(String name);

	// TV������ �˻�
	List<Product> searchTV();

	// Refrigerator ������ �˻�
	List<Product> searchRefrigerator();

	// ��ǰ��ȣ�� ��ǰ�� �����ϴ� ���
	List<Product> delete(String num) ;

	// ��ü ��� ��ǰ �ݾ��� ���ϴ� ���
	List<Product> totalPrice();

	// 400L �̻��� ����� �˻�
	List<Product> searchLOfRef(int L) throws ProductNotFoundException;

	// 50inch �̻��� Ƽ�� �˻�
	List<Product> searchInchOfTV(int inch) throws ProductNotFoundException;

	// ��ǰ��ȣ�� ������ �Է¹޾� ��ǰ ������ ������ �� �ִ� ���
	List<Product> inputNumPriceChangeToPrice(String num, int price);
	
	public void open() throws DuplicateException;
	
	public void close();
}
