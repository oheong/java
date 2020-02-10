package com.ssafy.java.day04.clazz01.self;

class Book {
	private String isbn;
	private String title;
	private String author;
	private String publisher;
	private int price;
	private String desc;

	void setBook(String isbn, String title, String author, String publisher, int price, String desc) {
		this.isbn = isbn;
		this.title = title;
		this.author = author;
		this.publisher = publisher;
		this.price = price;
		this.desc = desc;
	}

	public String toString() {
		return isbn + "\t| " + title + "\t| " + author + "\t| " + publisher + "\t| " + price + "\t| " + desc + "\n";
	}
}

class Magazine {
	private String isbn;
	private String title;
	private String author;
	private String publisher;
	private int year;
	private int month;
	private int price;
	private String desc;

	void setMagazine(String isbn, String title, String author, String publisher, int year, int month, int price,
			String desc) {
		this.isbn = isbn;
		this.title = title;
		this.author = author;
		this.publisher = publisher;
		this.year = year;
		this.month = month;
		this.price = price;
		this.desc = desc;
	}

	public String toString() {
		String date = year + "." + month;
		return isbn + "\t| " + title +"\t| " + author + "\t| " + publisher + "\t| " + price + "\t| " + desc + "\t\t| " + date
				+ "\n";
	}
}

public class BookTest {
	public static void main(String[] args) {
		System.out.println("************************************도서목록************************************");
		Book b1 = new Book();
		Book b2 = new Book();
		Magazine m = new Magazine();

		b1.setBook("21424", "Java Pro", "김하나", "Jaen.kr", 15000, "Java 기본 문법");
		b2.setBook("35355", "분석 설계", "소나무", "Jaen.kr", 30000, "SW 모델링");
		m.setMagazine("35535", "Java World", "편집부", "Java.com", 2018, 2, 7000, "첫걸음");

		
		System.out.printf(b1.toString());
		System.out.printf(b2.toString());
		System.out.printf(m.toString());
	}
}
