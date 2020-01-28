package com.ssafy.java.day02.array;

public class ArrayTest {
	public static void print(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

	public static void total(int[] arr) {
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		System.out.println(String.format("배열의 합 : %d", sum));
	}

	public static void average(int[] arr) {
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		System.out.println(String.format("배열의 평균 : %d", sum / arr.length));
	}

	public static void minimum(int[] arr) {
		int min = 2123456789;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < min)
				min = arr[i];
		}
		System.out.println(String.format("배열의 최소값 : %d", min));
	}

	public static void main(String[] args) {
		int[] arr = { 34, 23, 64, 25, 12, 75, 22, 88, 53, 37 };
		print(arr);
		total(arr);
		average(arr);
		minimum(arr);
	}
}
