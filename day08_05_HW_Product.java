package ssafy.hw200219;

public class Product {
	private String num; // ��ǰ ��ȣ
	private String name; // ��ǰ��
	private int price; // ���� ����
	private int jaego; // ������
	Product(){
		
	}
	public Product(String num, String name, int price, int jaego) {
		this.num = num;
		this.name = name;
		this.price = price;
		this.jaego = jaego;
	}
	public String getNum() {
		return num;
	}
	public void setNum(String num) {
		this.num = num;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getJaego() {
		return jaego;
	}
	public void setJaego(int jaego) {
		this.jaego = jaego;
	}
	public String toString() {
		return "�� �ѹ� : "+getNum() + "\t �� �̸� : " + getName() + "\t ���� : " + getPrice() + "\t ��� : " + getJaego();
	}
}