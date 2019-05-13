package day04;

import java.util.Scanner;


public class panggilOrang {
	public static int n;
	protected static Scanner input;

	public static void main(String[] args) {
		input = new Scanner(System.in);
		System.out.println("masukkan banyak data");
		int bykData = input.nextInt();
		n = bykData;
		
		

		Orang objek = new Orang();
		objek.cetakData();

		for (int i = 0; i < n; i++) {

			System.out.print("Masukkan ID :");
			objek.arrayId[i] = input.nextInt();
			System.out.print("Masukkan Nama :");
			objek.arrayNama[i] = input.next();
			System.out.print("Masukkan alamat :");
			objek.arrayAlamat[i] = input.next();
			System.out.print("Masukkan jenis kelamin :");
			objek.arrayJK[i] = input.next();
			System.out.print("Masukkan NO telp :");
			objek.arrayNotelp[i] = input.next();

		}
		for (int j = 0; j < n; j++) {
			System.out.println(objek.arrayId[j] +" " + "ID");
			System.out.println(objek.arrayNama[j] +" " + "2Nama");
			System.out.println(objek.arrayAlamat[j] + " " + "Alamat");
			System.out.println(objek.arrayJK[j] + " " + "Jenis Kelamin");
			System.out.println(objek.arrayNotelp[j] + " " + "No telp");

		}
		
	}
}
