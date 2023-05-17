package Tugas1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scd = new Scanner(System.in);
        Scanner scs = new Scanner(System.in);

        Queue queue = new Queue();
        boolean run = true;
        while (run) {
            menu();
            System.out.print("Pilih Menu: ");
            int menu = scd.nextInt();
            switch (menu) {
                case 1:
                    System.out.print("Masukkan Nomor Antrian: ");
                    int nomor = scd.nextInt();
                    System.out.print("Masukkan Nama pasien: ");
                    String nama = scs.nextLine();
                    Pasien pasien = new Pasien(nomor, nama);
                    queue.enqueue(pasien);
                    System.out.println();
                    break;
                case 2:
                    Node user = queue.dequeue();
                    if (user != null) {
                        System.out.println(user.data.nama + " Telah Selesai Vaksinasi");
                    }
                    print(queue);
                    break;
                case 3:
                    print(queue);
                    break;
                case 4:
                    System.out.print("Apakah Anda Yakin Ingin Keluar? (y/n): ");
                    String logout = scs.nextLine();
                    if (logout.toLowerCase().charAt(0) == 'y') run = false;
                    break;
                default:
                    System.out.println("Menu Yang Anda Masukkan Tidak Tersedia");
                    System.out.println();
                    break;
            }
        }
    }
    static void menu() {
        System.out.println("=============================");
        System.out.println("PENGANTRI VAKSIN EXTRAVAGANZA");
        System.out.println("=============================");
        System.out.println("1. Tambah Data Penerima Vaksin");
        System.out.println("2. Hapus Data Pengantri Vaksin");
        System.out.println("3. Daftar Penerima Vaksin");
        System.out.println("4. Keluar");
        System.out.println("=============================");
    }
    static void print(Queue queue) {
        System.out.println("Antrian Vaksinasi:");
        queue.print();
        System.out.println("Sisa Antrian: " + queue.get());
        System.out.println();
    }
}
