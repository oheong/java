package com.ssafy.java.day02.array;

import java.util.Scanner;

public class DigitTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num;
		int[] arr = new int[10];
		while (true) {
			num = sc.nextInt();
			if (num == 0)
				break;
			arr[num / 10]++;
		}

		for (int i = 0; i < 10; i++) {
			if (arr[i] == 0)
				continue;
			System.out.println(String.format("%d : %d°³", i, arr[i]));
		}
	}
}
