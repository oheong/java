package com.ssafy.java.day06.ws;

import java.util.Scanner;

public class MovieTest {
	static Scanner sc = new Scanner(System.in);
	static MovieMgr mm = new MovieMgr();

	public static void main(String[] args) {
		System.out.println("<<영화 관리 프로그램>>");
		while (true) {
			switch (menu()) {
			case 1:
				beforeAdd();
				break;
			case 2:
				showAll();
				break;
			case 3:
				beforeSearchTitle();
				break;
			case 4:
				beforeSearchGenre();
				break;
			case 5:
				beforeDeleteTitle();
				break;
			case 0:
				System.exit(0);
			}
		}
	}

	static void showAll() {
		Movie[] m = mm.search();
		for (int i = 0; i < m.length; i++) {
			System.out.println(m[i].toString());
		}
	}

	static void beforeDeleteTitle() {
		System.out.print("삭제하고 싶은 장르 : ");
		String title = sc.nextLine();
		mm.delete(title);
	}

	static void beforeSearchGenre() {
		System.out.print("찾고싶은 장르 : ");
		String gener = sc.nextLine();
		Movie[] m = mm.searchGenre(gener);
		for (int i = 0; i < m.length; i++) {
			System.out.println(m[i].toString());
		}
	}

	static void beforeSearchTitle() {
		System.out.print("찾고싶은 제목 : ");
		String title = sc.nextLine();
		Movie[] m = mm.search(title);
		for (int i = 0; i < m.length; i++) {
			System.out.println(m[i].toString());
		}
	}

	static void beforeAdd() {
		System.out.print("제목 : ");
		String title = sc.nextLine();
		System.out.print("감독 : ");
		String director = sc.nextLine();
		System.out.print("평점 : ");
		int grade = Integer.parseInt(sc.nextLine());
		System.out.print("장르 : ");
		String genre = sc.nextLine();
		System.out.print("한줄평 : ");
		String summary = sc.nextLine();

		Movie m = new Movie();
		m.setTitle(title);
		m.setDirector(director);
		m.setGrade(grade);
		m.setGenre(genre);
		m.setSummary(summary);

		mm.add(m);
	}

	private static int menu() {
		System.out.println("=================================");
		System.out.println("1. 영화 정보 입력");
		System.out.println("2. 영화 정보 전체 검색");
		System.out.println("3. 영화명 검색");
		System.out.println("4. 영화 장르별 검색");
		System.out.println("5. 영화 정보 삭제");
		System.out.println("0. 종료");
		System.out.println("=================================");
		System.out.print("원하는 번호를 선택하세요. ");
		return Integer.parseInt(sc.nextLine());
	}
}
