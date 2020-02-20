package com.ssafy.java.day02_05exception;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/*
 * IOExecption (부모)
 * 		|
 * FileNotFoundException (자식)
 * 
 * 다중 catch block을 사용할때 주의점
 *  - 부모타입의 예외가 자식타입의 예외보다 먼저 선언되면 안된다
 *    catch (IOException e) {}				// 잘못된 케이스
 *    catch (FilenotFoundException e){}
 *    
 *    catch (FilenotFoundException e){}		// 올바른 케이스
 *    catch (IOException e) {}				
 */
public class Test04 {
	public static void main(String[] args) {
		try {
			FileReader fr = new FileReader("a1.txt");
			int ch = fr.read();
			System.out.println(ch / 0);
			/**
//			Unhandled exception type IOException
			try {
				int ch = fr.read();
			} catch (IOException e) {
				System.out.println(2); }
			 */
		} catch (FileNotFoundException e) {
			System.out.println(1);
		} catch (IOException e) {
			System.out.println(2);
		} catch (Exception e) { // try 블럭에서 발생할 수 있는 모~든 예외를 처리하자
			System.out.println(3);
		}
	}
}
