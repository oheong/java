package com.ssafy.java.day01.basic;

import java.util.Scanner;

public class CheckPoint {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int ki = sc.nextInt();
		int weight = sc.nextInt();

		int ans = weight + 100 - ki;
		if(ans>0)
			System.out.println(String.format("비만 수치는 %d입니다.\n당신은 비만이군요", ans));
		else System.out.println("당신은 비만이 아닙니다");
	}
}
