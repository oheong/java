package com.ssafy.java.day02_06io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;

public class IOTest05 {
	public static void main(String[] args) {
		try {
			// 목적 데이터에 직접 접근한 스트림 : 노드스트림
			FileReader fr = new FileReader("src/com/ssafy/java/day02_06io/IOTest04.java");
			FileWriter fw = new FileWriter("data/io/IOTest04Copy.java");
			
			// 필터스트림 : 생성된 스트림에 기능적인 추가 스트림을 활용
			BufferedReader br = new BufferedReader(fr);
			BufferedWriter bw = new BufferedWriter(fw);
			
			PrintWriter pw = new PrintWriter(bw);
			
			int lineNo = 1;
			while (true) {
				String line = br.readLine();
				if (line == null)
					break;
//				bw.write(lineNo++ + " : " + line);
//				bw.newLine();
				pw.println(lineNo++ + " : " + line);
			}
			
//			bw.flush(); // 버퍼의 내용을 내보내줘~
			System.out.println("복사 성공함");
			br.close(); bw.close();
			fr.close(); fw.close();
			// close가 권장사항
		} 
		
		catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
