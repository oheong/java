package com.ssafy.java.day02_06io;

import java.io.File;

/*
 * IO (입출력)을 다루기 전,, File 자체정보(메타정보)를 활용하는 File클래스 이해하기
 * 메타 : 데이타를 설명하는 데이터
 * File(String)
 * File(File oarent, String)
 * File(String parent, Sring)
 * 
 *  exists() : 파일 객체의 경로가 존재하는지 확인
 *  isDirectory() : 디렉토리인지 판단
 *  isFile() : 파일인지 판단
 *  mkdir() : 경로의 마지막만 생성
 *  midkrs() : 경로 전체 생성
 *  createNewFile() : File 객체의 경로를 생성(파일로 생성)
 *  renameTo() : 이름 변경, 디렉토리까지도 변경
 *  delete() : 삭제
 *  
 */
public class FileTest01 {
	public static void main(String[] args) {
		File f = new File("data/io");
		if (f.exists()) {
			System.out.println("존재하는 경로");

			if (f.isDirectory()) {
				System.out.println("디렉토리 경로임");

				File f2 = new File("a.txt");
				if (f2.exists()) {
					System.out.println("a.txt 파일이 존재");
					if(f2.delete()) System.out.println("a.txt 파일 삭제됨");
					else System.out.println("a.txt 파일 삭제되지 않음");
//					// 파일 이름 변경하기
//					if(f2.renameTo(new File(f,"aaa.txt"))) {
//						System.out.println("aaa.tst로 파일이름 변경됨");
//					}
//					
//					else System.out.println("파일 이름 변경 실패");
				}
				
				else {
					System.out.println("a.txt 파일이 존재하지 않음");

//					Unhandled exception type IOException
					try {
						if (f2.createNewFile())
							System.out.println("파일 생성 성공");
						else
							System.out.println("파일 생성 실패");
					} catch (Exception e) {
						e.printStackTrace();
					}

				}
			}
			if (f.isFile()) {
				System.out.println("파일 경로임");
			}
		}

		else {
			System.out.println("존재하지 않는 경로");

			// 디렉토리 경로 생성
			if (f.mkdirs()) {
				System.out.println("디렉토리 생성 성공");
			} else
				System.out.println("디렉토리 생성 실패");
		}
	}
}
