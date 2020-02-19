package com.ssafy.java.day01_04collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/*
 * 객체를 찾는 방식
 * 객체의 equals 메소드를 호출
 * -------------------------------------------------
 */
class Data02 {
	int val;

	Data02(int val) {
		this.val = val;
	}

	// list에서 비교할 equals메소드를 value값으로 처리되도록 재정의
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (o instanceof Data02) {
			Data02 other = (Data02) o;
			if (this.val == other.val) return true;
		}
		return false;
	}
}

public class Test02 {
	public static void main(String[] args) {
		List<Data02> list = new ArrayList<>();
		list.add(new Data02(1));
		Data02 d = new Data02(2);
		list.add(d);
//		list.add(new Data02(2));
		list.add(new Data02(3));

		System.out.println(list.indexOf(new Data02(2)));
		System.out.println(list.indexOf(d));
	}
}
