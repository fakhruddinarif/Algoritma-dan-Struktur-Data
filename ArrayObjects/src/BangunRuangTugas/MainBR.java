package BangunRuangTugas;
import java.util.Scanner;

public class MainBR {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Kerucut[] kerucut = new Kerucut[2];
        Limas[] limas = new Limas[2];
        Bola[] bola = new Bola[2];

        for (int i = 0; i < kerucut.length; i++) {
            System.out.print("Masukkan Jari-Jari Kerucut: ");
            double jjKr = sc.nextDouble();
            System.out.print("Masukkan Sisi Miring: ");
            double smKr = sc.nextDouble();
            kerucut[i] = new Kerucut(jjKr, smKr);
            System.out.println("Luas Permukaan Pada Kerucut Ke-" + i + ": " + kerucut[i].hitungLuas());
            System.out.println("Volume Permukaan Pada Kerucut Ke-" + i + ": " + kerucut[i].hitungVolume());
            System.out.println();


            System.out.print("Masukkan panjang Sisi Alas Limas: ");
            double psaLm = sc.nextDouble();
            System.out.print("Masukkan Tinggi Limas: ");
            double tLm = sc.nextDouble();
            limas[i] = new Limas(psaLm, tLm);
            System.out.println("Luas Permukaan Pada Limas Ke-" + i + ": " + limas[i].hitungLuas());
            System.out.println("Volume Permukaan Pada Limas Ke-" + i + ": " + limas[i].hitungVolume());
            System.out.println();

            System.out.print("Masukkan jari-jari Bola: ");
            double jjB = sc.nextDouble();
            bola[i] = new Bola(jjB);
            System.out.println("Luas Permukaan Pada Bola Ke-" + i + ": " + bola[i].hitungLuasPermukaan());
            System.out.println("Volume Permukaan Pada Bola Ke-" + i + ": " + bola[i].hitungVolume());
            System.out.println();
        }
    }
}
