package Tugas;

public class Struk {
    int noTransaksi;
    String tanggalBeli;
    int jumlahBarang;
    double hargaBayar;

    Struk(int noTransaksi, String tanggalBeli, int jumlahBarang, double hargaBayar) {
        this.noTransaksi = noTransaksi;
        this.tanggalBeli = tanggalBeli;
        this.jumlahBarang = jumlahBarang;
        this.hargaBayar = hargaBayar;
    }

    void display() {
        System.out.println("Nomor Transaksi    : " + noTransaksi);
        System.out.println("Tanggal Transaksi  : " + tanggalBeli);
        System.out.println("Jumlah Barang      : " + jumlahBarang);
        System.out.println("Total Pembayaran   : " + hargaBayar);
    }
}
