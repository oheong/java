package com.ssafy.java.day04.clazz01.self;

class TV {
	private int proNum;
	private String name;
	private int price;
	private int howMany;
	private int inch;
	private String type;

	TV(){ }
	TV(int proNum, String name, int price, int howMany, int inch, String type) {
		this.proNum = proNum;
		this.name = name;
		this.price = price;
		this.howMany = howMany;
		this.inch = inch;
		this.type = type;
	}
	public void setProNum(int num) { this.proNum = num; }
	public void setName(String name) { this.name = name; }
	public void setPrice(int num) { this.price = num; }
	public void setHowMany(int num) { this.howMany = num; }
	public void setInch(int num) { this.inch = num; }
	public void setType(String t) { this.type = t; }
	
	public int getProNum() { return proNum; }
	public String getName() { return name; }
	public int getPrice() { return price; }
	public int getHowMany() {return howMany;}
	public int getInch() { return inch; }
	public String getType() {return type; }
	
	public String toString() {
		return "제품 번호 : " + getProNum() + "\n제품 이름 : " + getName() + "\n가격 : " + getPrice() + "\n수량 : " + getHowMany() 
		+ "\n인치 : " + getInch()+ "\n디스플레이 타입 : " + getType() + "\n";
	}
}

class Refrigerator {
	private int proNum;
	private String name;
	private int price;
	private int howMany;
	private int L;

	Refrigerator(){ }
	Refrigerator(int proNum, String name, int price, int howMany, int L) {
		this.proNum = proNum;
		this.name = name;
		this.price = price;
		this.howMany = howMany;
		this.L = L;
	}
	public void setProNum(int num) { this.proNum = num; }
	public void setName(String name) { this.name = name; }
	public void setPrice(int num) { this.price = num; }
	public void setHowMany(int num) { this.howMany = num; }
	public void setL(int num) { this.L = num; }
	
	public int getProNum() { return proNum; }
	public String getName() { return name; }
	public int getPrice() { return price; }
	public int getHowMany() {return howMany;}
	public int getL() {return L;}
	public String toString() {
		return "제품 번호 : " + getProNum() + "\n제품 이름 : " +  getName() + "\n가격 : " +  getPrice() 
		+ "\n수량 : " + getHowMany()  + "\n용량 : " + getL() + "\n";
	}
}

public class ProductTest {
	public static void main(String[] args) {
		TV tv = new TV(21411868, "삼성 TV", 3200000, 1, 75, "QLED");
		Refrigerator r = new Refrigerator(21411878, "삼성 냉장고", 5200000, 1, 800);

		System.out.println(tv.toString());
		System.out.println(r.toString());
	}
}
