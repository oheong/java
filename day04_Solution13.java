package com.ssafy.java.day03.arrayexam;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Solution13 {
	static int[] dy = { -1, -1, 0, 1, 1, 1, 0, -1 };
	static int[] dx = { 0, 1, 1, 1, 0, -1, -1, -1 };
	static int N;

	static int isPark(char[][] map, int y, int x) {
		for (int i = 0; i < 8; i++) {
			if (y + dy[i] < 0 || N <= y + dy[i] || x + dx[i] < 0 || N <= x + dx[i])
				continue;
			if (map[y + dy[i]][x + dx[i]] == 'G')
				return 1;
		}
		return 0;
	}

	static int howManyB(char[][] map, int y, int x) {
		int sum = 1;
		for (int i = y - 1; 0 <= i; i--) {
			if (map[i][x] == 'B')
				sum++;
		}
		for (int i = y + 1; i < N; i++) {
			if (map[i][x] == 'B')
				sum++;
		}
		for (int j = x - 1; 0 <= j; j--) {
			if (map[y][j] == 'B')
				sum++;
		}
		for (int j = x + 1; j < N; j++) {
			if (map[y][j] == 'B')
				sum++;
		}
		return sum;
	}

	public static void main(String[] args) throws FileNotFoundException {
		System.setIn(new FileInputStream("input13.txt"));
		Scanner sc = new Scanner(System.in);

		int TC = sc.nextInt();
		for (int test = 1; test <= TC; test++) {
			N = sc.nextInt();
			int max = 0;
			char[][] map = new char[N][N];
			for (int i = 0; i < N; i++) {
				for (int j = 0; j < N; j++) {
					map[i][j] = sc.next().charAt(0);
				}
			}

			for (int i = 0; i < N; i++) {
				for (int j = 0; j < N; j++) {
					if (map[i][j] == 'B') {
						int temp = 0;
						if (isPark(map, i, j) == 1) // 공원 있음
							temp = 2;
						else
							temp = howManyB(map, i, j);

						if (temp > max)
							max = temp;
					}
				}
			}
			System.out.println(String.format("#%d %d", test, max));
		}
	}
}
