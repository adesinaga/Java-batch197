package day03;

import java.util.Scanner;

public class SoalLogic3 {
	protected static Scanner input;

	public static void main(String[] args) {
		input = new Scanner(System.in);
		System.out.println("Masukkan N");
		int n = input.nextInt();
		System.out.println("Masukkan M");
		int m = input.nextInt();
		System.out.println("Masukkan O");
		int o = input.nextInt();

		// membuat array 2 dimensi
		int[][] arr = new int[n][n];
		int[] array = deretTiga(n * 4, m, o);
		int indeks = 0;
		for (int i = 0; i < n; i++) {
			arr[0][i] = array[indeks];
			indeks++;
		}
		
		for (int i = 1; i < n; i++) {
			arr[i][n-1] = array[indeks];
			indeks++;
		}
		
		for (int i = n-2; i >=0; i--) {
			arr[6][i] = array[indeks];
			indeks++;
		}
		
		for (int i = n-2; i>0; i--) {
			arr[i][0] = array[indeks];
			indeks++;
		}
		
		// cetak array
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + "\t");
			}

			System.out.println("\n");

		}
	}

	static int[] deretTiga(int n, int m, int o) {
		int arr[] = new int[n];
		// arr[0] = o;
		int angka = o;
		
		for (int i = 0; i < n; i++) {
			if (i % (m + 1) == m) {
				arr[i] = m;
			} else {
				arr[i] = angka;
				angka += m;
			}
		}
		return arr;
	}

}
