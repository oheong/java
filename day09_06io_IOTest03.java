package com.ssafy.java.day02_06io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;

/*
 *  InputStream, Reader
 *  
 *  InputStream
 *  int read() : 1바이트를 읽고 읽은 바이트의 아스키코드 반환, 파일의 끝을 나타내는 값(-1)
 *  int read(byte[]) : 파라미터에 입력된 바이트 배열에 데이터를 읽는다. 반환값은 배열에 읽어들인 바이트의 수
 *  
 *  Reader
 *  int read() : 2바이트를 읽고 읽은 바이트의 아스키코드 반환, 파일의 끝을 나타내는 값(-1)
 *  int read(byte[]) : 파라미터에 입력된 바이트 배열에 데이터를 읽는다. 반환값은 배열에 읽어들인 바이트의 수
 *  
 */
public class IOTest03 {
	public static void main(String[] args) {
		try {
//			FileInputStream fis = new FileInputStream("data/io/iotest03.txt");
			FileReader fis = new FileReader("data/io/iotest03.txt");
			while (true) {
				int ch = fis.read();
				if (ch == -1)
					break;
				System.out.print((char) ch);
			}
			fis.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
