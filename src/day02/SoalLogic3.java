package day02;

// import untuk memasukkan nilai
import java.util.Scanner;

public class SoalLogic3 {
	protected static Scanner input;

	public static void main(String[] args) {
		// perintah untuk memasukkan nilai
		input = new Scanner(System.in);
		// deklarasi i tipe data integer
		int i;
		// menampilkan output "masukkan N1"
		System.out.println("masukkan nilai N1 :");
		// perintah untuk memasukkan nilai ke dalam variable n1
		int n1 = input.nextInt();
		System.out.println("masukkan nilai N2 :");
		int n2 = input.nextInt();
		System.out.println("masukkan nilai N3 : ");
		int n3 = input.nextInt();
		int awal = n2;
		int tengah = n1 / 2;
		// membuat deret baru yang nilainya diambil dari n1
		int[] deret = new int[n1];
		//perulangan nilai i untuk dpt membantu membuat deret
		for (i = 0; i < n1; i++) {
			//agar deret pertama sesuai dgn nilai awal atau nilai masukan n2
			deret[i] = awal;
			//kondisi untuk memisahkan deret ketiga kekanan dan ketiga kekiri karna keduanya berbeda ada yg dikali dan dibagi
			if (i < n1 / 2) {
				awal = awal * n3;
				//kondisi dimana jika nilai n1 ke kiri tidak dieksekusi, maka dieksekusi else dibawah
			} else {
				awal = awal / n3;
			}
			//untuk menampilkan isi dari deret i
			System.out.print(deret[i] + "\t");

		}
		System.out.println();
		//untuk menampilkan isi dari deret tengah kekiri
		System.out.print("perhitungan : " + deret[tengah]);
		int hasil = deret[tengah];
		//perulangan agar semua deret tengah ke kanan bisa dijumlahkan.
		for (int a = tengah + 1; a < tengah + 3; a++) {
			hasil = hasil - deret[a];
			System.out.print(" - " + deret[a]);
		}
		System.out.print(" = " + hasil);

	}

}
