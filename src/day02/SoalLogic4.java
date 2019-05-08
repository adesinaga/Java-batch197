package day02;

import java.util.Scanner;

public class SoalLogic4 {
	protected static Scanner input;

	public static void main(String[] args) {
		input = new Scanner(System.in);
		System.out.println("Masukkan nilai N1");
		int n1 = input.nextInt();
		System.out.println("Masukkan nilai N2");
		int n2 = input.nextInt();
		int jlh, c = 1;
		int awal = n2;
		int y = 0;
		int j;
		int[] deret = new int[n1];

		// print N1
		for (int a = 0; a < n1; a++) {
			System.out.print(a + "\t");
		}
		System.out.println();

		// buat output deret

		for (int i = 0; i < n1; i++) {
			if (i % 2 == 0) {
				System.out.print(c + "\t");
				c++;
			} else {

				if (c == 2) {

					jlh = (c - 1) * n2;
					deret[i] = jlh;
					System.out.print(jlh + "\t");

				} else {
					jlh = (c - 1) * n2;
					deret[i] = jlh;
					System.out.print(jlh + "\t");
				}
			}
			System.out.println();
			// buat perhitungan dr deret
			for (j = 1; j <= n1; j++) {
				if (j % 2 == 1) {
					System.out.print(deret[j] + " + ");
					y += deret[j];
				}

			}
			// hasil akhir
			System.out.println(" = " + y);

		}
	}
}
