package day02;

import java.util.Scanner;

public class ngulangLogic3ke1 {

	protected static Scanner input;

	public static void main(String[] args) {
		input = new Scanner(System.in);
		System.out.println("Masukkan nilai N1");
		int n1 = input.nextInt();
		System.out.println("Masukkan nilai N2");
		int n2 = input.nextInt();
		System.out.println("Masukkan nilai N3");
		int n3 = input.nextInt();
		int i;
		int awal=n2;
		int tengah = n1/2;
		
		int [] deret = new int[n1];
		
		for(i = 0; i < n1; i++) {
			deret[i]=awal;
			if(i< n1/2) {
				awal = awal *n3;
			}
			else {
				awal=awal /n3;
			}
			System.out.print(deret[i] + "\t");
		}
		
		System.out.println();
		System.out.print("perhitungan" + " " + deret[tengah] );
		int hasil = deret[tengah];
		
	for (int a = tengah + 1 ; a < tengah+3; a++) {
		hasil = hasil-deret[a];
		System.out.print("-" + deret[a]);
		
	} 
	
	System.out.print(" = " + hasil);
	{
		
	}
		
	}

}
