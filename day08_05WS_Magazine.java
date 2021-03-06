package com.ssafy.java.day01_05WS;

public class Magazine extends Book {
	private int year;
	private int month;

	Magazine(){
	}
	Magazine(String isbn, String title, String author, String publisher, int price, String desc, int year,
			int month) {
		super(isbn, title, author, publisher, price, desc);
		this.year = year;
		this.month = month;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public String toString() {
		return super.getIsbn() + ", " + super.getTitle() + ", " + super.getAuthor() + ", " + super.getPublisher() + ", "
				+ super.getPrice() + ", " + super.getDesc() + ", " + getYear() + "." + getMonth();
	}
}
