package day03;

import java.util.Scanner;

public class SoalLogic2 {
	protected static Scanner input;
    
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Masukkan nilai N");
		int n = input.nextInt();
		System.out.println("Masukkan nilai M");
		int m = input.nextInt();
		System.out.println("masukkan nilai O");
		int o = input.nextInt();
		int array[][] = new int[n][n];
		
		// deklarasi deret 
		int[] deret = deretNo2(n * 4, m, o);
		int indeks = 0;

		//
		for (int i = 0; i < n; i++) {
			array[n-1-i][i] = deret[indeks];
			indeks++;
		}
		// memberikan input pd matriks arr baris terakhir kolom ke i
		/* for (int i = n - 2; i >= 0; i++) {
			arr[n - 1][i] = array[indeks + n];
			indeks++;
		} */
		
		for (int i = 1; i < n; i++) {
			array [i][n-1] = deret[indeks];
			indeks++;
		}
		 
		for (int i = n-2; i >0 ; i--) {
			array [n-1][i] = deret[indeks];
			indeks++;
		} 
		 
		
		
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length; j++) {
				System.out.print(array[i][j] + "\t");
				
			}
			System.out.println("\n");
		}

		
	}

	static int[] deretNo2(int n, int m, int o) {
		// buat array
		int[] arr = new int[n];
		int angka = o;
		int temp = m;

		for (int i = 0; i < n; i++) {
			if (i % (m + 1) == m) {
				arr[i] = temp;
				temp = temp * m;

			} else {
				arr[i] = angka;
				angka += m;
			}

		}
		return arr;
	}

}
