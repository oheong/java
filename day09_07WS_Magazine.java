package com.ssafy.java.day02_07WS;

public class Magazine extends Book {
	private int month;

	public Magazine(String isbn, String title, int price, int quantity, int month) {
		super(isbn, title, price, quantity);
		this.month = month;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public String toString() {
		return super.getIsbn() + "\t| " + super.getTitle() + "\t| " + super.getPrice() + "\t| " + getQuantity() + "\t| "
				+ getMonth() + ".";
	}
}
