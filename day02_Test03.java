package com.ssafy.java.day02.array;

import java.util.Arrays;

/*
* 배열의 값의 초기화 방식
*/
public class Test03 {
	
	public static void print(int[] array)
	{
		System.out.println(Arrays.toString(array));
	}
	
	
	
	public static void main(String[] args) {
		
		
		
//		1. 객체의 메모리 생성 후 값을 별도로 초기화
		int[] array = new int[3];
		array[0] = 100;
		array[2] = 200;
//		2. 생성과 동시에 배열 초기화
		int[] array2 = {100, 200, 300};
		
//		선언과 동시에 사용가능
//		array2 = {400,500,600};
		
//		3. 1 + 2
		int[] array3 = new int[] {100, 200, 300};
		array3 = new int[] {400,500,600};
		
		
		print(new int[] {1, 2, 3});
		
//		값을 한 번만 쓸 때는 변수 만드는것보다 그자리에서 직접 쓰는게 편함

	}

}
