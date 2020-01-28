package com.ssafy.java.day02.array;

import java.util.Arrays;

public class Test07 {
	public static void main(String[] args) {
		int[][] arr = new int[3][];
		arr[0] = new int[2];
		arr[1] = new int[2];
		arr[2] = new int[2];

		int[][] arr2 = new int[3][2];
		int count = 1;
		for (int i = 0; i < arr2.length; i++) {
			for (int j = 0; j < arr2[i].length; j++) {
				arr2[i][j] = count++;
			}
		}

		// System.out.println(Arrays.toString(arr2));
		System.out.println(Arrays.deepToString(arr2));

		int[][] arr3 = { { 10, 20 }, { 30, 40 }, { 50, 60 } };
		System.out.println(Arrays.deepToString(arr3));
		
		int b=10;
		b=(int)(b*0.3);
		b*=0.5; // 배정연산자는 캐스팅 자동으로 해줌!

	}
}
