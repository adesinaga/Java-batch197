package day01;

import java.util.Scanner;

public class SoalLogic10 {
	protected static Scanner input;

	public static void main(String[] args) {
		input = new Scanner(System.in);
		System.out.println("Input Your Number");
		int n = Integer.parseInt(input.nextLine());
		int number = 3;
		for (int i = 1; i <= n; i++) {
			if (i % 4 == 0) {
				System.out.print("xxx" + "\t");
			} else {
				System.out.print(number + "\t");

			}
			number = number * 3;
		}
	}
}
