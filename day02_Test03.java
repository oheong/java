package com.ssafy.java.day02.array;

import java.util.Arrays;

/*
* �迭�� ���� �ʱ�ȭ ���
*/
public class Test03 {
	
	public static void print(int[] array)
	{
		System.out.println(Arrays.toString(array));
	}
	
	
	
	public static void main(String[] args) {
		
		
		
//		1. ��ü�� �޸� ���� �� ���� ������ �ʱ�ȭ
		int[] array = new int[3];
		array[0] = 100;
		array[2] = 200;
//		2. ������ ���ÿ� �迭 �ʱ�ȭ
		int[] array2 = {100, 200, 300};
		
//		����� ���ÿ� ��밡��
//		array2 = {400,500,600};
		
//		3. 1 + 2
		int[] array3 = new int[] {100, 200, 300};
		array3 = new int[] {400,500,600};
		
		
		print(new int[] {1, 2, 3});
		
//		���� �� ���� �� ���� ���� ����°ͺ��� ���ڸ����� ���� ���°� ����

	}

}
