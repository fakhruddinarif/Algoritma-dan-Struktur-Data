import java.util.Scanner;

public class decision {
    public static void main(String[] args) {
        Scanner arif = new Scanner(System.in);

        System.out.println("===========================");
        System.out.println("Program Menghitung Nilai Akhir");
        System.out.println("===========================");

        System.out.print("Masukkan Nilai Tugas: ");
        double inputTugas17 = arif.nextDouble();
        System.out.print("Masukkan Nilai UTS  : ");
        double inputUts17 = arif.nextDouble();
        System.out.print("Masukkan Nilai UAS  : ");
        double inputUas17 = arif.nextDouble();

        /*
        * 20 % = Tugas, 35% = UTS, 45% = UAS
        *
        * 100 - 81 = A
        * 80 - 74 = B+
        * 73 - 64 = B
        * 65 - 61 = C+
        * 60 - 51 = C
        * 50 - 40 = D
        * 40 - 0 = E
        * */
        System.out.println("===========================");
        double tugas17 = inputTugas17 * 20 / 100;
        double uts17 = inputUts17 * 35 / 100;
        double uas17 = inputUas17 * 45 / 100;

        double result17 = tugas17 + uts17 + uas17;
        System.out.print("Nilai Akhir: ");
        System.out.println(result17);
        System.out.print("Nilai Huruf: ");
        String nilaiHuruf17 = "";

        if (result17 <= 100 && result17 > 80) {
            nilaiHuruf17 = "A";
        }
        else if (result17 <= 80 && result17 > 73) {
            nilaiHuruf17 = "B+";
        }
        else if (result17 <= 73 && result17 > 65) {
            nilaiHuruf17 = "B";
        }
        else if (result17 <= 65 && result17 > 60) {
            nilaiHuruf17 = "C+";
        }
        else if (result17 <= 60 && result17 > 50) {
            nilaiHuruf17 = "C";
        }
        else if (result17 <= 50 && result17 > 39) {
            nilaiHuruf17 = "D";
        }
        else if (result17 <= 39 && result17 >= 0) {
            nilaiHuruf17 = "E";
        }
        else {
            System.out.println("Nilai Yang Anda Input-Kan Salah");
        }
        System.out.println(nilaiHuruf17);

        System.out.println("===========================");
        if (nilaiHuruf17 != "D" || nilaiHuruf17 != "E") {
            System.out.println("SELAMAT LULUS");
        }
        else {
            System.out.println("ANDA DINYATAKAN TIDAK LULUS");
        }
    }
}