package Tugas;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scd = new Scanner(System.in);
        Scanner scs = new Scanner(System.in);

        boolean run = true;
        boolean runMenu = true;

        while (run) {
            System.out.print("Masukkan Size Stack: ");
            int sizeStack = scd.nextInt();
            List list = new List(sizeStack);

            do {
                System.out.print("Masukkan Nomor Transaksi   : ");
                int noTransaksi = scd.nextInt();
                System.out.print("Masukkan Tanggal Transaksi : ");
                String tanggal = scs.nextLine();
                System.out.print("Masukkan Jumlah Barang     : ");
                int jumlahBarang = scd.nextInt();
                System.out.print("Masukkan Total Bayar       : ");
                double hargaBayar = scd.nextDouble();
                Struk struk = new Struk(noTransaksi, tanggal, jumlahBarang, hargaBayar);
                list.push(struk);
                System.out.println();
            } while (!list.IsFull());

            while (runMenu) {
                System.out.println("Pilihan Menu Data Struk");
                System.out.println("1. Lihat Data Semua Struk");
                System.out.println("2. Tukar Struk");
                System.out.print("Pilih Menu: ");
                int selectMenu = scd.nextInt();
                if (selectMenu == 1) {
                    list.print();
                } else if (selectMenu == 2) {
                    list.pop();
                } else {
                    System.out.println("Maaf Menu Yang Anda Masukkan Salah");
                }
                System.out.print("Apakah Anda Ingin Mengulangi Inputan Menu (y/n)?: ");
                String ulangTukar = scs.nextLine();
                if (ulangTukar.charAt(0) == 'n' || ulangTukar.charAt(0) == 'N') {
                    runMenu = false;
                }
            }
            System.out.print("Apakah Anda Ingin Mengulangi Inputan Size Stack (y/n)?: ");
            String ulangSetting = scs.nextLine();
            if (ulangSetting.charAt(0) == 'n' || ulangSetting.charAt(0) == 'N') {
                run = false;
            }
        }
    }
}
