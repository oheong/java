package com.ssafy.java.day06.ws;

import java.util.ArrayList;
import java.util.Arrays;

public class CarMgr {

	Car[] car = new Car[100];
	int pos = 0;

	public void add(Car c) {
		car[pos++] = c;
	}

	public void search() {
		// 현재 저장된 모든 차량의 정보를 리턴한다.
		System.out.println("==========모든 Car 정보==========");
		for (int i = 0; i < pos; i++) {
			System.out.println(car[i].toString());
		}
	}

	public Car search(String num) {
		// num과 같은 차량 정보를 리턴한다.
		System.out.println("==========Car Num 정보==========");
		for (int i = 0; i < pos; i++) {
			if (car[i].getNum().equals(num)) {
				// System.out.println(car[i].toString());
				return car[i];
			}
		}
		return null;
	}

	public Car[] search(int price) {
		Car[] temp = new Car[pos]; // 임시저장 배열
		int tempPos = 0;
		System.out.println("==========Car Price 정보==========");
		for (int i = 0; i < pos; i++) {
			if (car[i].getPrice() <= price) {
				temp[tempPos++] = car[i];
			}
		}
		Car[] ans = new Car[tempPos];
		System.arraycopy(temp, 0, ans, 0, tempPos);
		return ans;
	}

	public void update(String num, int price) {
		for (int i = 0; i < pos; i++) {
			if (car[i].getNum().equals(num)) {
				car[i].setPrice(price);
			}
		}
	}

	public void delete(String num) {
		Car[] temp = new Car[pos];
		for (int i = 0; i < pos; i++) {
			if (car[i].getNum().equals(num)) {
				System.arraycopy(car, i + 1, temp, 0, pos - i - 1);
				System.arraycopy(temp, 0, car, i, pos - i - 1);
				pos--;
				return;
			}
		}
	}

	public int size() {
		return pos;
	}

	public int totalPrice() {
		int sum = 0;
		System.out.println("==========total Price==========");
		for (int i = 0; i < pos; i++) {
			sum += car[i].getPrice();
		}
		return sum;
	}
}
