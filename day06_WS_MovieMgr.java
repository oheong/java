package com.ssafy.java.day06.ws;

import java.util.Scanner;

public class MovieMgr {
	private Movie[] movies = new Movie[100];
	private int index;

	public void add(Movie m) {
		// 파라미터로 전달된 영화정보를 전달받아 배열에 저장
		movies[index++] = m;
	}

	public Movie[] search() {
		// 배열에 저장된 모든 영화정보를 리턴
		Movie[] temp = new Movie[index];
		int tempNum = 0;
		for (int i = 0; i < index; i++) {
			temp[tempNum++] = movies[i];
		}
		Movie[] ans = new Movie[tempNum];
		System.arraycopy(temp, 0, ans, 0, tempNum);
		return ans;
	}

	public Movie[] search(String title) {
		// 전달된 타이틀을 포함하고 있는 모든 영화 정보를 검색하여 리턴
		Movie[] temp = new Movie[index];
		int tempNum = 0;
		for (int i = 0; i < index; i++) {
			if (movies[i].getTitle().contains(title)) {
				temp[tempNum++] = movies[i];
			}
		}
		Movie[] ans = new Movie[tempNum];
		System.arraycopy(temp, 0, ans, 0, tempNum);
		return ans;
	}

	public Movie[] searchDirector(String name) {
		// 전달된 감독명의 모든 영화 정보를 검색하여 리턴
		Movie[] temp = new Movie[index];
		int tempNum = 0;
		for (int i = 0; i < index; i++) {
			if (movies[i].getTitle().equals(name)) {
				temp[tempNum++] = movies[i];
			}
		}
		Movie[] ans = new Movie[tempNum];
		System.arraycopy(temp, 0, ans, 0, tempNum);
		return ans;
	}

	public Movie[] searchGenre(String gener) {
		// 장르의 모든 영화 정보를 검색하여 리턴
		Movie[] temp = new Movie[index];
		int tempNum = 0;
		for (int i = 0; i < index; i++) {
			if (movies[i].getTitle().equals(gener)) {
				temp[tempNum++] = movies[i];
			}
		}
		Movie[] ans = new Movie[tempNum];
		System.arraycopy(temp, 0, ans, 0, tempNum);
		return ans;
	}

	public void delete(String title) {
		// 전달된 제목의 영화 삭제
		Movie[] temp = new Movie[index];
		for (int i = 0; i < index; i++) {
			if (movies[i].getTitle().equals(title)) {
				System.arraycopy(movies, i + 1, temp, 0, index - i - 1);
				System.arraycopy(temp, 0, movies, i, index - i - 1);
				index--;
				return;
			}
		}

	}

	public int getSize() {
		return index;
	}

}