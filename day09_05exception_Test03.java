package com.ssafy.java.day02_05exception;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/*
 * 직접 처리 방식 이해하기
 * 
 *   try		- 예외가 발생할 수 있는 코드를 묶어준다
 *   catch		- try 블럭에서 예외가 발생했을때 예외처리 구문을 작성한다.
 *   			- 메소드의 파라미터 받는 형식과 동일하게 선언
 *   			- try 블럭에서 예외가 발생했을때만 실행한다.
 *   finally	- 무조건(현빈) 실행
 *   			- 예외의 발생여부와 상관없이 무조건 실행 (IO, NetWork, Database,,등의 메모리 이외의 자원을 연결해서 썼을때)
 *   
 *   사용형태
 *   try 단독사용 불가능
 *   try ~ catch
 *   try ~ finally
 *   try ~ catch ~ finally
 */
public class Test03 {
	public static void main(String[] args) {
//		Unhandled exception type FileNotFoundException
		try {
			System.out.println(1);
			/*
			 * 예외발생시 내부에서 처리하는 일
			 * 
			 *  1. 예외 상황에 맞는 예외 클래스를 찾는다.(JVM)
			 *  2. 해당 예외정보를 설정하 예외클래스 객체를 생성한다.
			 *     new FileNotFoundException("...")
			 *  3. JVM은 생성된 예외객체를 처리할 수 있는 catch block을 찾는다.
			 *  4. catch 블럭으로 생상한 예외객체를 넘긴다.
			 *  
			 *  Object e = new FileNotFoundException(",,,");
			 *  Throwable e = new FileNotFoundException(",,,");
			 *  Exception e = new FileNotFoundException(",,,");
			 *  IOException e = new FileNotFoundException(",,,");
			 *  FileNotFoundException e = new FileNotFoundException(",,,");
			 */
			FileReader fr = new FileReader("a1.txt"); // 예외가 발생할 수 있는 코드
			System.out.println(2);
//		} catch (FileNotFoundException e) {
		} catch (IOException e) {
//		} catch (Exception e) {
//		} catch (Throwable e) {
//			No exception of type Object can be thrown; an exception type must be a subclass of Throwable
//		} catch (Object e) {
			System.out.println("직접 처리 방식 구현");
		}
		System.out.println("정상 종료");
	}
}
