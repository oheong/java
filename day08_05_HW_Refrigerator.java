package ssafy.hw200219;

public class Refrigerator extends Product{
	private int L;

	public Refrigerator(){
		
	}
	public Refrigerator(String num, String name, int price, int jaego, int l) {
		super(num, name, price, jaego);
		L = l;
	}

	public int getL() {
		return L;
	}

	public void setL(int l) {
		L = l;
	}
	public String toString() {
		return  "�� �ѹ� : "+super.getNum() + "\t �� �̸� : " + super.getName() + "\t ���� : " + super.getPrice() + "\t ��� : " + super.getJaego() + "\t ���� : " + getL() + ".";
		}
}