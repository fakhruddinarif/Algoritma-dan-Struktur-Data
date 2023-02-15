import java.util.Scanner;

public class loop {
    public static void main(String[] args) {
        Scanner arif = new Scanner(System.in);
        String days[] = {"Senin", "Selasa", "Rabu", "Kamis", "Jum'at", "Sabtu", "Minggu"};

        System.out.print("Masukkan NIM: ");
        long nim17 = arif.nextLong();

        long result17 = nim17 % 100;
        if (result17 < 10) {
            result17 += 10;
        }

        for (int i = 0; i <= result17; i++) {
            System.out.printf("%s\t", days[i % 7]);
        }
    }
}
