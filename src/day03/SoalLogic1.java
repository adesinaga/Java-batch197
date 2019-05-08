package day03;

import java.util.Scanner;

public class SoalLogic1 {

	protected static Scanner input;

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Input N : ");
		int n = input.nextInt();
		int arr[][] = new int[n][n];
		int[] deret = new int[n];
		int awal = 1;
		// Mencari deret 1
		//looping karna selisih deret terus bertambah, tidak tetap. 
		//jadi diperlukan adanya variable yang dilooping agar nilai selisih terus bertambah(a++).
		for (int a = 0; a < deret.length; a++) {
			//supaya deret pertamanya bernilai '1'
			deret[a] = awal;
			//rumus agar penjumlahan setiap diagonalnya ditambah selisih yg terus bertambah
			awal = awal + (a + 2);
		}
		// mencari deret 2
		int[] deret2 = new int[n];
		int awal2 = 2;
		//looping karna selisih deret terus bertambah, tidak tetap. 
		//jadi diperlukan adanya variable yang dilooping agar nilai selisih terus bertambah.
		for (int b = 0; b < deret2.length; b++) {
			//supaya deret pertama bernilai '2'
			deret2[b] = awal2;
			//rumus agar penjumlahan setiap diagonalnya ditambah selisih yg terus bertambah
			awal2 = awal2 + (2 * (b + 1));
		}
//looping untuk menampilkan diagonal dengan index baris dan kolom
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				// diagonal dr kanan ke bawah \
				// jika nilai baris(i) = nilai kolom(j)
				if (i == j)
					//misal array[1][1] = deret ke 1 yaitu "3", bgitu strusnya
					arr[i][j] = deret[i];
	//untuk mendapatkan diagonal dari kiri ke atas 
	//kalau misal input N nya 7 maka baris dan kolom yg semua hasilnya i + j =6 = n-1 (7-1 =6), bgtu sterusnya
				else if (i + j == n - 1) // diagonal kiri atas/
					//misal array i=1, j=5, maka nilainya "4", kemudian cetak 4, dst
					arr[i][j] = deret2[j];
				//menampilkan semua nilai dari array
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println();
		}

	}
}
