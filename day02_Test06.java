package com.ssafy.java.day02.array;

import java.util.Random;

// ������ �迭�� �޸� ����
public class Test06 {
	public static void main(String[] args) {
		int[][] arr = new int[3][]; // ������

		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		arr[0] = new int[2]; // arr[0][0] ���� ����
		arr[2] = new int[1];

		System.out.println(arr[0][0]);

		Random[] arr2 = new Random[3];
		System.out.println(arr2[0].nextInt(10) + 1);//���ܶ�
	}
}
