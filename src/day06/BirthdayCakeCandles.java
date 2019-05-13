package day06;

public class BirthdayCakeCandles {
	public static void main(String[] args) {
		int case1 = birthdayCakeCandles(new int[] {4,3,4,1});
		System.out.println(case1);
		int case2 = birthdayCakeCandles(new int[] {8,3,1,1});
		System.out.println(case2);
		int case3 = birthdayCakeCandles(new int[] {4,9,2,1});
		System.out.println(case3);
	}

	static int birthdayCakeCandles(int[] ar) {
		int hasil = 1;
		int max = ar[0];
		for (int i = 1; i < ar.length; i++) {

			if (ar[i] == max) {
				hasil++;
			}
			if (ar[i] > max) {
				max = ar[i];
				hasil = 1;
			}

		}
		return hasil;
	}
}
