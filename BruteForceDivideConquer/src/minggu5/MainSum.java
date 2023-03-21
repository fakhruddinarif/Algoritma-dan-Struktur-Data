package minggu5;

import java.util.Scanner;

public class MainSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("========================================");
        System.out.println("Program menghitung Keuntungan Total (Satuan Juta. Misal 5.9)");
        System.out.print("Masukkan Jumlah Perusahaan: ");
        int inputPerusahaan = sc.nextInt();
        for (int j = 0; j < inputPerusahaan; j++) {
            System.out.println("========================================");
            System.out.println("Perusahaan Ke-" + (j + 1));
            System.out.print("Masukkan Jumlah Bulan: ");
            int elm = sc.nextInt();

            Sum sm = new Sum(elm);
            System.out.println("========================================");
            for (int i = 0; i < sm.elemen; i++) {
                System.out.print("Masukkan Untung Bulan Ke-" + (i + 1) + "= ");
                sm.keuntungan[i] = sc.nextDouble();
            }

            System.out.println("========================================");
            System.out.println("Algoritma Brute Force");
            System.out.printf("Total Keuntungan Perusahaan Selema %d Bulan Adalah = %.2f\n", sm.elemen, sm.totalBF(sm.keuntungan));
            System.out.println("========================================");
            System.out.println("Algoritma Divide Conquer");
            System.out.printf("Total Keuntungan Perusahaan Selama %d Bulan Adalah = %.2f\n", sm.elemen, sm.totalDC(sm.keuntungan, 0, sm.elemen - 1));
        }
    }
}
