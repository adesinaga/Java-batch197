package day03;

import java.util.Scanner;

public class SoalLogic2 {
	protected static Scanner input;

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Masukkan nilai N");
		int n = input.nextInt();
		int arr[][] = new int[n][n];
		int[] deret = new int[n];
		int awal = 2;
       
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (i == j) {
					arr[i][j] = deret[i];

				}

				else if (i + j == n - 1) {

					arr[i][j] = deret[j];
				}
				// menampilkan semua nilai dari array
				System.out.print(arr[i][j] + "\t");
			}

		}
	}
}
