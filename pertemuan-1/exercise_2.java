import java.util.Scanner;

public class exercise_2 {
    static Scanner arif = new Scanner(System.in);
    public static void main(String[] args) {
        menu();
    }
    static void menu() {
        boolean run = true;
        while (run) {
            System.out.println("Menu Menghitung (Kecepatan, Jarak, dan Waktu):");
            System.out.println("1. Kecepatan");
            System.out.println("2. Jarak");
            System.out.println("3. Waktu");
            System.out.println("======================================");
            System.out.print("Pilih Perhitungan: ");
            int menu = arif.nextInt();
            if (menu == 1) {
                System.out.print("Masukkan Jarak: ");
                double jarak = arif.nextDouble();
                System.out.print("Masukkan Waktu: ");
                double waktu = arif.nextDouble();
                System.out.println("======================================");
                double result = kecepatan(jarak, waktu);
                System.out.printf("Hasil Perhitungan Kecepatan: %,.2f\n", result);
            }
            else if (menu == 2) {
                System.out.print("Masukkan Kecepatan: ");
                double kecepatan = arif.nextDouble();
                System.out.print("Masukkan Waktu: ");
                double waktu = arif.nextDouble();
                System.out.println("======================================");
                double result = jarak(kecepatan, waktu);
                System.out.printf("Hasil Perhitungan Jarak: %,.2f\n", result);
            }
            else if (menu == 3) {
                System.out.print("Masukkan Jarak: ");
                double jarak = arif.nextDouble();
                System.out.print("Masukkan Kecepatan: ");
                double kecepatan = arif.nextDouble();
                System.out.println("======================================");
                double result = waktu(jarak, kecepatan);
                System.out.printf("Hasil Perhitungan Waktu: %,.2f\n", result);
            }
            else {
                System.out.println("Input Menu Yang Anda Masukkan Tidak Tersedia");
            }
            System.out.println("======================================");
        }
    }
    static double kecepatan(double s, double t) {
        return s / t;
    }
    static double jarak(double v, double t) {
        return v * t;
    }
    static double waktu(double s, double v) {
        return s / v;
    }
}
