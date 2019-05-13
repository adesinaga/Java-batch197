package day02;
import java.util.Scanner;
public class SoalLogic6 {
	protected static Scanner input;
	public static void main(String[] args) {
		System.out.println("Masukkan kalimat : ");
		input = new Scanner(System.in);
		String kalimat = input.nextLine();
		int a = kalimat.length();
		int b=0;

		for (int i = 0; i < a; i++) {
			if (Character.isUpperCase(kalimat.charAt(i))) {
				b++;
			}
		}
		System.out.println(kalimat);
		System.out.println("Jumlah huruf besar : " + b);
	}

}
