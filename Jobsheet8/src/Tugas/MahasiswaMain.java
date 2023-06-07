package Tugas;

import java.util.Scanner;

public class MahasiswaMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan Kapasitas Queue: ");
        int capasity = sc.nextInt();
        Queue antrian = new Queue(capasity);

        int pilih;
        do {
            menu();
            System.out.print("Pilih Menu: ");
            pilih = sc.nextInt();
            sc.nextLine();
            switch (pilih) {
                case 1:
                    System.out.print("NIM: ");
                    String nim = sc.nextLine();
                    System.out.print("Nama: ");
                    String nama = sc.nextLine();
                    System.out.print("Absen: ");
                    int absen = sc.nextInt();
                    System.out.print("IPK: ");
                    double ipk = sc.nextDouble();
                    Mahasiswa mhs = new Mahasiswa(nim, nama, absen, ipk);
                    sc.nextLine();
                    antrian.Enqueue(mhs);
                    break;
                case 2:
                    Mahasiswa data = antrian.Dequeue();
                    if (!"".equals(data.nama) && !"".equals(data.nim) && data.absen != 0 && data.ipk != 0) {
                        System.out.println("Antrian Mahasiswa Keluar: ");
                        System.out.println("NIM     : " + data.nim);
                        System.out.println("Nama    : " + data.nama);
                        System.out.println("Absen   : " + data.absen);
                        System.out.println("IPK     : " + data.ipk);
                    }
                    break;
                case 3:
                    antrian.peek();
                    break;
                case 4:
                    antrian.peekRear();
                    break;
                case 5:
                    System.out.print("Masukkan NIM: ");
                    String inputnim = sc.nextLine();
                    antrian.peekPosition(inputnim);
                    break;
                case 6:
                    System.out.print("Masukkan Posisi: ");
                    int inputPosisi = sc.nextInt();
                    antrian.printMahasiswa(inputPosisi);
                    sc.nextLine();
                case 7:
                    antrian.print();
                    break;
            }
        } while (pilih > 0 && pilih < 8);
    }
    static void menu() {
        System.out.println("1. Antrian Baru");
        System.out.println("2. Antrian Keluar");
        System.out.println("3. Cek Antrian Terdepan");
        System.out.println("4. Cek Antrian Belakang");
        System.out.println("5. Cari Antrian Berdasakan NIM");
        System.out.println("6. Menampilkan Data Berdasarkan Posisi");
        System.out.println("7. Tampil Semua Antrian");
        System.out.println("------------------------------------------------");
    }
}
