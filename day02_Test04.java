package com.ssafy.java.day02.array;

import java.util.Arrays;
import java.util.function.IntConsumer;
import java.util.stream.IntStream;

public class Test04 {
	public static void main(String[] args) {

		int[] arr = { 1, 10, 100 };
		System.out.println("1. 1.4 버전");
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		System.out.println("----------------------");
		System.out.println("2. 1.5 버전 부터 향상된 for");
		for (int val : arr) {
			System.out.println(val);
		}
		System.out.println("----------------------");

		System.out.println("3. Arrays API 사용");
		String data = Arrays.toString(arr);
		System.out.println(Arrays.toString(arr));

		System.out.println("----------------------");

		System.out.println("4. JDK8 버전 제공 Stream API 활용");
		/*
		IntStream is = Arrays.stream(arr);
		is.forEach(new MyCon());
		// 람다식
//		is.forEach((value) -> {
//			System.out.println("+++" + value);
//		});
		is.forEach(value -> System.out.println("+++" + value)); // 위에랑 같은 식임.
		*/
		Arrays.stream(arr).forEach(value -> System.out.println("+++" + value)); // 위에랑 같은 식임.
	}

}

class MyCon implements IntConsumer {
	public void accept(int value) {
		System.out.println("+++" + value);
	}

}
