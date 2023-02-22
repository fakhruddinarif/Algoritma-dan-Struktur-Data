package minggu2;

public class FilmMain {
    public static void main(String[] args) {
        Film film1 = new Film();
        film1.judul = "Quantumania Mancing";
        film1.genre = "Action Comedy";
        film1.rate = "Remaja";
        film1.jumlahTiket = 3000;
        film1.hargaTiket = 40000;

        film1.tambahTiket(1);
        film1.kurangiTiket(3);
        film1.tampilFilm();

        System.out.println();
        int income = film1.totalRevenue();
        System.out.printf("Total Keuntungan Tiket: Rp. %,d\n", income);

        System.out.println("=========================");
        Film film2 = new Film("ManiaQuantum", "Horror", "Dewasa", 2000, 40000);
        film2.tampilFilm();
    }
}
