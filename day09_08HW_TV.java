package ssafy.hw200220;

public class TV extends Product {
	private int inch;

	public TV() {

	}

	public TV(String num, String name, int price, int jaego, int inch) {
		super(num, name, price, jaego);
		this.inch = inch;
	}

	public int getInch() {
		return inch;
	}

	public void setInch(int inch) {
		this.inch = inch;
	}

	public String toString() {
		return "모델 넘버 : " + super.getNum() + "\t 모델 이름 : " + super.getName() + "\t 가격 : " + super.getPrice()
				+ "\t 재고 : " + super.getJaego() + "\t 인치 : " + getInch() + ".";
	}

	public String toString(int i) {
		return super.getNum() + "/" + super.getName() + "/" + super.getPrice()
				+ "/" + super.getJaego() + "/" + getInch();
	}
}