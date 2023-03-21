package minggu5;

import java.util.Scanner;
public class MainFaktorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("========================================");
        System.out.print("Masukkan Jumlah Elemen Yang Ingin Dihitung: ");
        int elemen = sc.nextInt();

        Faktorial fk[] = new Faktorial[elemen];
        for (int i = 0; i < elemen; i++) {
            fk[i] = new Faktorial();
            System.out.print("Masukkan Nilai Data Ke-" + (i + 1) + ": ");
            fk[i].nilai = sc.nextInt();
        }

        System.out.println("========================================");
        System.out.println("Hasil Faktorial Dengan Brute Force");
        for (int i = 0; i < elemen; i++) {
            System.out.println("Faktorial Dari Nilai " + fk[i].nilai + " Adalah: " + fk[i].faktorialBF(fk[i].nilai));
        }

        System.out.println("========================================");
        System.out.println("Hasil Faktorial Dengan Divide and Conquer");
        for (int i = 0; i < elemen; i++) {
            System.out.println("Faktorial Dari Nilai " + fk[i].nilai + " Adalah: " + fk[i].faktorialDC(fk[i].nilai));
        }

        System.out.println("========================================");
        System.out.println("Hasil Faktorial Dengan Brute Force While");
        for (int i = 0; i < elemen; i++) {
            System.out.println("Faktorial Dari Nilai " + fk[i].nilai + " Adalah: " + fk[i].faktorialBFWhile(fk[i].nilai));
        }

        System.out.println("========================================");
    }
}
