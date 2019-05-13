package day03;

import java.util.Scanner;

public class SoalLogic6 {
	protected static Scanner input;

	public static void main(String[] args) {
		input = new Scanner(System.in);
		System.out.println("masukkan N");
		int n = input.nextInt();
		System.out.println("masukkan M");
		int m = input.nextInt();

		// deklarasi deret
		int[] deret = deretAngka(n, m);
		for (int i = 0; i < n; i++) {
			System.out.print(deret[i] + "\t");
		}
		for (int i = 1; i <= m; i++) {
			System.out.println("");
			System.out.println("geser ke" + i);
			// mengambil nilai di deret ke 0 kemudian disimpan ditemp
			int temp = deret[0];
			for (int j = 0; j < n - 1; j++) {
				deret[j] = deret[j + 1];
			}
			// utk menampung nilai yg ada di temp
			deret[n - 1] = temp;
			for (int x = 0; x < n; x++) {
				System.out.print(deret[x] + "\t");
			}
		}

	}

	static int[] deretAngka(int n, int m) {
		int array[] = new int[n];
		int angka = 2;
		for (int b = 0; b < n; b++) {
			array[b] = angka;
			angka = angka + (2 * (b + 1));
		}

		return array;
	}

}
