package com.ssafy.java.day03.arrayexam;

import java.io.FileInputStream;
import java.util.Scanner;

public class Test02 {
	static long Answer;
	static int N, S;

	static int[] dy = { 0, 1, 0 };
	static int[] dx = { 0, 0, 1 };

	static void move(int[][] map, int me, int y, int x, int dir) {
		map[y][x] = me;
		for (int i = 3; 0 < i; i--) {
			for (int count = 0; count < i; count++) {
				y += dy[dir];
				x += dx[dir];
				if (y < 0 || N <= y || x < 0 || N <= x)
					return;
			}
			if (map[y][x] != 0) {
				Answer = me;
				return;
			}
			map[y][x] = me;
		}
	}

	public static void main(String[] args) throws Exception {
		System.setIn(new FileInputStream("test02.txt"));
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();// 테스트 케이스 수

		for (int t = 1; t <= T; t++) {
			N = sc.nextInt(); // 배열의 크기 NxN
			int[][] lake = new int[N][N];

			S = sc.nextInt();// 소금쟁이(Strider)수
			int[][] strider = new int[S][3];
			for (int k = 0; k < S; k++) {
				strider[k][0] = sc.nextInt();// 행위치
				strider[k][1] = sc.nextInt();// 열위치
				strider[k][2] = sc.nextInt();// 방향(1:하,2:우)
			}

			for (int i = 0; i < S; i++)
				move(lake, i + 1, strider[i][0], strider[i][1], strider[i][2]);

			System.out.println("#" + t + " " + Answer);
			Answer = 0;
		}
	}
}
