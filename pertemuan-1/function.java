import java.util.Scanner;

public class function {
    static Scanner arif = new Scanner(System.in);
    static String store[] = {"RoyalGarden1", "RoyalGarden2", "RoyalGarden3", "RoyalGarden4"}; // Baris
    static String flower[] = {"Aglonema", "Keladi", "Alocasia", "Mawar"}; // Kolom
    static int stock[][] = {
            {10, 5, 15, 7},
            {6, 11, 9, 12},
            {2, 10, 10, 5},
            {5, 7, 12, 9}
    };
    public static void main(String[] args) {
        boolean run = true;
        while (run) {
            System.out.println("===== Royal Garden =====");
            System.out.println("1. Data Stock Bunga");
            System.out.println("2. Data Stock Berdasarkan Jenis Bunga");
            System.out.print("Pilih Data: ");
            int menu = arif.nextInt();
            if (menu == 1) {
                stockFlower();
            } else if (menu == 2) {
                stockJenis();
            } else {
                System.out.println("Menu Yang Anda Inputkan Tidak Tersedia");
            }
            System.out.println();
        }
    }
    static void stockFlower() {
        for (int i = 0; i < flower.length; i++) {
            if (i == 0) {
                System.out.printf("|%15s", " ");
            }
            System.out.printf("|%-15s", flower[i]);
        }
        System.out.println("|");
        for (int i = 0; i < stock.length; i++) {
            System.out.printf("|%-15s", store[i]);
            for (int j =0 ; j < stock[i].length; j++) {
                System.out.printf("|%-15d", stock[i][j]);
            }
            System.out.println("|");
        }
    }

    public static void stockJenis() {
        System.out.println("Pilih Jenis Bunga:");
        System.out.println("1. Aglonema");
        System.out.println("2. Keladi");
        System.out.println("3. Alocasia");
        System.out.println("4. Mawar");
        int total = 0;
        System.out.print("Masukkan pilihan : ");
        int menu = arif.nextInt();
        if (menu < 5 && menu > 0) {
            for (int i = 0; i < flower.length; i++) {
                System.out.println(store[i] + " : " + stock[i][menu - 1]);
                total = total + stock[i][menu - 1];
                if(menu > 4) {
                    System.out.println("Pilihan Anda tidak tersedia");
                }
            }
        } else System.out.println("Pilihan Anda tidak tersedia");
        System.out.println("==================================");
        System.out.println("Total stock : " + total + "\n");
    }
}
