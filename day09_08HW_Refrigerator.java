package ssafy.hw200220;

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
		return  "모델 넘버 : "+super.getNum() + "\t 모델 이름 : " + super.getName() + "\t 가격 : " + super.getPrice() + "\t 재고 : " + super.getJaego() + "\t 리터 : " + getL() + ".";
		}
	public String toString(int i) {
		return  super.getNum() + "/" + super.getName() + "/" + super.getPrice() + "/" + super.getJaego() + "/" + getL();
		}
}