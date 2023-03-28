package minggu6;

public class Mahasiswa {
    String nama;
    int tahunMasuk, umur;
    double ipk;

    Mahasiswa(String nama, int tahunMasuk, int umur, double ipk) {
        this.nama = nama;
        this.tahunMasuk = tahunMasuk;
        this.umur = umur;
        this.ipk = ipk;
    }

    void tampil() {
        System.out.println("Nama       : " + nama);
        System.out.println("Tahun Masuk: " + tahunMasuk);
        System.out.println("Umur       : " + umur);
        System.out.println("IPK        : " + ipk);
    }
}
