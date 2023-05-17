package Tugas2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scd = new Scanner(System.in);
        Scanner scs = new Scanner(System.in);
        boolean run = true;
        FilmList filmList = new FilmList();
        while (run) {
            menu();
            int menu = scd.nextInt();
            if (menu >= 1 && menu <= 3) {
                System.out.print("ID     : ");
                int id = scd.nextInt();
                System.out.print("Judul  : ");
                String judul = scs.nextLine();
                System.out.print("Rating : ");
                double rating = scd.nextDouble();
                if (menu == 1) {
                    filmList.addFirst(new Film(id, judul, rating));
                }
                else if (menu == 2) {
                    filmList.addLast(new Film(id, judul, rating));
                }
                else if (menu == 3) {
                    System.out.print("Data Film Ini Akan Masuk Di Urutan Ke-: ");
                    int index = scd.nextInt();
                    filmList.add(new Film(id, judul, rating), index);
                }
            }
            else if (menu == 4) {
                filmList.removeFirst();
            }
            else if (menu == 5) {
                filmList.removeLast();
            }
            else if (menu == 6) {
                System.out.print("Masukkan Index: ");
                int index = scd.nextInt();
                filmList.remove(index);
            }
            else if (menu == 7) {
                filmList.print();
            }
            else if (menu == 8) {
                System.out.print("Masukkan ID Film Yang Dicari: ");
                int id = scd.nextInt();
                Film data = filmList.search(id);
                System.out.println("Data ID Film " + data.id + " Berada Di Node Ke-" + filmList.getNode(id));
                System.out.println("IDENTITAS:");
                System.out.println("ID Film     : " + data.id);
                System.out.println("Judul Film  : " + data.judul);
                System.out.println("Rating Film : " + data.rating);
            }
            else if (menu == 9) {
                filmList.sortFilm();
            }
            else if (menu == 10) {
                System.out.print("Apakah Anda Yakin Ingin Keluar? (y/n): ");
                String logout = scs.nextLine();
                if (logout.toLowerCase().charAt(0) == 'y') run = false;
            }
            else {
                System.out.println("Menu Yang Anda Inputkan Tidak Tersedia");
            }
        }
    }
    static void menu() {
        System.out.println("===========================================");
        System.out.println("DATA FILM LAYAR LEBAR");
        System.out.println("===========================================");
        System.out.println("1. Tambah Data Awal");
        System.out.println("2. Tambah Data Akhir");
        System.out.println("3. Tambah Data Index Tertentu");
        System.out.println("4. Hapus Data Pertama");
        System.out.println("5. Hapus Data Terakhir");
        System.out.println("6. Hapus Data Tertentu");
        System.out.println("7. Cetak");
        System.out.println("8. Cari ID Film");
        System.out.println("9. Urut Data Rating Film-DESC");
        System.out.println("10. Keluar");
        System.out.println("===========================================");
    }
}
