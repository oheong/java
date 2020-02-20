package com.ssafy.java.day02_06io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;

/*
 *  OutputStream(byte), Writer(char)
 *  
 *  OuputStream
 *  write(int i) : 1byte만 처리(하위)
 *  write(byte[]) : byte배열의 모든 내용을 출력
 *  write(byte[], int , int ) : 배열의 일부분을 출력
 *  
 *  Writer
 *  writer(int i) : 1byte만 처리(하위)
 *  writer(char[]) : byte배열의 모든 내용을 출력
 *  writer(char[], int, int) : 배열의 일부분을 출력
 *  write(String)
 */
public class IOTest02 {
	public static void main(String[] args) {
		try {
			// 한글 문제생김,,
			
//			FileOutputStream fos = new FileOutputStream("data/io/iotest02.txt"); // 한글 문제o
			FileWriter fos = new FileWriter("data/io/iotest02.txt",true); // 문자단위 처리 클래스 => 한글 문제x
			// 추가 : 생성자의 두번째 파라미터를 true로 설정
			fos.write(100);
			fos.write('d');
			fos.write(97);
			fos.write('가');
			fos.close();
			System.out.println("파일 출력 성공");
		} 
		
		catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
