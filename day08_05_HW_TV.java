package ssafy.hw200219;

public class TV extends Product{
	private int inch;

	TV(){
		
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
		return  "�� �ѹ� : "+super.getNum() + "\t �� �̸� : " + super.getName() + "\t ���� : " + super.getPrice() + "\t ��� : " + super.getJaego() + "\t ��ġ : " + getInch() + ".";
	}
}