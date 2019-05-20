package soalUjian197;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//import java.util.Scanner;
public class SoalNo1 {

	public static void main(String[] args) {
		
		int andi = 20;
		int[] kcmt = { 10, 20, 30 };
		int[] bj = { 10, 20, 30 };
		System.out.println(getMoneySpent(kcmt, bj, andi));

	}

	static int getMoneySpent(int[] kacamata, int[] baju, int uang) {
		int hasil = 0;
		List<Integer> a = new ArrayList<Integer>();
		for (int i = 0; i < kacamata.length; i++) {
			for (int j = 0; j < baju.length; j++) {
				if (kacamata[i] + baju[j] <= uang) {
					a.add(kacamata[i] + baju[j]);
				}
			}
		}
		if (a.size() == 0) {
			System.out.println("uang tidak cukup");
		} else {
			hasil = Collections.max(a);
		}
		return hasil;

	}

}
