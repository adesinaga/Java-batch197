package latihan;

import java.util.Scanner;

public class BubbleSort {
	protected static Scanner input;

	public static void main(String[] args) {
		
		input = new Scanner(System.in);
		System.out.println("masukkan angka");
		String n = input.nextLine();
		//split untuk memisahkan semua angka yg bertipe data string
		String[] arrayString = n.split(" ");
		//untuk membuat array
		int[] arrayInput = new int[arrayString.length];
		//kembali mengecek inputan
		for (int i = 0; i < arrayString.length; i++) {
			arrayInput[i] = Integer.parseInt(arrayString[i]);
		}
		bubbleSort(arrayInput);

	}
	//karna mau mencari nilai yang berurutan jadi nilai dibandingkan
	//for berguna untuk membanding kan setiap nilai
    //kemudian if untuk memberi kondisi
	//lalu kemudian ditampikan output
	static void bubbleSort(int[] array) {
		int n = array.length;
		int temp = 0;
		for (int i = 0; i < n; i++) {
			for (int j = 1; j < (n - 1); j++) {
				if (array[j - 1] > array[j]) {
					// swap elemen
					temp = array[j - 1];
					array[j-1] = array[j];
					array[j] = temp;
				}
			}
		}

		// tampilkan output
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
	}
}
