package com.ssafy.java.day02.array;

import java.util.Arrays;

//배열의 깊은 복사와 얕은 복사
public class Test05 {
	public static void main(String[] args) {
		/*
		  System.out.println("1. 얕은 복사"); // 주소값을 복사해 주는 것
		  int[] arr1 = { 1, 2, 3, 4, 5 }; 
		  int[] arr2 = arr1; // arr2에 arr1의 주소값을 넘겨줌
		   System.out.println(Arrays.toString(arr1));
		  System.out.println(Arrays.toString(arr2)); 
		  arr1[1] = 100;
		  System.out.println(Arrays.toString(arr1));
		  System.out.println(Arrays.toString(arr2));
		  */
		/*
		System.out.println("2. 깊은 복사"); // value를 직접 복사하는 것
		int[] arr1 = { 1, 2, 3, 4, 5 };
		int[] arr2 = new int[arr1.length];

		for (int i = 0; i < arr1.length; i++) {
			arr2[i] = arr1[i];
		}
		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.toString(arr2));
		arr1[1] = 100;
		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.toString(arr2));
		*/
		/*
		System.out.println("3. API를 활용한 복사"); // API도 깊은복사 함
		int[] arr1 = { 1, 2, 3, 4, 5 };
		int[] arr2 = new int[arr1.length];
		System.arraycopy(arr1, 0, arr2, 0, arr1.length);
		//arr1의 index2부터의 값을 arr2의 0번째부터 복사해라. arr.length만큼
		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.toString(arr2));
		arr1[1] = 100;
		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.toString(arr2));
		*/
		/*
		System.out.println("4. API를 활용한 복사"); // API도 깊은복사 함
		int[] arr1 = { 1, 2, 3, 4, 5 };
		int[] arr2 = arr1.clone();//배열 전체 복사
		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.toString(arr2));
		arr1[1] = 100;
		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.toString(arr2));
		*/
		/*
		System.out.println("5. API를 활용한 복사"); // API도 깊은복사 함
		int[] arr1 = { 1, 2, 3, 4, 5 };
		int[] arr2 = Arrays.copyOf(arr1, arr1.length*2); 
		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.toString(arr2));
		arr1[1] = 100;
		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.toString(arr2));
		*/
		System.out.println("6. API를 활용한 복사"); // API도 깊은복사 함
		int[] arr1 = { 1, 2, 3, 4, 5 };
		int[] arr2 = Arrays.copyOfRange(arr1, 1, 4);
		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.toString(arr2));
		arr1[1] = 100;
		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.toString(arr2));
	}
}
