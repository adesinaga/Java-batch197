package soalUjian197;
import java.util.Scanner;
import java.util.Arrays;

public class SoalNo6 {

	public static void main(String[] args) {
		// 1 2 4 7 8 6 9
		int[] arrayInput = new int[] {1,2,3,10,20};
		Arrays.sort(arrayInput);
		for (int i = 0; i < arrayInput.length; i++) {
			System.out.print(arrayInput[i] + " ");
		}
		
		miniMaxSum(arrayInput);
	}
	
	
	static void miniMaxSum(int[] arr) {
		long SumMin=0;
		long SumMax=0;
		int n = 4;
		for (int j = 0; j < n; j++) {
			SumMin += arr[j];
			SumMax += arr[arr.length-1-j];
		}
		System.out.println("\nNilai Min :" +SumMin );
		System.out.println("Nilai Max :" +SumMax );
    }
}
