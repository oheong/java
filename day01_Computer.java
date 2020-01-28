package com.ssafy.java.day01.basic;

import java.util.Scanner;

public class Computer {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();

		System.out.println(String.format("Аі=%d", a * b));
		System.out.println(String.format("Че=%d", a / b));
	}
}
