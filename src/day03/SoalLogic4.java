package day03;

import java.util.Scanner;

public class SoalLogic4 {
	protected static Scanner input;

	public static void main(String[] args) {
		input = new Scanner(System.in);
		System.out.println("masukkan N");
		int n = input.nextInt();
		System.out.println("masukkan m");
		int m = input.nextInt();

		// deklarasi deret
		int[] deret = deretAngka(n, m);
		for (int i = 0; i < n; i++) {
			System.out.print(deret[i] + "\t");
		}
		for (int i = 1; i <= m; i++) {
			System.out.println("");
			System.out.println("geser ke" + i);
			int temp = deret[n - 1];
			for (int j = n-1; j > 0; j--) {
				deret[j] = deret[j - 1];
			}
			
			// nilai akhir dimasukkan ke deret pertama lagi
			deret[0] = temp;
			for (int x = 0; x < n; x++) {
				System.out.print(deret[x] + "\t");
			}

		}
	}

	static int[] deretAngka(int n, int m) {
		int hasil[] = new int[n];
		int angka = 1;
		for (int i = 0; i < n; i++) {
			hasil[i] = angka;
			angka = angka + m;
		}
		return hasil;
	}
}
