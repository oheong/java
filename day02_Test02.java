package com.ssafy.java.day02.array;
// 배열은 생성되는 순간 값의 초기화가 발생
public class Test02 {
	
	public static void main(String[] args)
	{
//		int[] array = new int[3];
//		long[] array = new long[3];
//		double[] array = new double[3];
		System.out.print("-");
//		char[] array = new char[3];
		boolean[] array = new boolean[3];
		
		
		for (int i=0; i< array.length; i++)
		{
			System.out.print(array[i]);
		}
		System.out.println("-");
	}

}
