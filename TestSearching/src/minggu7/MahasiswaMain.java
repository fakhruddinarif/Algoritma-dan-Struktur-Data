package minggu7;

import java.util.Scanner;

public class MahasiswaMain {
    public static void main(String[] args) {
        Scanner scd = new Scanner(System.in);
        Scanner scs = new Scanner(System.in);

        System.out.print("Masukkan Jumlah Mahasiswa: ");
        int jumlah = scd.nextInt();
        PencarianMhs data = new PencarianMhs(jumlah);
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
        data.mergeSort();
        System.out.println("=============================================");
        System.out.println("Data Keselurahan Mahasiswa");
        data.tampil();

        System.out.println("_____________________________________________");
        System.out.println("Pencarian Data : ");
        System.out.println("Masukkan Nama Mahasiswa yang dicari: ");
        System.out.print("Nama : ");
        String search = scs.nextLine();
        System.out.println("Menggunakan Sequential Search");
        int posisi = data.FindSeqSearch(search);
        data.TampilPosisi(search, posisi);
        data.TampilData(search, posisi);
        System.out.println("==============================");

        /*System.out.println("_____________________________________________");
        System.out.println("Menggunakan Binary Search");
        posisi = data.FindBinarySearch(search, 0, jumlah - 1);
        data.TampilPosisi(search, posisi);
        data.TampilData(search, posisi);*/
    }
}
