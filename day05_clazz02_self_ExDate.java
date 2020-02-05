package com.ssafy.java.day04.clazz02.self;

public class ExDate {
	private int year;
	private int month;
	private int day;

	ExDate() {
		this(1970, 1, 1);
	}

	ExDate(int year, int month, int day) {
		// alt + shift + s + o => 생성자 자동생성
		this.year = year;
		this.month = month;
		this.day = day;
	}

	// 생성자는 모든 경우의수를 다 만들어야하는가?

	String pad(int num) {
		return num < 10 ? "0" + num : String.valueOf(num);
	}

	public void showDate() {
		// System.out.printf("%d년 %02d월 %02d일\n", year, month, day);
		System.out.printf("%d년 %s월 %s일\n", year, pad(month), pad(day));
	}
}
