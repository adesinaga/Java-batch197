package soalUjian197;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class SoalNo5 {

	public static Long

			betweenDates(LocalDate firstDate, LocalDate secondDate) throws IOException {

		return ChronoUnit.DAYS.between(firstDate, secondDate);
	}

	public static void main(String[] args) throws IOException {
		final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd MM yyyy");
		final BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Nama Buku:");
		final String namaBuku = reader.readLine();
		System.out.print("Durasi Peminjaman (hari):");
		final Long durasiPeminjaman = Long.parseLong(reader.readLine());
		System.out.println();

		System.out.print("Tgl mulai pinjam (dd MM yyyy): ");
		final String startDatePinjam = reader.readLine();

		System.out.print("Tgl berakhir pinjam (dd MM yyyy): ");
		final String endDatePinjam = reader.readLine();
		final LocalDate firstDate = LocalDate.parse(startDatePinjam, formatter);
		final LocalDate secondDate = LocalDate.parse(endDatePinjam, formatter);
		final Long days = betweenDates(firstDate, secondDate);
		Long denda = Long.MIN_VALUE;
		if (days > durasiPeminjaman) {
			denda = (days - durasiPeminjaman) * 100;
		}

		System.out.println();

		if (denda > 0) {

			System.out.println("Keterlambatan (hari): " + (days - durasiPeminjaman));

			System.out.println("Denda (keterlambatan x 100): " + denda);
		} else {

			System.out.println("Keterlambatan (hari): 0 ");

			System.out.println("Denda: 0");
		}

	}
}
