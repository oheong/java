package com.ssafy.java.day02.array;

import java.util.Arrays;

//�迭�� ���� ����� ���� ����
public class Test05 {
	public static void main(String[] args) {
		/*
		  System.out.println("1. ���� ����"); // �ּҰ��� ������ �ִ� ��
		  int[] arr1 = { 1, 2, 3, 4, 5 }; 
		  int[] arr2 = arr1; // arr2�� arr1�� �ּҰ��� �Ѱ���
		   System.out.println(Arrays.toString(arr1));
		  System.out.println(Arrays.toString(arr2)); 
		  arr1[1] = 100;
		  System.out.println(Arrays.toString(arr1));
		  System.out.println(Arrays.toString(arr2));
		  */
		/*
		System.out.println("2. ���� ����"); // value�� ���� �����ϴ� ��
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
		System.out.println("3. API�� Ȱ���� ����"); // API�� �������� ��
		int[] arr1 = { 1, 2, 3, 4, 5 };
		int[] arr2 = new int[arr1.length];
		System.arraycopy(arr1, 0, arr2, 0, arr1.length);
		//arr1�� index2������ ���� arr2�� 0��°���� �����ض�. arr.length��ŭ
		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.toString(arr2));
		arr1[1] = 100;
		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.toString(arr2));
		*/
		/*
		System.out.println("4. API�� Ȱ���� ����"); // API�� �������� ��
		int[] arr1 = { 1, 2, 3, 4, 5 };
		int[] arr2 = arr1.clone();//�迭 ��ü ����
		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.toString(arr2));
		arr1[1] = 100;
		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.toString(arr2));
		*/
		/*
		System.out.println("5. API�� Ȱ���� ����"); // API�� �������� ��
		int[] arr1 = { 1, 2, 3, 4, 5 };
		int[] arr2 = Arrays.copyOf(arr1, arr1.length*2); 
		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.toString(arr2));
		arr1[1] = 100;
		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.toString(arr2));
		*/
		System.out.println("6. API�� Ȱ���� ����"); // API�� �������� ��
		int[] arr1 = { 1, 2, 3, 4, 5 };
		int[] arr2 = Arrays.copyOfRange(arr1, 1, 4);
		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.toString(arr2));
		arr1[1] = 100;
		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.toString(arr2));
	}
}
