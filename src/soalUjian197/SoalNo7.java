package soalUjian197;

import java.util.Scanner;

public class SoalNo7 {
	public static Scanner input;

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Input kalimat");
		String kalimat = scanner.nextLine();
		String[] tempArray;// variable untuk menampung hasil string yg dipisah
		String delimiter = ""; // sebagai pemisah string
		tempArray = kalimat.split(delimiter);// proses pemisahan
		int n = tempArray.length;
		// i-- agar huruf pertama berawal dari bawah
		for (int i = (n-1); i >=0; i--) {
			//untuk menampilkan angka dan bintang
			for (int a = 0; a < n ; a++) {
				System.out.print("");
			}
			System.out.print(tempArray[i]);
			for (int a = 0; a < (n/2) ; a++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
