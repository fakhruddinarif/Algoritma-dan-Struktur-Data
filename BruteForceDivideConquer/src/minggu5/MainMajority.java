package minggu5;

import java.util.Scanner;

public class MainMajority {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Majority mj = new Majority();
        String candidate[] = {"Haris", "Dian", "Rani", "Bisma"};

        System.out.print("Masukkan Jumlah Pemilih: ");
        int input = sc.nextInt();
        int arr[] = new int[input];

        for (int i = 0; i < candidate.length; i++) {
            System.out.printf("%d. %s\n", (i + 1), candidate[i]);
        }

        for (int i = 0; i < input; i++) {
            System.out.printf("Pemilih Ke-%d Memilih Kandidat (1 - 4): ", (i + 1));
            arr[i] = sc.nextInt();
        }

        int majority = mj.findMajority(arr, input);
        int countMajority = mj.count(arr, input, majority);
        int minMajority = input / 2 + 1;

        if (countMajority >= minMajority) {
            System.out.printf("Mayoritas Pemilih Memilih Nomor %d Dengan Nama %s Yang Mendapatkan Jumlah Suara Sebanyak %d\n", majority, candidate[majority - 1], countMajority);
        }
        else {
            System.out.println("Tidak Ada Kandidat Yang Memenuhi Syarat Mayoritas Suara");
        }
    }
}
