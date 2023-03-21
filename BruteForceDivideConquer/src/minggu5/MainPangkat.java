package minggu5;

import java.util.Scanner;

public class MainPangkat {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("========================================");
            System.out.print("Masukkan Jumlah Elemen Yang Ingin Dihitung: ");
            int elemen = sc.nextInt();
            Pangkat[] png = new Pangkat[elemen];

            for (int i = 0; i < elemen; i++) {
                System.out.print("Masukkan Nilai Yang Akan Dipangkatkan Ke-" + (i + 1) + ": ");
                int nilai = sc.nextInt();
                ;
                System.out.print("Masukkan Nilai Pemangkat Ke-" + (i + 1) + ": ");
                int pangkat = sc.nextInt();
                png[i] = new Pangkat(nilai, pangkat);
            }

            System.out.println("1. Hasil Pangkat Dengan Brute Force");
            System.out.println("2. Hasil Pangkat Dengan Divide and Conquer");
            System.out.print("Masukkan Hasil Yang Diiinginkan: ");
            int select = sc.nextInt();;

            if(select == 1) {
                System.out.println("========================================");
                System.out.println("Hasil Pangkat Dengan Brute Force");
                for (int i = 0; i < elemen; i++) {
                    System.out.println("Nilai " + png[i].nilai + " Pangkat " + png[i].pangkat + " Adalah: " + png[i].pangkatBF(png[i].nilai, png[i].pangkat));
                }
            }

            else if (select == 2) {
                System.out.println("========================================");
                System.out.println("Hasil Pangkat Dengan Divide and Conquer");
                for (int i = 0; i < elemen; i++) {
                    System.out.println("Nilai " + png[i].nilai + " Pangkat " + png[i].pangkat + " Adalah: " + png[i].pangkatDC(png[i].nilai, png[i].pangkat));
                }
            }

            System.out.println("========================================");
    }
}
