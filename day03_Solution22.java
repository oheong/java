package com.ssafy.java.day03.arrayexam;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Solution22 {
	static int N, S;
	static int[][] map;
	static int[][] sogum;
	static int[] dy = { 0, -1, 1, 0, 0 };
	static int[] dx = { 0, 0, 0, -1, 1 };

	static void move(int how_many, int y, int x, int dir) {
		for (int i = 3; 0 < i; i--) {
			for (int count = 0; count < i; count++) {
				y += dy[dir];
				x += dx[dir];
				if (y < 0 || N <= y || x < 0 || N <= x) {
					sogum[how_many][3] = 1;// 소금쟁이 죽었음
					return;
				}
			}
		}
		if (map[y][x] == 0)
			map[y][x] = how_many;
		else
			sogum[how_many][3] = 1;// 다른 소금쟁이가 이미 있어서 소금쟁이 죽었음
	}

	static int init() {
		int sum = 0;
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				if (map[i][j] != 0) {
					sum++;
					map[i][j] = 0;
				}
			}
		}
		return sum;
	}

	public static void main(String[] args) throws FileNotFoundException {
		System.setIn(new FileInputStream("hw.txt"));
		Scanner sc = new Scanner(System.in);

		int TC = sc.nextInt();
		for (int test = 1; test <= TC; test++) {
			N = sc.nextInt();
			S = sc.nextInt();
			map = new int[N][N];
			sogum = new int[S + 1][4];
			for (int i = 1; i <= S; i++) {
				sogum[i][0] = sc.nextInt(); // 행
				sogum[i][1] = sc.nextInt(); // 열
				sogum[i][2] = sc.nextInt(); // dir
				sogum[i][3] = 0;// 소금쟁이 모두 살아있는것으로 초기화
			}
			// sogum[i][4] => 소금쟁이 생사 유무
			// 0 살아있음 1 디쟛슴

			for (int i = 1; i <= S; i++) 
				move(i, sogum[i][0], sogum[i][1], sogum[i][2]);
			
			System.out.println(String.format("#%d %d", test, init()));
		}
	}
}
