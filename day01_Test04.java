package com.ssafy.java.day01.basic;

public class Test04 {

	public static void main(String[] args) {
		System.out.println('a'-32);
		System.out.println((char)('a'-32));
		System.out.println('a'-'A');
		
		for(char c = 'A'; c <= 'Z'; c++)
		{
			System.out.println(c+" "+(char)(c + 32));
		}
			
		System.out.println(5L/2F);

	}

}
