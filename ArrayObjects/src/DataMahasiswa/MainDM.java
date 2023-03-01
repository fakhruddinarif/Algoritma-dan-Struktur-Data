package DataMahasiswa;

import java.util.Scanner;

public class MainDM {
    public static void main(String[] args) {
        Scanner scd = new Scanner(System.in);
        Scanner scs = new Scanner(System.in);
        DataMahasiswa[] dm = new DataMahasiswa[3];

        for (int i = 0; i < dm.length; i++) {
            int a = i + 1;
            dm[i] = new DataMahasiswa();
            System.out.println("Masukkan Data Mahasiswa Ke-" + a);
            System.out.print("Masukkan Nama         : ");
            dm[i].nama = scs.nextLine();
            System.out.print("Masukkan NIM          : ");
            dm[i].nim = scs.nextLine();
            System.out.print("Masukkan Jenis Kelamin: ");
            dm[i].jenisKelamin = scs.nextLine();
            System.out.print("Masukkan IPK          : ");
            dm[i].ipk = scd.nextDouble();
            System.out.println();
        }
        System.out.println();
        for (int i = 0; i < dm.length; i++) {
            int a = i + 1;
            System.out.println("Data Mahasiswa Ke-" + a);
            System.out.println("Nama         : " + dm[i].nama);
            System.out.println("NIM          : " + dm[i].nim);
            System.out.println("Jenis Kelamin: " + dm[i].jenisKelamin);
            System.out.println("Nilai IPK    : " + dm[i].ipk);
            System.out.println();
        }
    }
}
