package day02;

import java.util.Scanner;

public class SoalLogic5 {
	protected static Scanner input;

	public static void main(String[] args) {
		input = new Scanner(System.in);
		System.out.println("Masukkan kalimat");
		String kalimat = input.nextLine();
		StringBuilder ubahkalimat = new StringBuilder();

		for (String word : kalimat.split(" ")) {
			ubahkalimat.append(replaceAll(word, '*'));
			ubahkalimat.append(" ");

		}
		System.out.println(ubahkalimat);

	}

	public static String replaceAll(String word, char replacer) {
		StringBuilder ret = new StringBuilder();
		// karena huruf diganti hanya bila kata lebih dari dari 2
		if (word.length() > 2) {
			// huruf pertama tetap
			ret.append(word).charAt(0);
			// ganti isi kata
			for (int i = 1; i < word.length() - 1; i++) {
				ret.append(replacer);
			}

			// huruf terakhir kata tetap
			ret.append(word.charAt(word.length() - 1));
			return ret.toString();
		}

		return word;
	}
}
