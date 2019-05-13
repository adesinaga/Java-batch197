package day06;

import day04.Orang;

public class MainOOP {
	public static void main(String[] args) {
	
		Mahasiswa mhs = new Mahasiswa();
		mhs.id = 1;
		mhs.nama = "ade";
		mhs.alamat = "medan";
		mhs.jk = "wanita";
		mhs.noTelp = "08236013xxxx";
		mhs.nim = "1234567890";
		mhs.jurusan = "komputer";
		mhs.fakultas = "teknik";
		mhs.angkatan = "2014";
		mhs.ipk = 3.2;
		
		Dosen dsn = new Dosen();
		dsn.id =1;
		dsn.nama = "Doddy";
		dsn.alamat="jakarta";
		dsn.jk = "L";
		dsn.noTelp = "081234657585";
		dsn.nip = "0987654321";
		dsn.golongan = "4a";
		dsn.gaji = 10000000;
		dsn.jabatan = "dosen";
		dsn.spesialis = "Jaringan";
		
		
		Staff stf = new Staff();
		stf.id = 1;
		stf.nama = "kharina";
		stf.alamat = "jakarta";
		stf.jk = "P";
		stf.noTelp = "08xxxxxxxxx";
		stf.nik = "6789054321";
		stf.departemen = "IT";
		Orang org01 = new Orang(4, "Bobby", "Cikarang", "L", "08xxxxxxxxxx");
		stf.atasan = new Orang (4, "Bobby", "Cikarang", "L", "08xxxxxxxxxx");
		stf.atasan = org01 ;
		
	 mhs.cetakData();
	 dsn.cetakData();
	 stf.cetakData();
		
	}
}
