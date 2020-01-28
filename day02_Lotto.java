package com.ssafy.java.day02.array;

import java.util.Random;

public class Lotto {
	public static void main(String[] args) {
		Random random = new Random();
		int[] arr = new int[46];

		int count = 0;
		while (count < 6) {
			// 랜덤 숫자 생성
			int lotto = random.nextInt(45) + 1;
			
			if(arr[lotto]==0) {
				arr[lotto]=1;
				System.out.println(lotto);
				count++;
			}
		}
	}
}
