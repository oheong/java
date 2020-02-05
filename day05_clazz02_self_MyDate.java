package com.ssafy.java.day04.clazz02.self;

public class MyDate {
	int year;
	int month;
	int day;

	MyDate(int year, int month, int day) {
		this.year = year;
		this.month = month;
		this.day = day;
	}

	String pad(int num) {
		return num < 10 ? "0" + num : String.valueOf(num);
	}

	public String toString() {
		String ans = "";
		if (12 < month) {
			ans = month + "월은 존재하지 않는 월입니다. 월을 1월로 설정합니다.\n" + year + "/01" + "/" + day;
		}

		else if ((month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) && 31 < day) {
			// 31일까지 있음
			ans = "해당 월에" + day + "일은 존재하지 않는 날짜입니다. 일자를 1일로 설정합니다.\n" + year + "/" + pad(month) + "/01";
		}

		else if ((month == 4 || month == 6 || month == 9 || month == 11) && 30 < day) {
			// 30일까지 있음
			ans = "해당 월에" + day + "일은 존재하지 않는 날짜입니다. 일자를 1일로 설정합니다.\n" + year + "/" + pad(month) + "/01";
		}

		else if (year % 4 != 0 && month == 2 && 28 < day) {
			// 4로 나누어떨어지는 년도는 윤년임
			ans = "해당 월에" + day + "일은 존재하지 않는 날짜입니다. 일자를 1일로 설정합니다.\n" + year + "/" + pad(month) + "/01";

		} else
			ans = year + "/" + pad(month) + "/" + pad(day);
		return ans;
	}
}
