package com.ssafy.java.day02_06io;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

/*
 * IO 클래스
 * ------------------------------------------------------
 *  입력 : 프로그램 메모리로 들어오는 작업
 *  출력 : 프로그램 내보내는 작업
 *  
 *  입출력 클래스
 *  
 *  내부 데이터 단위에 따른 구분
 *   - byte : 직접 해석이 불가능(툴의 도움이 필요한 것) ex) 이미지, word, mp3
 *   - char : 우리가 눈으로 보고 해석 가능 (메모장) ex) .java
 *   
 *  		추상개념의 클래스
 *  		입력					출력
 *  byte	InputStream			OutputStream
 *  char	Reader				Writer
 *  
 *   -- 파일을 처리하기 위한
 *   FileInputStream, FileOutputStream
 *   FileReader,	  FileWriter
 *   
 *    -- 속도를 올리기 위한 처리
 *   BufferedInputStream, BufferedOutputStream
 *   BufferedReader,	  BufferedWriter
 *   
 *    -- 메모리에 생성된 객체의 입출력을 처리한다.
 *   ObjectInputStream, ObjectOutputStream
 *   
 *    -- 기본 데이터 타입의 입출력을 처리
 *   DataInputStream, DataOutputStream
 *   
 *    -- 바이트를 문자 단위로 변환
 *   InputStreamReader, OutputStreamWriter
 * ------------------------------------------------------
 */
public class IOTest01 {
	public static void main(String[] args) {
		InputStream in = System.in;
		InputStreamReader isr = new InputStreamReader(in);
		try {
			System.out.println((int) '\r');
			System.out.println((int) '\n');
			while (true) {
				int ch = isr.read();
				System.out.print((char)ch);
			}
		}

		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
