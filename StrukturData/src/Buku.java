public class Buku {
    String nama, pengarang, penerbit;
    int hargaSatuan, jumlah;

    int hitungHargaTotal() {
        return hargaSatuan * jumlah;
    }
    int hitungDiskon() {
        int total = hitungHargaTotal();
        int result = 0;
        if (total > 100000) {
            result = total * 10 / 100;
        }
        else if (total >= 50000 && total <= 100000) {
            result = total * 5 / 100;
        }
        return result;
    }
    int hitungHargaBayar() {
        int total = hitungHargaTotal();
        int diskon = hitungDiskon();
        return total - diskon;
    }

    public static void main(String[] args) {
        Buku buku = new Buku();
        buku.nama = "Nanti Kita Cerita Hari Ini";
        buku.pengarang = "Marchlla FP";
        buku.penerbit = "POP Publishers";
        buku.hargaSatuan = 90000;
        buku.jumlah = 50;

        System.out.println("==========================================");
        System.out.println("Nama Buku     : " + buku.nama);
        System.out.println("Pengarang Buku: " + buku.pengarang);
        System.out.println("Penerbit Buku : " + buku.penerbit);
        System.out.println("Harga Buku    : " + buku.hargaSatuan);
        System.out.println("Jumlah Buku   : " + buku.jumlah);
        System.out.println("==========================================");
        int total = buku.hitungHargaTotal();
        int diskon = buku.hitungDiskon();
        int bayar = buku.hitungHargaBayar();
        System.out.printf("Harga Total Pembelian   : Rp. %,d\n", total);
        System.out.printf("Diskon Pembelian        : Rp. %,d\n", diskon);
        System.out.printf("Total Yang Harus Dibayar: Rp. %,d\n", bayar);
        System.out.println("==========================================");
    }
}
