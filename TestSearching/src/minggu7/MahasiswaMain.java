package minggu7;

import java.util.Scanner;

public class MahasiswaMain {
    public static void main(String[] args) {
        Scanner scd = new Scanner(System.in);
        Scanner scs = new Scanner(System.in);

        PencarianMhs data = new PencarianMhs();
        int jumlah = 5;
        System.out.println("=============================================");
        System.out.println("Masukkan Data Mahasiswa Secara urut Dari NIM Terkecil");
        for (int i = 0; i < jumlah; i++) {
            System.out.println("=============================================");
            System.out.print("NIM\t: ");
            int nim = scd.nextInt();
            System.out.print("Nama\t: ");
            String nama = scs.nextLine();
            System.out.print("Umur\t: ");
            int umur = scd.nextInt();
            System.out.print("IPK\t: ");
            double ipk = scd.nextDouble();

            Mahasiswa mhs = new Mahasiswa(nim, nama, umur, ipk);
            data.tambah(mhs);
        }
        System.out.println("=============================================");
        System.out.println("Data Keselurahan Mahasiswa");
        data.tampil();

        System.out.println("_____________________________________________");
        System.out.println("_____________________________________________");
        System.out.println("Pencarian Data:");
        System.out.println("Masukkan NIM Mahasiswa Yang Dicari");
        System.out.print("NIM: ");
        int search = scd.nextInt();
        System.out.println("Menggunakan Sequential Search");
        int posisi = data.FindSeqSearch(search);

        data.TampilPosisi(search, posisi);
        data.TampilData(search, posisi);
    }
}
