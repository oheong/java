package com.ssafy.java.day02_07WS;

public class Magazine extends Book {
	private int month;

	Magazine() {
	}

	public Magazine(int month) {
		super();
		this.month = month;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public String toString() {
		return super.getIsbn() + ", " + super.getTitle() + ", " + super.getPrice() + ", " + getQuantity() + ", "
				+ getMonth() + ".";
	}
}
