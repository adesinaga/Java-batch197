package day04;

public class Orang {

	public int id;
	public String nama;
	public String alamat;
	public String jk;
	public String noTelp;

	// method overloading karna lebih dr 1
	public Orang() {

	}

	public Orang(int id, String nama, String alamat, String jk, String noTelp) {
		this.id = id;
		this.nama = nama;
		this.alamat = alamat;
		this.jk = jk;
		this.noTelp = noTelp;
	}

	// untuk memanggil class panggil orang
	panggilOrang org = new panggilOrang();
	// untuk memasukkan n ke dalam class orang
	int n = org.n;
	// buat array dari semua static/properti
	public int[] arrayId = new int[n];
	public String[] arrayNama = new String[n];
	public String[] arrayAlamat = new String[n];
	public String[] arrayJK = new String[n];
	public String[] arrayNotelp = new String[n];

	public void cetakData() {
		System.out.println(" id :" + id);
		System.out.println("nama :" + nama);
		System.out.println("alamat :" + alamat);
		System.out.println("jk :" + jk);
		System.out.println("nomor telpon :" + noTelp);
	}

public int perhitungan(int a, int b, int c) {
	return a+b+c;

}
}
