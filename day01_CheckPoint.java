package com.ssafy.java.day01.basic;

import java.util.Scanner;

public class CheckPoint {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int ki = sc.nextInt();
		int weight = sc.nextInt();

		int ans = weight + 100 - ki;
		if(ans>0)
			System.out.println(String.format("�� ��ġ�� %d�Դϴ�.\n����� ���̱���", ans));
		else System.out.println("����� ���� �ƴմϴ�");
	}
}
