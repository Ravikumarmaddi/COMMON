package com.demo.mathematics;
public class MatrixDemo {
	public static void main(String[] args) {
		int[][] a = { { 0, 0, 0 }, { 0, 1, 0 }, { 1, 0, 0 }, { 0, 1, 0 },
				{ 0, 0, 0 } };
		int[][] b = { { 0, 0, 0 }, { 0, 0, 0 }, { 0, 0, 0 }, { 0, 0, 0 },
				{ 0, 0, 0 } };
		;
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 3; j++) {
				if (a[i][j] == 1) {
					b = makeOnes(b, i, j);
				}
			}
		}
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println();
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(b[i][j] + " ");
			}
			System.out.println();
		}

	}

	private static int[][] makeOnes(int[][] a, int i, int j) {
		for (int i2 = 0; i2 < 5; i2++) {
			for (int j2 = 0; j2 < 3; j2++) {
				if (i2 == i || j2 == j)
					a[i2][j2] = 1;
			}
		}
		return a;
	}
}
