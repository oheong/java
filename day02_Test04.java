package com.ssafy.java.day02.array;

import java.util.Arrays;
import java.util.function.IntConsumer;
import java.util.stream.IntStream;

public class Test04 {
	public static void main(String[] args) {

		int[] arr = { 1, 10, 100 };
		System.out.println("1. 1.4 ����");
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		System.out.println("----------------------");
		System.out.println("2. 1.5 ���� ���� ���� for");
		for (int val : arr) {
			System.out.println(val);
		}
		System.out.println("----------------------");

		System.out.println("3. Arrays API ���");
		String data = Arrays.toString(arr);
		System.out.println(Arrays.toString(arr));

		System.out.println("----------------------");

		System.out.println("4. JDK8 ���� ���� Stream API Ȱ��");
		/*
		IntStream is = Arrays.stream(arr);
		is.forEach(new MyCon());
		// ���ٽ�
//		is.forEach((value) -> {
//			System.out.println("+++" + value);
//		});
		is.forEach(value -> System.out.println("+++" + value)); // ������ ���� ����.
		*/
		Arrays.stream(arr).forEach(value -> System.out.println("+++" + value)); // ������ ���� ����.
	}

}

class MyCon implements IntConsumer {
	public void accept(int value) {
		System.out.println("+++" + value);
	}

}
