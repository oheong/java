package com.ssafy.java.day03.arrayexam;

import java.io.FileInputStream;
import java.util.Scanner;

public class Test01 {
	static int T, N;
	static int Answer;
	static int[] dy = { -1, 0, 1, 0 };
	static int[] dx = { 0, 1, 0, -1 };

	static void move(char[][] map, int dir, int y, int x) {
		if (y < 0 || N <= y || x < 0 || N <= x) return;

		while (true) {
			if (map[y][x] == 'S') {// ¿ä±â¶û
				Answer++;
				y += dy[dir];
				x += dx[dir];
				if (y < 0 || N <= y || x < 0 || N <= x) return;
			} else
				break;
		}
	}

	public static void main(String[] args) throws Exception {
		System.setIn(new FileInputStream("test01.txt"));
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int t = 1; t <= T; t++) {
			N = sc.nextInt();
			char[][] map = new char[N][N];
			for (int i = 0; i < N; i++) {
				for (int j = 0; j < N; j++) {
					map[i][j] = sc.next().charAt(0);
				}
			}

			for (int i = 0; i < N; i++) {
				for (int j = 0; j < N; j++) {
					if (map[i][j] == 'A') 
						move(map, 1, i, j + 1);

					else if (map[i][j] == 'B') {
						move(map, 1, i, j + 1);
						move(map, 3, i, j - 1);
					}

					else if (map[i][j] == 'C') {
						move(map, 0, i - 1, j);
						move(map, 1, i, j + 1); 
						move(map, 2, i + 1, j);
						move(map, 3, i, j - 1);
					}
				}
			}

			System.out.println("#" + t + " " + Answer);
			Answer = 0;
		}
	}
}