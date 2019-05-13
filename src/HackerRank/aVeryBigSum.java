package HackerRank;

import java.util.Scanner;

public class aVeryBigSum {

	public static void main(String[] args) {
	

	}
	
	static long aVeryBigSum (long[] ar) {
		int len = ar.length;
		int sum =0;
		for(int i=0; i<len; i++) {
			sum+=ar[i];
		}
		return sum;
	}
	

}
