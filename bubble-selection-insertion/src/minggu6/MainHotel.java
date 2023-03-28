package minggu6;

import java.util.Scanner;

public class MainHotel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HotelService hs = new HotelService();
        Hotel hotel1 = new Hotel("Ascent Premiere Hotel and Convention", "Malang", 500000, (byte)5);
        Hotel hotel2 = new Hotel("The Alana Surabaya", "Surabaya", 450000, (byte)3);
        Hotel hotel3 = new Hotel("OYO", "Malang", 100000, (byte)2);
        Hotel hotel4 = new Hotel("Reddoorz", "Lumajang", 200000, (byte)1);
        Hotel hotel5 = new Hotel("Everyday", "Malang", 350000, (byte)4);

        hs.tambah(hotel1);
        hs.tambah(hotel2);
        hs.tambah(hotel3);
        hs.tambah(hotel4);
        hs.tambah(hotel5);

        System.out.println("Data Hotel Sekitar Jawa Timur");
        hs.tampilAll();

        System.out.println();
        System.out.println("Urutkan Berdasarkan: ");
        System.out.println("1. Harga");
        System.out.println("2. Rating");
        System.out.print("Pilih Metode Pengurutan: ");
        int input = sc.nextInt();
        if (input == 1) {
            System.out.println("Diurutkan Berdasarkan Harga");
            hs.bubbleSort();
            hs.tampilAll();
        }
        else if (input == 2) {
            System.out.println("Diurutkan Berdasarkan Rating");
            hs.selectionSort();
            hs.tampilAll();
        }
        else {
            System.out.println("Inputan Yang Anda Masukkan Tidak Sesuai");
        }
    }
}
