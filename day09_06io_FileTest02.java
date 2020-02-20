package com.ssafy.java.day02_06io;

import java.io.File;

public class FileTest02 {
	public static void main(String[] args) {
		File f = new File("src/com/ssafy/java/day02_06io/FileTest01.java");
		System.out.println(f.length() + "byte"); 
		System.out.println(f.getName());// 파일명
		System.out.println(f.getParent());// 부모 디렉토리 경로
		System.out.println(f.getPath());// 전체 경로
	
	}
}
