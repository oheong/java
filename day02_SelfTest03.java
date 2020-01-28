package com.ssafy.java.day02.array;

import java.util.Random;

public class SelfTest03 {
	public static void main(String[] args) {
		int[] num = new int[6];
		Random ran = new Random();
		for (int i = 0; i < 25; i++) {
			num[ran.nextInt(5) + 1]++;
		}
		System.out.println("\t¼ö\tºóµµ");

		for (int i = 1; i < 6; i++) {
			System.out.println(String.format("\t%d\t%d", i, num[i]));
		}
	}
}
