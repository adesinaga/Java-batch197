package latihan;

import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class mencariNilai {
	protected static Scanner input;

	public static void main(String[] args) {

		input = new Scanner(System.in);
		System.out.println("masukkan angka");
		String n = input.nextLine();
		String[] arrayString = n.split(" ");
		int[] arrayInput = new int[arrayString.length];

		for (int i = 0; i < arrayString.length; i++) {
			arrayInput[i] = Integer.parseInt(arrayString[i]);
		}
		statistik(arrayInput);
		median(arrayInput);
		mean(arrayInput);

	}

	public static void statistik(int[] array) {
		HashMap<Integer, Integer> data = new HashMap<Integer, Integer>();
		Arrays.sort(array);
		// looping sebanyak panjang array
		for (int i = 0; i < array.length; i++) {
			// .constainKey berfungsi sbg pembanding
			// apakah ada nilai array ke-i
			// dibagian key pada Map
			// bernilai TRUE apabila nilai tsb sudah di inisialisasi
			if (data.containsKey(array[i])) {
				// .get will return value to which the specified key is mapped
				// yang mana value ini adalah jumlah kemunculan
				int value = data.get(array[i]);
				value++;
				// update jumlah kemunculan nilai
				data.put(array[i], value);

			} else {
				// berikan key-dataInput dengan nilai array ke-i
				// berikan value-dataInput dengan nilai inisialisasi jumlah kemunculan yaitu

				data.put(array[i], 1);
			}
		}

		int key = Collections.max(data.entrySet(), Map.Entry.comparingByValue()).getKey();
		int value = Collections.max(data.values());
		System.out.println("\nmodus :" + key + " " + "\nvalue : " + value);

	}

	public static void median(int[] array) {
		Arrays.sort(array);
		float med = 0;
		
		if(array.length % 2 == 0) {
		med = (float) (array[(array.length-1)/2] + array[((array.length-1)/2)+1])/2;
		
		} else {
			med = (float) (array[array.length / 2]);
		
		}
		System.out.println("Median : " + med);
	}
	
	public static void mean(int[]array) {
		double sum=0;
		double mean=0;
		for(int i=0; i<array.length; i++) {
			sum += array[i];
		}
		mean = (double)(sum/array.length);
		System.out.println("Mean : " + mean);
	}
	
	public static int[] sorting (int[] array) {
		return array;
	}

}
