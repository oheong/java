package com.ssafy.java.day02_06io;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

/*
 * 화면에서 ㅁ누자를 입력받아 입력받은 문자를 출ㅕ
 * 단, 문자는 한 문자만 입력ㅂ다는다.
 * 입력받은 문자가 'Q' 또는 'q'일경우
 * 화면에 "종료합니다" 메세지 출력
 * 
 * 실행결과 >
 * 한 문자를 입력하세요 : m
 * 입력된 문자는  m입니다.
 * 
 */
public class IOQuiz01 {
	public static void main(String[] args) {
		InputStreamReader input = new InputStreamReader(System.in);

		while (true) {
			char ch;
			try {
				ch = (char) input.read();
				input.read(); // \r
				input.read(); // \n		
				//☆★ 줄넘김 문자 주의
				if (ch == 'Q' || ch == 'q') {
					System.out.println("종료합니다.");
					break;
				}
				System.out.println(String.format("입력된 문자는 %c입니다.", ch));
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
